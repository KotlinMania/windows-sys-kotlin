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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint ccaccount, jlong wszaccount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetScheduleAccountInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)ccaccount, (void*)(uintptr_t)wszaccount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)ccaccount;
    (void)wszaccount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(JNIEnv* km_env, jclass km_clazz, jlong servername, jint functioncode, jint querylevel, jlong data, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_NetLogonControl2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)functioncode, (uint32_t)querylevel, (void*)(uintptr_t)data, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)functioncode;
    (void)querylevel;
    (void)data;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(JNIEnv* km_env, jclass km_clazz, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings, (uint32_t)dwerrorcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(JNIEnv* km_env, jclass km_clazz, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings, (uint32_t)dwerrorcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(JNIEnv* km_env, jclass km_clazz, jint weventtype, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)weventtype, (uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings);
    } else {
        errno = ENOSYS;
    }
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(JNIEnv* km_env, jclass km_clazz, jint weventtype, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)weventtype, (uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings);
    } else {
        errno = ENOSYS;
    }
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(JNIEnv* km_env, jclass km_clazz, jint dwtransportid, jlong lplpbuffer, jlong lpdwentriesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtransportid, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)lpdwentriesread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtransportid;
    (void)lplpbuffer;
    (void)lpdwentriesread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)resource;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong basepath, jint recursive, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)basepath, (uint32_t)recursive, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)basepath;
    (void)recursive;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong ugname, jlong resource, jlong perms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetUserPerms");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)ugname, (void*)(uintptr_t)resource, (void*)(uintptr_t)perms);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)ugname;
    (void)resource;
    (void)perms;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong alternatename, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddAlternateComputerName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)alternatename, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jlong password, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddServiceAccount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (void*)(uintptr_t)password, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)accountname;
    (void)password;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(JNIEnv* km_env, jclass km_clazz, jlong alerttype, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaise");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)alerttype, (void*)(uintptr_t)buffer, (uint32_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)alerttype;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(JNIEnv* km_env, jclass km_clazz, jlong alerttype, jlong variableinfo, jint variableinfosize, jlong servicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaiseEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)alerttype, (void*)(uintptr_t)variableinfo, (uint32_t)variableinfosize, (void*)(uintptr_t)servicename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)alerttype;
    (void)variableinfo;
    (void)variableinfosize;
    (void)servicename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(JNIEnv* km_env, jclass km_clazz, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferAllocate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)bytecount, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)bytecount;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(JNIEnv* km_env, jclass km_clazz, jlong oldbuffer, jint newbytecount, jlong newbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferReallocate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oldbuffer, (uint32_t)newbytecount, (void*)(uintptr_t)newbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)oldbuffer;
    (void)newbytecount;
    (void)newbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong bytecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (void*)(uintptr_t)bytecount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffer;
    (void)bytecount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(JNIEnv* km_env, jclass km_clazz, jlong server, jlong backupfile, jlong service) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditClear");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)backupfile, (void*)(uintptr_t)service);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)backupfile;
    (void)service;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(JNIEnv* km_env, jclass km_clazz, jlong server, jlong service, jlong auditloghandle, jint offset, jlong reserved1, jint reserved2, jint offsetflag, jlong bufptr, jint prefmaxlen, jlong bytesread, jlong totalavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditRead");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)service, (void*)(uintptr_t)auditloghandle, (uint32_t)offset, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)offsetflag, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)totalavailable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)service;
    (void)auditloghandle;
    (void)offset;
    (void)reserved1;
    (void)reserved2;
    (void)offsetflag;
    (void)bufptr;
    (void)prefmaxlen;
    (void)bytesread;
    (void)totalavailable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(JNIEnv* km_env, jclass km_clazz, jint type, jlong buf, jint numbytes, jlong service, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditWrite");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)type, (void*)(uintptr_t)buf, (uint32_t)numbytes, (void*)(uintptr_t)service, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)type;
    (void)buf;
    (void)numbytes;
    (void)service;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(JNIEnv* km_env, jclass km_clazz, jlong server, jlong component, jlong parameter, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)component, (void*)(uintptr_t)parameter, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)component;
    (void)parameter;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(JNIEnv* km_env, jclass km_clazz, jlong server, jlong component, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGetAll");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)component, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)component;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(JNIEnv* km_env, jclass km_clazz, jlong server, jlong reserved1, jlong component, jint level, jint reserved2, jlong buf, jint reserved3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)component, (uint32_t)level, (uint32_t)reserved2, (void*)(uintptr_t)buf, (uint32_t)reserved3);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)reserved1;
    (void)component;
    (void)level;
    (void)reserved2;
    (void)buf;
    (void)reserved3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(JNIEnv* km_env, jclass km_clazz, jlong pprovisioningparams, jlong pppackagebindata, jlong pdwpackagebindatasize, jlong pppackagetextdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetCreateProvisioningPackage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprovisioningparams, (void*)(uintptr_t)pppackagebindata, (void*)(uintptr_t)pdwpackagebindatasize, (void*)(uintptr_t)pppackagetextdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pprovisioningparams;
    (void)pppackagebindata;
    (void)pdwpackagebindatasize;
    (void)pppackagetextdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(JNIEnv* km_env, jclass km_clazz, jlong server, jint nametype, jint reserved, jlong entrycount, jlong computernames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateComputerNames");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (int32_t)nametype, (uint32_t)reserved, (void*)(uintptr_t)entrycount, (void*)(uintptr_t)computernames);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)nametype;
    (void)reserved;
    (void)entrycount;
    (void)computernames;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(JNIEnv* km_env, jclass km_clazz, jlong servername, jint flags, jlong accountscount, jlong accounts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateServiceAccounts");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)flags, (void*)(uintptr_t)accountscount, (void*)(uintptr_t)accounts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)flags;
    (void)accountscount;
    (void)accounts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong backupfile, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogClear");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)backupfile, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)backupfile;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong reserved1, jlong errorloghandle, jint offset, jlong reserved2, jint reserved3, jint offsetflag, jlong bufptr, jint prefmaxsize, jlong bytesread, jlong totalavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogRead");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)errorloghandle, (uint32_t)offset, (void*)(uintptr_t)reserved2, (uint32_t)reserved3, (uint32_t)offsetflag, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxsize, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)totalavailable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)reserved1;
    (void)errorloghandle;
    (void)offset;
    (void)reserved2;
    (void)reserved3;
    (void)offsetflag;
    (void)bufptr;
    (void)prefmaxsize;
    (void)bytesread;
    (void)totalavailable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(JNIEnv* km_env, jclass km_clazz, jlong reserved1, jint code, jlong component, jlong buffer, jint numbytes, jlong msgbuf, jint strcount, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogWrite");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved1, (uint32_t)code, (void*)(uintptr_t)component, (void*)(uintptr_t)buffer, (uint32_t)numbytes, (void*)(uintptr_t)msgbuf, (uint32_t)strcount, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reserved1;
    (void)code;
    (void)component;
    (void)buffer;
    (void)numbytes;
    (void)msgbuf;
    (void)strcount;
    (void)reserved2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong pjoininfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFreeAadJoinInformation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pjoininfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pjoininfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong pcsztenantid, jlong ppjoininfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAadJoinInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcsztenantid, (void*)(uintptr_t)ppjoininfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcsztenantid;
    (void)ppjoininfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong domainname, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAnyDCName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong domainname, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDCName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong prefix, jlong arg3Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDisplayInformationIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)prefix, (void*)(uintptr_t)arg3Index);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)prefix;
    (void)arg3Index;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpnamebuffer, jlong buffertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)buffertype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpnamebuffer;
    (void)buffertype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpdomain, jlong lpaccount, jlong lppassword, jlong oucount, jlong ous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinableOUs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)oucount, (void*)(uintptr_t)ous);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpaccount;
    (void)lppassword;
    (void)oucount;
    (void)ous;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAddUser");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)username);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)username;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDelUser");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)username);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)username;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetUsers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetUsers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jlong isservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetIsServiceAccount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (void*)(uintptr_t)isservice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)accountname;
    (void)isservice;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpdomain, jlong lpmachineaccountou, jlong lpaccount, jlong lppassword, jint fjoinoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetJoinDomain");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpmachineaccountou, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)fjoinoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpmachineaccountou;
    (void)lpaccount;
    (void)lppassword;
    (void)fjoinoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong membersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMember");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)membersid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMembers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong membersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMember");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)membersid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMembers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong localgroupname, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetMembers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)localgroupname, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)localgroupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetMembers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname, jlong fromname, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageBufferSend");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname, (void*)(uintptr_t)fromname, (void*)(uintptr_t)buf, (uint32_t)buflen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)msgname;
    (void)fromname;
    (void)buf;
    (void)buflen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)msgname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)msgname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)msgname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(JNIEnv* km_env, jclass km_clazz, jlong lpdomain, jlong lpmachinename, jlong lpmachineaccountou, jlong lpdcname, jint dwoptions, jlong pprovisionbindata, jlong pdwprovisionbindatasize, jlong pprovisiontextdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetProvisionComputerAccount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmachineaccountou, (void*)(uintptr_t)lpdcname, (uint32_t)dwoptions, (void*)(uintptr_t)pprovisionbindata, (void*)(uintptr_t)pdwprovisionbindatasize, (void*)(uintptr_t)pprovisiontextdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpdomain;
    (void)lpmachinename;
    (void)lpmachineaccountou;
    (void)lpdcname;
    (void)dwoptions;
    (void)pprovisionbindata;
    (void)pdwprovisionbindatasize;
    (void)pprovisiontextdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jint arg2Index, jint entriesrequested, jint preferredmaximumlength, jlong returnedentrycount, jlong sortedbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryDisplayInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (uint32_t)arg2Index, (uint32_t)entriesrequested, (uint32_t)preferredmaximumlength, (void*)(uintptr_t)returnedentrycount, (void*)(uintptr_t)sortedbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)arg2Index;
    (void)entriesrequested;
    (void)preferredmaximumlength;
    (void)returnedentrycount;
    (void)sortedbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jint infolevel, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryServiceAccount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (uint32_t)infolevel, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)accountname;
    (void)infolevel;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jint optionswanted, jlong optionssupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteComputerSupports");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (uint32_t)optionswanted, (void*)(uintptr_t)optionssupported);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)optionswanted;
    (void)optionssupported;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong bufferptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteTOD");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)bufferptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)bufferptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong alternatename, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveAlternateComputerName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)alternatename, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveServiceAccount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)accountname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpnewmachinename, jlong lpaccount, jlong lppassword, jint frenameoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRenameMachineInDomain");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpnewmachinename, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)frenameoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpnewmachinename;
    (void)lpaccount;
    (void)lppassword;
    (void)frenameoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirLock");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint unlockforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirUnlock");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)unlockforce);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirLock");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint unlockforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirUnlock");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)unlockforce);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(JNIEnv* km_env, jclass km_clazz, jlong pprovisionbindata, jint cbprovisionbindatasize, jint dwoptions, jlong lpwindowspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestOfflineDomainJoin");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprovisionbindata, (uint32_t)cbprovisionbindatasize, (uint32_t)dwoptions, (void*)(uintptr_t)lpwindowspath);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pprovisionbindata;
    (void)cbprovisionbindatasize;
    (void)dwoptions;
    (void)lpwindowspath;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(JNIEnv* km_env, jclass km_clazz, jlong ppackagebindata, jint dwpackagebindatasize, jint dwprovisionoptions, jlong lpwindowspath, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestProvisioningPackageInstall");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppackagebindata, (uint32_t)dwpackagebindatasize, (uint32_t)dwprovisionoptions, (void*)(uintptr_t)lpwindowspath, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppackagebindata;
    (void)dwpackagebindatasize;
    (void)dwprovisionoptions;
    (void)lpwindowspath;
    (void)pvreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong buffer, jlong jobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)buffer, (void*)(uintptr_t)jobid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)buffer;
    (void)jobid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jint minjobid, jint maxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)minjobid, (uint32_t)maxjobid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)minjobid;
    (void)maxjobid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong pointertobuffer, jint prefferedmaximumlength, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)pointertobuffer, (uint32_t)prefferedmaximumlength, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)pointertobuffer;
    (void)prefferedmaximumlength;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint jobid, jlong pointertobuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)jobid, (void*)(uintptr_t)pointertobuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)jobid;
    (void)pointertobuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong emulateddomainname, jlong emulatedservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)emulateddomainname, (void*)(uintptr_t)emulatedservername);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)emulateddomainname;
    (void)emulatedservername;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong emulatedservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)emulatedservername);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)emulatedservername;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerDiskEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jint servertype, jlong domain, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (uint32_t)servertype, (void*)(uintptr_t)domain, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)servertype;
    (void)domain;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmerror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmerror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAddEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint opcode, jint arg, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceControl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)opcode, (uint32_t)arg, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)service;
    (void)opcode;
    (void)arg;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)service;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint argc, jlong argv, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceInstall");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)argc, (void*)(uintptr_t)argv, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)service;
    (void)argc;
    (void)argv;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong primaryname, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSetPrimaryComputerName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)primaryname, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)server;
    (void)primaryname;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpaccount, jlong lppassword, jint funjoinoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUnjoinDomain");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)funjoinoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpaccount;
    (void)lppassword;
    (void)funjoinoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint levelflags, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)levelflags, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)levelflags;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong usename, jint forcelevelflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)usename, (uint32_t)forcelevelflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)usename;
    (void)forcelevelflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jint levelflags, jlong bufptr, jint preferedmaximumsize, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (uint32_t)levelflags, (void*)(uintptr_t)bufptr, (uint32_t)preferedmaximumsize, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)levelflags;
    (void)bufptr;
    (void)preferedmaximumsize;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong usename, jint levelflags, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)usename, (uint32_t)levelflags, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)usename;
    (void)levelflags;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(JNIEnv* km_env, jclass km_clazz, jlong domainname, jlong username, jlong oldpassword, jlong newpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserChangePassword");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)domainname, (void*)(uintptr_t)username, (void*)(uintptr_t)oldpassword, (void*)(uintptr_t)newpassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)domainname;
    (void)username;
    (void)oldpassword;
    (void)newpassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jint filter, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (uint32_t)filter, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)filter;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetGroups");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jint flags, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetLocalGroups");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (uint32_t)flags, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)flags;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsGet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsSet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong buf, jint numEntries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetGroups");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)numEntries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)numEntries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpname, jlong lpaccount, jlong lppassword, jint nametype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidateName");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (int32_t)nametype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpserver;
    (void)lpname;
    (void)lpaccount;
    (void)lppassword;
    (void)nametype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong qualifier, jint validationtype, jlong inputarg, jlong outputarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)qualifier, (int32_t)validationtype, (void*)(uintptr_t)inputarg, (void*)(uintptr_t)outputarg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)qualifier;
    (void)validationtype;
    (void)inputarg;
    (void)outputarg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(JNIEnv* km_env, jclass km_clazz, jlong outputarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicyFree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)outputarg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)outputarg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buffer, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buffer, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buffer;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportAdd");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong transportname, jint ucond) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportDel");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)transportname, (uint32_t)ucond);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)transportname;
    (void)ucond;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumeHandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumeHandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumeHandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong reserved, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved, (uint32_t)level, (void*)(uintptr_t)bufptr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reserved;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong reserved, jint level, jlong buf, jlong parmErr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserSetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmErr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reserved;
    (void)level;
    (void)buf;
    (void)parmErr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(JNIEnv* km_env, jclass km_clazz, jlong pszfailedassertion, jlong pszfilename, jint dwlinenumber, jlong pszmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAssert");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pszfailedassertion, (void*)(uintptr_t)pszfilename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pszmessage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pszfailedassertion;
    (void)pszfilename;
    (void)dwlinenumber;
    (void)pszmessage;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint dwerrorcode, jlong lplpszerrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwerrorcode, (void*)(uintptr_t)lplpszerrorstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwerrorcode;
    (void)lplpszerrorstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint dwerrorcode, jlong lplpwszerrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwerrorcode, (void*)(uintptr_t)lplpwszerrorstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwerrorcode;
    (void)lplpwszerrorstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwdatabytes, jlong lpdatabytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwdatabytes, (void*)(uintptr_t)lpdatabytes);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwdatabytes, jlong lpdatabytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwdatabytes, (void*)(uintptr_t)lpdatabytes);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventExA");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat); break;
            case 1: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventExW");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat); break;
            case 1: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode, jint dwerrorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode, (uint32_t)dwerrorindex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode, jint dwerrorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode, (uint32_t)dwerrorindex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (void*)(uintptr_t)arglist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (void*)(uintptr_t)arglist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(JNIEnv* km_env, jclass km_clazz, jlong lpszsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszsource);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszsource;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(JNIEnv* km_env, jclass km_clazz, jlong lpszsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszsource);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszsource;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jlong pwszaccount, jlong pwszpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNetScheduleAccountInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (void*)(uintptr_t)pwszaccount, (void*)(uintptr_t)pwszpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)pwszaccount;
    (void)pwszpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpbbytes, jint dwbytecount, jint dwgroupsize, jint baddressprefix, jlong lpszprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpbbytes, (uint32_t)dwbytecount, (uint32_t)dwgroupsize, (int32_t)baddressprefix, (void*)(uintptr_t)lpszprefix);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpbbytes, jint dwbytecount, jint dwgroupsize, jint baddressprefix, jlong lpszprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpbbytes, (uint32_t)dwbytecount, (uint32_t)dwgroupsize, (int32_t)baddressprefix, (void*)(uintptr_t)lpszprefix);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lphconsole) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lphconsole);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)lphconsole;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lphconsole) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lphconsole);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)lphconsole;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lpszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfA");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat); break;
            case 1: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwtraceid;
    (void)lpszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfExA");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat); break;
            case 1: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfExW");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat); break;
            case 1: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lpszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePrintfW");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat); break;
            case 1: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lpszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwtraceid;
    (void)lpszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(JNIEnv* km_env, jclass km_clazz, jlong lpszcallername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcallername, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszcallername;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(JNIEnv* km_env, jclass km_clazz, jlong lpszcallername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcallername, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpszcallername;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (void*)(uintptr_t)arglist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (void*)(uintptr_t)arglist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

