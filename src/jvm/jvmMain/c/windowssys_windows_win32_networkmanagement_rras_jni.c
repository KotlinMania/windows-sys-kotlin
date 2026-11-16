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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmAddGroupMembershipEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwsourceaddr, (uint32_t)dwsourcemask, (uint32_t)dwgroupaddr, (uint32_t)dwgroupmask, (uint32_t)dwifindex, (uint32_t)dwifnexthopipaddr, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong hprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeRegisterMProtocol");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwsourceaddr, jint dwsourcemask, jint dwgroupaddr, jint dwgroupmask, jint dwifindex, jint dwifnexthopipaddr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmDeleteGroupMembershipEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwsourceaddr, (uint32_t)dwsourcemask, (uint32_t)dwgroupaddr, (uint32_t)dwgroupmask, (uint32_t)dwifindex, (uint32_t)dwifnexthopipaddr, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwsourceaddr;
    (void)dwsourcemask;
    (void)dwgroupaddr;
    (void)dwgroupmask;
    (void)dwifindex;
    (void)dwifnexthopipaddr;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfe");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetFirstMfeStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfe");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pimm, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimm, jlong pdwbuffersize, jlong pbbuffer, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetMfeStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pimm, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimm;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfe");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pimmstart, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(JNIEnv* km_env, jclass km_clazz, jlong pimmstart, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetNextMfeStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pimmstart, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pimmstart;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(JNIEnv* km_env, jclass km_clazz, jint dwifindex, jint dwifnexthopaddr, jlong pdwifprotocolid, jlong pdwifcomponentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGetProtocolOnInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwifindex, (uint32_t)dwifnexthopaddr, (void*)(uintptr_t)pdwifprotocolid, (void*)(uintptr_t)pdwifcomponentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwifindex;
    (void)dwifnexthopaddr;
    (void)pdwifprotocolid;
    (void)pdwifcomponentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationEnd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong pdwbuffersize, jlong pbbuffer, jlong pdwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationGetNext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)pdwbuffersize, (void*)(uintptr_t)pbbuffer, (void*)(uintptr_t)pdwnumentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)henum;
    (void)pdwbuffersize;
    (void)pbbuffer;
    (void)pdwnumentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint metenumtype, jlong phenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmGroupEnumerationStart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol, (int32_t)metenumtype, (void*)(uintptr_t)phenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)metenumtype;
    (void)phenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(JNIEnv* km_env, jclass km_clazz, jlong prpiinfo, jint dwprotocolid, jint dwcomponentid, jlong phprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmRegisterMProtocol");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prpiinfo, (uint32_t)dwprotocolid, (uint32_t)dwcomponentid, (void*)(uintptr_t)phprotocol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prpiinfo;
    (void)dwprotocolid;
    (void)dwcomponentid;
    (void)phprotocol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmReleaseInterfaceOwnership");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwifindex, (uint32_t)dwifnexthopaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(JNIEnv* km_env, jclass km_clazz, jlong hprotocol, jint dwifindex, jint dwifnexthopaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MgmTakeInterfaceOwnership");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprotocol, (uint32_t)dwifindex, (uint32_t)dwifnexthopaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprotocol;
    (void)dwifindex;
    (void)dwifnexthopaddr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminBufferFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionClearStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong pobjectheader, jint dwpreferedmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong pprasconn, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionEnumEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)pobjectheader, (uint32_t)dwpreferedmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)pprasconn, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)pobjectheader;
    (void)dwpreferedmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)pprasconn;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionGetInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)prasconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jint fisipaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminConnectionRemoveQuarantine");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasserver, (void*)(uintptr_t)hrasconnection, (int32_t)fisipaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)fisipaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeregisterConnectionNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)heventnotification);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jlong lpdwtotalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminDeviceEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (void*)(uintptr_t)lpdwtotalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)lpdwtotalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminEstablishDomainRasServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdomain, (void*)(uintptr_t)pszmachine, (int32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)benable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(JNIEnv* km_env, jclass km_clazz, jint dwerror, jlong lplpwserrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetErrorString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwerror, (void*)(uintptr_t)lplpwserrorstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwerror;
    (void)lplpwserrorstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(JNIEnv* km_env, jclass km_clazz, jlong lpszdomain, jlong lpszserver, jlong lpszpdcserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminGetPDCServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszpdcserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszdomain;
    (void)lpszserver;
    (void)lpszpdcserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong hevent, jint fsynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)hevent, (int32_t)fsynchronous);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)hevent;
    (void)fsynchronous;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer, jlong phinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer, (void*)(uintptr_t)phinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDelete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lplpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwindex, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lplpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwindex, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDeviceSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwindex, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwindex;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceDisconnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwspassword, jlong lpwsdomainname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)lpwsusername, (void*)(uintptr_t)lpwspassword, (void*)(uintptr_t)lpwsdomainname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwspassword;
    (void)lpwsdomainname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCredentialsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetCustomInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong lpwsinterfacename, jlong phinterface, jint fincludeclientinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)phinterface, (int32_t)fincludeclientinterfaces);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)lpwsinterfacename;
    (void)phinterface;
    (void)fincludeclientinterfaces;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong lpdwupdateresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceQueryUpdateResult");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwprotocolid, (void*)(uintptr_t)lpdwupdateresult);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)lpdwupdateresult;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong lpwsserver, jlong lpwsinterfacename, jlong lpwsusername, jlong lpwsdomainname, jlong lpwspassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsserver, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)lpwsusername, (void*)(uintptr_t)lpwsdomainname, (void*)(uintptr_t)lpwspassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsserver;
    (void)lpwsinterfacename;
    (void)lpwsusername;
    (void)lpwsdomainname;
    (void)lpwspassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCredentialsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetCustomInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (void*)(uintptr_t)pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)ppinterfaceinfo, (void*)(uintptr_t)lpdwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportRemove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwtransportid, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceTransportSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwtransportid;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdatePhonebookInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hinterface, jint dwprotocolid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminInterfaceUpdateRoutes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hinterface, (uint32_t)dwprotocolid, (void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hinterface;
    (void)dwprotocolid;
    (void)hevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(JNIEnv* km_env, jclass km_clazz, jlong pszdomain, jlong pszmachine, jlong pbisrasserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsDomainRasServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdomain, (void*)(uintptr_t)pszmachine, (void*)(uintptr_t)pbisrasserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdomain;
    (void)pszmachine;
    (void)pbisrasserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong fisserviceinitialized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceInitialized");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)fisserviceinitialized);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)fisserviceinitialized;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminIsServiceRunning");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsservername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwsservername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBBufferFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwpid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwpid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwpid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryDelete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetFirst");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpinentry, jint dwinentrysize, jlong lplpoutentry, jlong lpoutentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntryGetNext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpinentry, (uint32_t)dwinentrysize, (void*)(uintptr_t)lplpoutentry, (void*)(uintptr_t)lpoutentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpinentry;
    (void)dwinentrysize;
    (void)lplpoutentry;
    (void)lpoutentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(JNIEnv* km_env, jclass km_clazz, jlong hmibserver, jint dwprotocolid, jint dwroutingpid, jlong lpentry, jint dwentrysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBEntrySet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmibserver, (uint32_t)dwprotocolid, (uint32_t)dwroutingpid, (void*)(uintptr_t)lpentry, (uint32_t)dwentrysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmibserver;
    (void)dwprotocolid;
    (void)dwroutingpid;
    (void)lpentry;
    (void)dwentrysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmibserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmibserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmibserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmibserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminMIBServerDisconnect");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)hmibserver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmibserver;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortClearStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortDisconnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hrasconnection, jlong lplpbbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)lplpbbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hrasconnection;
    (void)lplpbbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jint dwlevel, jlong hport, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (uint32_t)dwlevel, (void*)(uintptr_t)hport, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)dwlevel;
    (void)hport;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminPortReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong heventnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminRegisterConnectionNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)heventnotification);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)heventnotification;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong hconnection, jlong lpwszmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminSendUserMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)hconnection, (void*)(uintptr_t)lpwszmessage);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)hconnection;
    (void)lpwszmessage;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmprserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmprserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerDisconnect");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)hmprserver);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmprserver;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerGetInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminServerSetInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (void*)(uintptr_t)pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)ppglobalinfo, (void*)(uintptr_t)lpdwglobalinfosize, (void*)(uintptr_t)ppclientinterfaceinfo, (void*)(uintptr_t)lpdwclientinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwtransportid, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminTransportSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwtransportid, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwtransportid;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasserver, jlong hrasconnection, jlong prasupdateconnection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUpdateConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hrasserver, (void*)(uintptr_t)hrasconnection, (void*)(uintptr_t)prasupdateconnection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasserver;
    (void)hrasconnection;
    (void)prasupdateconnection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszuser, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszserver, jlong lpszuser, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprAdminUserSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszserver, (void*)(uintptr_t)lpszuser, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszserver;
    (void)lpszuser;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigBufferFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (uint32_t)dwtransportid, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jint dwtransportid, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigFilterSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (uint32_t)dwtransportid, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)dwtransportid;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszguidname, jlong pszbuffer, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetFriendlyName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pszguidname, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pszguidname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pszfriendlyname, jlong pszbuffer, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigGetGuidName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pszfriendlyname, (void*)(uintptr_t)pszbuffer, (uint32_t)dwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pszfriendlyname;
    (void)pszbuffer;
    (void)dwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lpbbuffer, jlong phrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer, (void*)(uintptr_t)phrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lpbbuffer;
    (void)phrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceDelete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetCustomInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwsinterfacename, jlong phrouterinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwsinterfacename, (void*)(uintptr_t)phrouterinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwsinterfacename;
    (void)phrouterinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jlong lpdwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)lpdwbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)lpdwbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong pcustominfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetCustomInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)pcustominfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)pcustominfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong lpwstransportname, jlong pinterfaceinfo, jint dwinterfaceinfosize, jlong phrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize, (void*)(uintptr_t)phrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)lpwstransportname;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    (void)phrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jint dwtransportid, jlong phrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (uint32_t)dwtransportid, (void*)(uintptr_t)phrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)dwtransportid;
    (void)phrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong ppinterfaceinfo, jlong lpdwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport, (void*)(uintptr_t)ppinterfaceinfo, (void*)(uintptr_t)lpdwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)ppinterfaceinfo;
    (void)lpdwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportRemove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hrouterinterface, jlong hrouteriftransport, jlong pinterfaceinfo, jint dwinterfaceinfosize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigInterfaceTransportSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hrouterinterface, (void*)(uintptr_t)hrouteriftransport, (void*)(uintptr_t)pinterfaceinfo, (uint32_t)dwinterfaceinfosize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hrouterinterface;
    (void)hrouteriftransport;
    (void)pinterfaceinfo;
    (void)dwinterfaceinfosize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerBackup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwspath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(JNIEnv* km_env, jclass km_clazz, jlong lpwsservername, jlong phmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwsservername, (void*)(uintptr_t)phmprconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpwsservername;
    (void)phmprconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerDisconnect");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hmprconfig);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hmprconfig;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong pserverinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerGetInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)pserverinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)pserverinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(JNIEnv* km_env, jclass km_clazz, jint dwlevel, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerInstall");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwlevel, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwlevel;
    (void)pbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRefresh");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong lpwspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerRestore");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)lpwspath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)lpwspath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprserver, jint dwlevel, jlong lpbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmprserver, (uint32_t)dwlevel, (void*)(uintptr_t)lpbbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprserver;
    (void)dwlevel;
    (void)lpbbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong psetserverconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigServerSetInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)psetserverconfig);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)psetserverconfig;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong lpwstransportname, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath, jlong phroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwtransportid, (void*)(uintptr_t)lpwstransportname, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath, (void*)(uintptr_t)phroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportDelete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwlevel, jlong lplpbuffer, jint dwprefmaxlen, jlong lpdwentriesread, jlong lpdwtotalentries, jlong lpdwresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwlevel, (void*)(uintptr_t)lplpbuffer, (uint32_t)dwprefmaxlen, (void*)(uintptr_t)lpdwentriesread, (void*)(uintptr_t)lpdwtotalentries, (void*)(uintptr_t)lpdwresumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwlevel;
    (void)lplpbuffer;
    (void)dwprefmaxlen;
    (void)lpdwentriesread;
    (void)lpdwtotalentries;
    (void)lpdwresumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jint dwtransportid, jlong phroutertransport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (uint32_t)dwtransportid, (void*)(uintptr_t)phroutertransport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)dwtransportid;
    (void)phroutertransport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong ppglobalinfo, jlong lpdwglobalinfosize, jlong ppclientinterfaceinfo, jlong lpdwclientinterfaceinfosize, jlong lplpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport, (void*)(uintptr_t)ppglobalinfo, (void*)(uintptr_t)lpdwglobalinfosize, (void*)(uintptr_t)ppclientinterfaceinfo, (void*)(uintptr_t)lpdwclientinterfaceinfosize, (void*)(uintptr_t)lplpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)ppglobalinfo;
    (void)lpdwglobalinfosize;
    (void)ppclientinterfaceinfo;
    (void)lpdwclientinterfaceinfosize;
    (void)lplpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmprconfig, jlong hroutertransport, jlong pglobalinfo, jint dwglobalinfosize, jlong pclientinterfaceinfo, jint dwclientinterfaceinfosize, jlong lpwsdllpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprConfigTransportSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmprconfig, (void*)(uintptr_t)hroutertransport, (void*)(uintptr_t)pglobalinfo, (uint32_t)dwglobalinfosize, (void*)(uintptr_t)pclientinterfaceinfo, (uint32_t)dwclientinterfaceinfosize, (void*)(uintptr_t)lpwsdllpath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmprconfig;
    (void)hroutertransport;
    (void)pglobalinfo;
    (void)dwglobalinfosize;
    (void)pclientinterfaceinfo;
    (void)dwclientinterfaceinfosize;
    (void)lpwsdllpath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (uint32_t)dwitemsize, (uint32_t)dwitemcount, (void*)(uintptr_t)lpitemdata, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lpdwitemsize, jlong lpdwitemcount, jlong lplpitemdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockFind");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (void*)(uintptr_t)lpdwitemsize, (void*)(uintptr_t)lpdwitemcount, (void*)(uintptr_t)lplpitemdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lpdwitemsize;
    (void)lpdwitemcount;
    (void)lplpitemdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockQuerySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockRemove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jint dwinfotype, jint dwitemsize, jint dwitemcount, jlong lpitemdata, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoBlockSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (uint32_t)dwinfotype, (uint32_t)dwitemsize, (uint32_t)dwitemcount, (void*)(uintptr_t)lpitemdata, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)dwinfotype;
    (void)dwitemsize;
    (void)dwitemcount;
    (void)lpitemdata;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(JNIEnv* km_env, jclass km_clazz, jint dwversion, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoCreate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwversion, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwversion;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(JNIEnv* km_env, jclass km_clazz, jlong lpheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDelete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoDuplicate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(JNIEnv* km_env, jclass km_clazz, jlong lpheader, jlong lplpnewheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mprapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprInfoRemoveAll");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpheader, (void*)(uintptr_t)lplpnewheader);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpheader;
    (void)lplpnewheader;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearConnectionStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasClearLinkStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn, (uint32_t)dwsubentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)dwsubentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasConnectionNotificationW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasCreatePhonebookEntryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteEntryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwsubentryid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwsubentryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDeleteSubEntryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwsubentryid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwsubentryid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDialA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpszphonenumber, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpszphonenumber, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialDlgW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpszphonenumber, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpszphonenumber;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasDialW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasDialW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEditPhonebookEntryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEntryDlgW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpprasautodialaddresses, (void*)(uintptr_t)lpdwcbrasautodialaddresses, (void*)(uintptr_t)lpdwcrasautodialaddresses);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(JNIEnv* km_env, jclass km_clazz, jlong lpprasautodialaddresses, jlong lpdwcbrasautodialaddresses, jlong lpdwcrasautodialaddresses) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumAutodialAddressesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpprasautodialaddresses, (void*)(uintptr_t)lpdwcbrasautodialaddresses, (void*)(uintptr_t)lpdwcrasautodialaddresses);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpprasautodialaddresses;
    (void)lpdwcbrasautodialaddresses;
    (void)lpdwcrasautodialaddresses;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumConnectionsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumDevicesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasEnumEntriesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)praseapuseridentity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong praseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasFreeEapUserIdentityW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)praseapuseridentity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)praseapuseridentity;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialAddressW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialEnableW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetAutodialParamW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectStatusW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetConnectionStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)lpstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)lpstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCountryInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (void*)(uintptr_t)pdwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jlong pdwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetCustomAuthDataW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (void*)(uintptr_t)pdwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)pdwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (void*)(uintptr_t)pdwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jlong pdwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserDataW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (void*)(uintptr_t)pdwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)pdwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppraseapuseridentity);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jint dwflags, jlong hwnd, jlong ppraseapuseridentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEapUserIdentityW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppraseapuseridentity);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)dwflags;
    (void)hwnd;
    (void)ppraseapuseridentity;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryDialParamsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetEntryPropertiesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)resourceid, (void*)(uintptr_t)lpszstring, (uint32_t)inbufsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint resourceid, jlong lpszstring, jint inbufsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetErrorStringW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)resourceid, (void*)(uintptr_t)lpszstring, (uint32_t)inbufsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)resourceid;
    (void)lpszstring;
    (void)inbufsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jint dwsubentry, jlong lpstatistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetLinkStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn, (uint32_t)dwsubentry, (void*)(uintptr_t)lpstatistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)dwsubentry;
    (void)lpstatistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(JNIEnv* km_env, jclass km_clazz, jlong lpszpcscf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetPCscf");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszpcscf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszpcscf;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong prasprojection, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)prasprojection, (void*)(uintptr_t)lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)prasprojection;
    (void)lpdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetProjectionInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryHandleW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5, (void*)(uintptr_t)param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasGetSubEntryPropertiesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (void*)(uintptr_t)param4, (void*)(uintptr_t)param5, (void*)(uintptr_t)param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasHangUpW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jlong param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasInvokeEapUI");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(JNIEnv* km_env, jclass km_clazz, jlong lpszphonebook, jlong lpszentry, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasdlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasPhonebookDlgW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszphonebook, (void*)(uintptr_t)lpszentry, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszphonebook;
    (void)lpszentry;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasRenameEntryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (uint32_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialAddressW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (uint32_t)param4);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (int32_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(JNIEnv* km_env, jclass km_clazz, jint param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialEnableW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (int32_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(JNIEnv* km_env, jclass km_clazz, jint param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetAutodialParamW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (int32_t)param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (int32_t)param3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (uint32_t)dwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(JNIEnv* km_env, jclass km_clazz, jlong pszphonebook, jlong pszentry, jlong pbcustomauthdata, jint dwsizeofcustomauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetCustomAuthDataW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbcustomauthdata, (uint32_t)dwsizeofcustomauthdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszphonebook;
    (void)pszentry;
    (void)pbcustomauthdata;
    (void)dwsizeofcustomauthdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (uint32_t)dwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong pszphonebook, jlong pszentry, jlong pbeapdata, jint dwsizeofeapdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEapUserDataW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)pszphonebook, (void*)(uintptr_t)pszentry, (void*)(uintptr_t)pbeapdata, (uint32_t)dwsizeofeapdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htoken;
    (void)pszphonebook;
    (void)pszentry;
    (void)pbeapdata;
    (void)dwsizeofeapdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryDialParamsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (uint32_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetEntryPropertiesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4, (uint32_t)param5);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (uint32_t)param4, (void*)(uintptr_t)param5, (uint32_t)param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasSetSubEntryPropertiesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2, (void*)(uintptr_t)param3, (uint32_t)param4, (void*)(uintptr_t)param5, (uint32_t)param6);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(JNIEnv* km_env, jclass km_clazz, jlong hrasconn, jlong lprasupdateconn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasUpdateConnection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrasconn, (void*)(uintptr_t)lprasupdateconn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hrasconn;
    (void)lprasupdateconn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rasapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RasValidateEntryNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddNextHop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo, (void*)(uintptr_t)nexthophandle, (void*)(uintptr_t)changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong destaddress, jlong routeinfo, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmAddRouteToDest");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routehandle, (void*)(uintptr_t)destaddress, (void*)(uintptr_t)routeinfo, (uint32_t)timetolive, (int64_t)routelisthandle, (uint32_t)notifytype, (int64_t)notifyhandle, (void*)(uintptr_t)changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong targethandle, jbyte targettype, jint blockingflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmBlockMethods");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)targethandle, (uint8_t)targettype, (uint32_t)blockingflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targethandle;
    (void)targettype;
    (void)blockingflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(JNIEnv* km_env, jclass km_clazz, jlong pnetaddress, jlong paddress, jlong plength, jint dwaddresssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmConvertNetAddressToIpv6AddressAndLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pnetaddress, (void*)(uintptr_t)paddress, (void*)(uintptr_t)plength, (uint32_t)dwaddresssize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pnetaddress;
    (void)paddress;
    (void)plength;
    (void)dwaddresssize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint enumflags, jlong netaddress, jint protocolid, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateDestEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)targetviews, (uint32_t)enumflags, (void*)(uintptr_t)netaddress, (uint32_t)protocolid, (void*)(uintptr_t)rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)enumflags;
    (void)netaddress;
    (void)protocolid;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint enumflags, jlong netaddress, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateNextHopEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)enumflags, (void*)(uintptr_t)netaddress, (void*)(uintptr_t)rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumflags;
    (void)netaddress;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint enumflags, jlong startdest, jint matchingflags, jlong criteriaroute, jint criteriainterface, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)targetviews, (uint32_t)enumflags, (void*)(uintptr_t)startdest, (uint32_t)matchingflags, (void*)(uintptr_t)criteriaroute, (uint32_t)criteriainterface, (void*)(uintptr_t)rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
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
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routelisthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jlong rtmenumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmCreateRouteListEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle, (void*)(uintptr_t)rtmenumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)rtmenumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteEnumHandle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteNextHop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeleteRouteToDest");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterEntity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmDeregisterFromChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo, jlong nexthophandle, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmFindNextHop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo, (void*)(uintptr_t)nexthophandle, (void*)(uintptr_t)nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong changestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangeStatus");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (void*)(uintptr_t)changestatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)changestatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetChangedDests");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (void*)(uintptr_t)numdests, (void*)(uintptr_t)changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetDestInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong entityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)entityinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)entityinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong nummethods, jlong exptmethods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEntityMethods");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)nummethods, (void*)(uintptr_t)exptmethods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)nummethods;
    (void)exptmethods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numdests, jlong destinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumDests");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numdests, (void*)(uintptr_t)destinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numnexthops, jlong nexthophandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumNextHops");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numnexthops, (void*)(uintptr_t)nexthophandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetEnumRoutes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numroutes, (void*)(uintptr_t)routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchDestination");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint matchingflags, jlong routeinfo, jint interfaceindex, jint targetviews, jlong routehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetExactMatchRoute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)matchingflags, (void*)(uintptr_t)routeinfo, (uint32_t)interfaceindex, (uint32_t)targetviews, (void*)(uintptr_t)routehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)matchingflags;
    (void)routeinfo;
    (void)interfaceindex;
    (void)targetviews;
    (void)routehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetLessSpecificDestination");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong enumhandle, jlong numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetListEnumRoutes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)enumhandle, (void*)(uintptr_t)numroutes, (void*)(uintptr_t)routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)enumhandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destaddress, jint protocolid, jint targetviews, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetMostSpecificDestination");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destaddress, (uint32_t)protocolid, (uint32_t)targetviews, (void*)(uintptr_t)destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destaddress;
    (void)protocolid;
    (void)targetviews;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetNextHopPointer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (void*)(uintptr_t)nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jlong opaqueinfopointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetOpaqueInformationPointer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (void*)(uintptr_t)opaqueinfopointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)opaqueinfopointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong numentities, jlong entityhandles, jlong entityinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRegisteredEntities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)numentities, (void*)(uintptr_t)entityhandles, (void*)(uintptr_t)entityinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    (void)entityinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routeinfo, jlong destaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRouteInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)routeinfo, (void*)(uintptr_t)destaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routeinfo;
    (void)destaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong routepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmGetRoutePointer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)routepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)routepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint targetviews, jint holdtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmHoldDestination");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (uint32_t)targetviews, (uint32_t)holdtime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)targetviews;
    (void)holdtime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIgnoreChangedDests");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (uint32_t)numdests, (void*)(uintptr_t)changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routelisthandle, jint numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInsertInRouteList");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routelisthandle, (uint32_t)numroutes, (void*)(uintptr_t)routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routelisthandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityhandle, jlong input, jlong outputsize, jlong output) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmInvokeMethod");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)entityhandle, (void*)(uintptr_t)input, (void*)(uintptr_t)outputsize, (void*)(uintptr_t)output);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityhandle;
    (void)input;
    (void)outputsize;
    (void)output;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jlong bestinviews) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsBestRoute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (void*)(uintptr_t)bestinviews);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)bestinviews;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jlong destmarked) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmIsMarkedForChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (void*)(uintptr_t)destmarked);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)destmarked;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong desthandle, jint exclusive, jint lockdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockDestination");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)desthandle, (int32_t)exclusive, (int32_t)lockdest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)desthandle;
    (void)exclusive;
    (void)lockdest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthophandle, jint exclusive, jint locknexthop, jlong nexthoppointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockNextHop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)nexthophandle, (int32_t)exclusive, (int32_t)locknexthop, (void*)(uintptr_t)nexthoppointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthophandle;
    (void)exclusive;
    (void)locknexthop;
    (void)nexthoppointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint exclusive, jint lockroute, jlong routepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmLockRoute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (int32_t)exclusive, (int32_t)lockroute, (void*)(uintptr_t)routepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)exclusive;
    (void)lockroute;
    (void)routepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jlong desthandle, jint markdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmMarkDestForChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (int64_t)desthandle, (int32_t)markdest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)desthandle;
    (void)markdest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numhandles, jlong rtmhandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReferenceHandles");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numhandles, (void*)(uintptr_t)rtmhandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numhandles;
    (void)rtmhandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(JNIEnv* km_env, jclass km_clazz, jlong rtmentityinfo, jlong exportmethods, jlong eventcallback, jint reserveopaquepointer, jlong rtmregprofile, jlong rtmreghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterEntity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rtmentityinfo, (void*)(uintptr_t)exportmethods, (void*)(uintptr_t)eventcallback, (int32_t)reserveopaquepointer, (void*)(uintptr_t)rtmregprofile, (void*)(uintptr_t)rtmreghandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmentityinfo;
    (void)exportmethods;
    (void)eventcallback;
    (void)reserveopaquepointer;
    (void)rtmregprofile;
    (void)rtmreghandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint targetviews, jint notifyflags, jlong notifycontext, jlong notifyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmRegisterForChangeNotification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)targetviews, (uint32_t)notifyflags, (void*)(uintptr_t)notifycontext, (void*)(uintptr_t)notifyhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)targetviews;
    (void)notifyflags;
    (void)notifycontext;
    (void)notifyhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong notifyhandle, jint numdests, jlong changeddests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseChangedDests");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)notifyhandle, (uint32_t)numdests, (void*)(uintptr_t)changeddests);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)notifyhandle;
    (void)numdests;
    (void)changeddests;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong destinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDestInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)destinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)destinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numdests, jlong destinfos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseDests");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numdests, (void*)(uintptr_t)destinfos);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numdests;
    (void)destinfos;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numentities, jlong entityhandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numentities, (void*)(uintptr_t)entityhandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numentities;
    (void)entityhandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong entityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseEntityInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)entityinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)entityinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong nexthopinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHopInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)nexthopinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)nexthopinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numnexthops, jlong nexthophandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseNextHops");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numnexthops, (void*)(uintptr_t)nexthophandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numnexthops;
    (void)nexthophandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRouteInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (void*)(uintptr_t)routeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jint numroutes, jlong routehandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmReleaseRoutes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (uint32_t)numroutes, (void*)(uintptr_t)routehandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)numroutes;
    (void)routehandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_rras_WindowsWin32NetworkmanagementRrasJniBridge_windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(JNIEnv* km_env, jclass km_clazz, jlong rtmreghandle, jlong routehandle, jint timetolive, jlong routelisthandle, jint notifytype, jlong notifyhandle, jlong changeflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, int64_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtmUpdateAndUnlockRoute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)rtmreghandle, (int64_t)routehandle, (uint32_t)timetolive, (int64_t)routelisthandle, (uint32_t)notifytype, (int64_t)notifyhandle, (void*)(uintptr_t)changeflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rtmreghandle;
    (void)routehandle;
    (void)timetolive;
    (void)routelisthandle;
    (void)notifytype;
    (void)notifyhandle;
    (void)changeflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

