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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1GetNetScheduleAccountInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint ccaccount, jlong wszaccount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetScheduleAccountInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)ccaccount, (void*)(uintptr_t)wszaccount) : -1;
#else
    (void)pwszservername;
    (void)ccaccount;
    (void)wszaccount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1I_1NetLogonControl2(JNIEnv* km_env, jclass km_clazz, jlong servername, jint functioncode, jint querylevel, jlong data, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_NetLogonControl2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)functioncode, (uint32_t)querylevel, (void*)(uintptr_t)data, (void*)(uintptr_t)buffer) : 0;
#else
    (void)servername;
    (void)functioncode;
    (void)querylevel;
    (void)data;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1LogErrorA(JNIEnv* km_env, jclass km_clazz, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings, (uint32_t)dwerrorcode);
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1LogErrorW(JNIEnv* km_env, jclass km_clazz, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogErrorW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings, (uint32_t)dwerrorcode);
#else
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
    (void)dwerrorcode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1LogEventA(JNIEnv* km_env, jclass km_clazz, jint weventtype, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)weventtype, (uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings);
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1LogEventW(JNIEnv* km_env, jclass km_clazz, jint weventtype, jint dwmessageid, jint cnumberofsubstrings, jlong plpwssubstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogEventW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)weventtype, (uint32_t)dwmessageid, (uint32_t)cnumberofsubstrings, (void*)(uintptr_t)plpwssubstrings);
#else
    (void)weventtype;
    (void)dwmessageid;
    (void)cnumberofsubstrings;
    (void)plpwssubstrings;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1MprSetupProtocolEnum(JNIEnv* km_env, jclass km_clazz, jint dwtransportid, jlong lplpbuffer, jlong lpdwentriesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtransportid, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)lpdwentriesread) : 0;
#else
    (void)dwtransportid;
    (void)lplpbuffer;
    (void)lpdwentriesread;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1MprSetupProtocolFree(JNIEnv* km_env, jclass km_clazz, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MprSetupProtocolFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource) : 0;
#else
    (void)servername;
    (void)resource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong basepath, jint recursive, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)basepath, (uint32_t)recursive, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)basepath;
    (void)recursive;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessGetUserPerms(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong ugname, jlong resource, jlong perms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessGetUserPerms");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)ugname, (void*)(uintptr_t)resource, (void*)(uintptr_t)perms) : 0;
#else
    (void)servername;
    (void)ugname;
    (void)resource;
    (void)perms;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAccessSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong resource, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAccessSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)resource, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)resource;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAddAlternateComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong alternatename, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddAlternateComputerName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)alternatename, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved) : 0;
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAddServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jlong password, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAddServiceAccount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (void*)(uintptr_t)password, (uint32_t)flags) : -1;
#else
    (void)servername;
    (void)accountname;
    (void)password;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAlertRaise(JNIEnv* km_env, jclass km_clazz, jlong alerttype, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaise");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)alerttype, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)alerttype;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAlertRaiseEx(JNIEnv* km_env, jclass km_clazz, jlong alerttype, jlong variableinfo, jint variableinfosize, jlong servicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAlertRaiseEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)alerttype, (void*)(uintptr_t)variableinfo, (uint32_t)variableinfosize, (void*)(uintptr_t)servicename) : 0;
#else
    (void)alerttype;
    (void)variableinfo;
    (void)variableinfosize;
    (void)servicename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetApiBufferAllocate(JNIEnv* km_env, jclass km_clazz, jint bytecount, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferAllocate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)bytecount, (void*)(uintptr_t)buffer) : 0;
#else
    (void)bytecount;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetApiBufferFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer) : 0;
#else
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetApiBufferReallocate(JNIEnv* km_env, jclass km_clazz, jlong oldbuffer, jint newbytecount, jlong newbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferReallocate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldbuffer, (uint32_t)newbytecount, (void*)(uintptr_t)newbuffer) : 0;
#else
    (void)oldbuffer;
    (void)newbytecount;
    (void)newbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetApiBufferSize(JNIEnv* km_env, jclass km_clazz, jlong buffer, jlong bytecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetApiBufferSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (void*)(uintptr_t)bytecount) : 0;
#else
    (void)buffer;
    (void)bytecount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAuditClear(JNIEnv* km_env, jclass km_clazz, jlong server, jlong backupfile, jlong service) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditClear");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)backupfile, (void*)(uintptr_t)service) : 0;
#else
    (void)server;
    (void)backupfile;
    (void)service;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAuditRead(JNIEnv* km_env, jclass km_clazz, jlong server, jlong service, jlong auditloghandle, jint offset, jlong reserved1, jint reserved2, jint offsetflag, jlong bufptr, jint prefmaxlen, jlong bytesread, jlong totalavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditRead");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)service, (void*)(uintptr_t)auditloghandle, (uint32_t)offset, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)offsetflag, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)totalavailable) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetAuditWrite(JNIEnv* km_env, jclass km_clazz, jint type, jlong buf, jint numbytes, jlong service, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetAuditWrite");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)type, (void*)(uintptr_t)buf, (uint32_t)numbytes, (void*)(uintptr_t)service, (void*)(uintptr_t)reserved) : 0;
#else
    (void)type;
    (void)buf;
    (void)numbytes;
    (void)service;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetConfigGet(JNIEnv* km_env, jclass km_clazz, jlong server, jlong component, jlong parameter, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)component, (void*)(uintptr_t)parameter, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)server;
    (void)component;
    (void)parameter;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetConfigGetAll(JNIEnv* km_env, jclass km_clazz, jlong server, jlong component, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigGetAll");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)component, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)server;
    (void)component;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetConfigSet(JNIEnv* km_env, jclass km_clazz, jlong server, jlong reserved1, jlong component, jint level, jint reserved2, jlong buf, jint reserved3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConfigSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)component, (uint32_t)level, (uint32_t)reserved2, (void*)(uintptr_t)buf, (uint32_t)reserved3) : 0;
#else
    (void)server;
    (void)reserved1;
    (void)component;
    (void)level;
    (void)reserved2;
    (void)buf;
    (void)reserved3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetCreateProvisioningPackage(JNIEnv* km_env, jclass km_clazz, jlong pprovisioningparams, jlong pppackagebindata, jlong pdwpackagebindatasize, jlong pppackagetextdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetCreateProvisioningPackage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovisioningparams, (void*)(uintptr_t)pppackagebindata, (void*)(uintptr_t)pdwpackagebindatasize, (void*)(uintptr_t)pppackagetextdata) : 0;
#else
    (void)pprovisioningparams;
    (void)pppackagebindata;
    (void)pdwpackagebindatasize;
    (void)pppackagetextdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetEnumerateComputerNames(JNIEnv* km_env, jclass km_clazz, jlong server, jint nametype, jint reserved, jlong entrycount, jlong computernames) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateComputerNames");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (int32_t)nametype, (uint32_t)reserved, (void*)(uintptr_t)entrycount, (void*)(uintptr_t)computernames) : 0;
#else
    (void)server;
    (void)nametype;
    (void)reserved;
    (void)entrycount;
    (void)computernames;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetEnumerateServiceAccounts(JNIEnv* km_env, jclass km_clazz, jlong servername, jint flags, jlong accountscount, jlong accounts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetEnumerateServiceAccounts");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)flags, (void*)(uintptr_t)accountscount, (void*)(uintptr_t)accounts) : -1;
#else
    (void)servername;
    (void)flags;
    (void)accountscount;
    (void)accounts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetErrorLogClear(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong backupfile, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogClear");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)backupfile, (void*)(uintptr_t)reserved) : 0;
#else
    (void)uncservername;
    (void)backupfile;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetErrorLogRead(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong reserved1, jlong errorloghandle, jint offset, jlong reserved2, jint reserved3, jint offsetflag, jlong bufptr, jint prefmaxsize, jlong bytesread, jlong totalavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogRead");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)errorloghandle, (uint32_t)offset, (void*)(uintptr_t)reserved2, (uint32_t)reserved3, (uint32_t)offsetflag, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxsize, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)totalavailable) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetErrorLogWrite(JNIEnv* km_env, jclass km_clazz, jlong reserved1, jint code, jlong component, jlong buffer, jint numbytes, jlong msgbuf, jint strcount, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetErrorLogWrite");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)reserved1, (uint32_t)code, (void*)(uintptr_t)component, (void*)(uintptr_t)buffer, (uint32_t)numbytes, (void*)(uintptr_t)msgbuf, (uint32_t)strcount, (void*)(uintptr_t)reserved2) : 0;
#else
    (void)reserved1;
    (void)code;
    (void)component;
    (void)buffer;
    (void)numbytes;
    (void)msgbuf;
    (void)strcount;
    (void)reserved2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetFreeAadJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong pjoininfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFreeAadJoinInformation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pjoininfo);
#else
    (void)pjoininfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetAadJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong pcsztenantid, jlong ppjoininfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAadJoinInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcsztenantid, (void*)(uintptr_t)ppjoininfo) : -1;
#else
    (void)pcsztenantid;
    (void)ppjoininfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetAnyDCName(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong domainname, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetAnyDCName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)buffer) : 0;
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetDCName(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong domainname, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDCName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)domainname, (void*)(uintptr_t)buffer) : 0;
#else
    (void)servername;
    (void)domainname;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetDisplayInformationIndex(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong prefix, jlong arg_3_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetDisplayInformationIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)prefix, (void*)(uintptr_t)arg_3_index) : 0;
#else
    (void)servername;
    (void)level;
    (void)prefix;
    (void)arg_3_index;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetJoinInformation(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpnamebuffer, jlong buffertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)buffertype) : 0;
#else
    (void)lpserver;
    (void)lpnamebuffer;
    (void)buffertype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGetJoinableOUs(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpdomain, jlong lpaccount, jlong lppassword, jlong oucount, jlong ous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGetJoinableOUs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)oucount, (void*)(uintptr_t)ous) : 0;
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpaccount;
    (void)lppassword;
    (void)oucount;
    (void)ous;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupAddUser(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupAddUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)username) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)username;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname) : 0;
#else
    (void)servername;
    (void)groupname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupDelUser(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupDelUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)username) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)username;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupGetUsers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupGetUsers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetGroupSetUsers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetGroupSetUsers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetIsServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jlong isservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetIsServiceAccount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (void*)(uintptr_t)isservice) : -1;
#else
    (void)servername;
    (void)accountname;
    (void)isservice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetJoinDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpdomain, jlong lpmachineaccountou, jlong lpaccount, jlong lppassword, jint fjoinoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetJoinDomain");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpmachineaccountou, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)fjoinoptions) : 0;
#else
    (void)lpserver;
    (void)lpdomain;
    (void)lpmachineaccountou;
    (void)lpaccount;
    (void)lppassword;
    (void)fjoinoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupAddMember(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong membersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMember");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)membersid) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupAddMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupAddMembers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname) : 0;
#else
    (void)servername;
    (void)groupname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupDelMember(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jlong membersid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMember");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (void*)(uintptr_t)membersid) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)membersid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupDelMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupDelMembers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupGetMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong localgroupname, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupGetMembers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)localgroupname, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)localgroupname;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetLocalGroupSetMembers(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong groupname, jint level, jlong buf, jint totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetLocalGroupSetMembers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)groupname, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)totalentries) : 0;
#else
    (void)servername;
    (void)groupname;
    (void)level;
    (void)buf;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetMessageBufferSend(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname, jlong fromname, jlong buf, jint buflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageBufferSend");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname, (void*)(uintptr_t)fromname, (void*)(uintptr_t)buf, (uint32_t)buflen) : 0;
#else
    (void)servername;
    (void)msgname;
    (void)fromname;
    (void)buf;
    (void)buflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetMessageNameAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname) : 0;
#else
    (void)servername;
    (void)msgname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetMessageNameDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname) : 0;
#else
    (void)servername;
    (void)msgname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetMessageNameEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetMessageNameGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong msgname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetMessageNameGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)msgname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)msgname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetProvisionComputerAccount(JNIEnv* km_env, jclass km_clazz, jlong lpdomain, jlong lpmachinename, jlong lpmachineaccountou, jlong lpdcname, jint dwoptions, jlong pprovisionbindata, jlong pdwprovisionbindatasize, jlong pprovisiontextdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetProvisionComputerAccount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpmachineaccountou, (void*)(uintptr_t)lpdcname, (uint32_t)dwoptions, (void*)(uintptr_t)pprovisionbindata, (void*)(uintptr_t)pdwprovisionbindatasize, (void*)(uintptr_t)pprovisiontextdata) : 0;
#else
    (void)lpdomain;
    (void)lpmachinename;
    (void)lpmachineaccountou;
    (void)lpdcname;
    (void)dwoptions;
    (void)pprovisionbindata;
    (void)pdwprovisionbindatasize;
    (void)pprovisiontextdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetQueryDisplayInformation(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jint arg_2_index, jint entriesrequested, jint preferredmaximumlength, jlong returnedentrycount, jlong sortedbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryDisplayInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (uint32_t)arg_2_index, (uint32_t)entriesrequested, (uint32_t)preferredmaximumlength, (void*)(uintptr_t)returnedentrycount, (void*)(uintptr_t)sortedbuffer) : 0;
#else
    (void)servername;
    (void)level;
    (void)arg_2_index;
    (void)entriesrequested;
    (void)preferredmaximumlength;
    (void)returnedentrycount;
    (void)sortedbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetQueryServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jint infolevel, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetQueryServiceAccount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (uint32_t)infolevel, (void*)(uintptr_t)buffer) : -1;
#else
    (void)servername;
    (void)accountname;
    (void)infolevel;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRemoteComputerSupports(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jint optionswanted, jlong optionssupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteComputerSupports");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (uint32_t)optionswanted, (void*)(uintptr_t)optionssupported) : 0;
#else
    (void)uncservername;
    (void)optionswanted;
    (void)optionssupported;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRemoteTOD(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong bufferptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoteTOD");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)bufferptr) : 0;
#else
    (void)uncservername;
    (void)bufferptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRemoveAlternateComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong alternatename, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveAlternateComputerName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)alternatename, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved) : 0;
#else
    (void)server;
    (void)alternatename;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRemoveServiceAccount(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong accountname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRemoveServiceAccount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)accountname, (uint32_t)flags) : -1;
#else
    (void)servername;
    (void)accountname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRenameMachineInDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpnewmachinename, jlong lpaccount, jlong lppassword, jint frenameoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRenameMachineInDomain");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpnewmachinename, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)frenameoptions) : 0;
#else
    (void)lpserver;
    (void)lpnewmachinename;
    (void)lpaccount;
    (void)lppassword;
    (void)frenameoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname) : 0;
#else
    (void)servername;
    (void)dirname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirLock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirLock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname) : 0;
#else
    (void)servername;
    (void)dirname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplExportDirUnlock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint unlockforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplExportDirUnlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)unlockforce) : 0;
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname) : 0;
#else
    (void)servername;
    (void)dirname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)dirname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirLock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirLock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname) : 0;
#else
    (void)servername;
    (void)dirname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplImportDirUnlock(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong dirname, jint unlockforce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplImportDirUnlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)dirname, (uint32_t)unlockforce) : 0;
#else
    (void)servername;
    (void)dirname;
    (void)unlockforce;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetReplSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetReplSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRequestOfflineDomainJoin(JNIEnv* km_env, jclass km_clazz, jlong pprovisionbindata, jint cbprovisionbindatasize, jint dwoptions, jlong lpwindowspath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestOfflineDomainJoin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovisionbindata, (uint32_t)cbprovisionbindatasize, (uint32_t)dwoptions, (void*)(uintptr_t)lpwindowspath) : 0;
#else
    (void)pprovisionbindata;
    (void)cbprovisionbindatasize;
    (void)dwoptions;
    (void)lpwindowspath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetRequestProvisioningPackageInstall(JNIEnv* km_env, jclass km_clazz, jlong ppackagebindata, jint dwpackagebindatasize, jint dwprovisionoptions, jlong lpwindowspath, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetRequestProvisioningPackageInstall");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppackagebindata, (uint32_t)dwpackagebindatasize, (uint32_t)dwprovisionoptions, (void*)(uintptr_t)lpwindowspath, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)ppackagebindata;
    (void)dwpackagebindatasize;
    (void)dwprovisionoptions;
    (void)lpwindowspath;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetScheduleJobAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong buffer, jlong jobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)buffer, (void*)(uintptr_t)jobid) : 0;
#else
    (void)servername;
    (void)buffer;
    (void)jobid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetScheduleJobDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jint minjobid, jint maxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)minjobid, (uint32_t)maxjobid) : 0;
#else
    (void)servername;
    (void)minjobid;
    (void)maxjobid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetScheduleJobEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong pointertobuffer, jint prefferedmaximumlength, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)pointertobuffer, (uint32_t)prefferedmaximumlength, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)pointertobuffer;
    (void)prefferedmaximumlength;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetScheduleJobGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint jobid, jlong pointertobuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetScheduleJobGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)jobid, (void*)(uintptr_t)pointertobuffer) : 0;
#else
    (void)servername;
    (void)jobid;
    (void)pointertobuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerComputerNameAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong emulateddomainname, jlong emulatedservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)emulateddomainname, (void*)(uintptr_t)emulatedservername) : 0;
#else
    (void)servername;
    (void)emulateddomainname;
    (void)emulatedservername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerComputerNameDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong emulatedservername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerComputerNameDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)emulatedservername) : 0;
#else
    (void)servername;
    (void)emulatedservername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerDiskEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerDiskEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jint servertype, jlong domain, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (uint32_t)servertype, (void*)(uintptr_t)domain, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)servertype;
    (void)domain;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parmerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parmerror) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parmerror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerTransportAddEx(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportAddEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerTransportDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServerTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerTransportEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServiceControl(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint opcode, jint arg, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)opcode, (uint32_t)arg, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)service;
    (void)opcode;
    (void)arg;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServiceEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServiceGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)service;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetServiceInstall(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint argc, jlong argv, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServiceInstall");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)argc, (void*)(uintptr_t)argv, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)service;
    (void)argc;
    (void)argv;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetSetPrimaryComputerName(JNIEnv* km_env, jclass km_clazz, jlong server, jlong primaryname, jlong domainaccount, jlong domainaccountpassword, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSetPrimaryComputerName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)server, (void*)(uintptr_t)primaryname, (void*)(uintptr_t)domainaccount, (void*)(uintptr_t)domainaccountpassword, (uint32_t)reserved) : 0;
#else
    (void)server;
    (void)primaryname;
    (void)domainaccount;
    (void)domainaccountpassword;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUnjoinDomain(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpaccount, jlong lppassword, jint funjoinoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUnjoinDomain");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (uint32_t)funjoinoptions) : 0;
#else
    (void)lpserver;
    (void)lpaccount;
    (void)lppassword;
    (void)funjoinoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUseAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint levelflags, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)levelflags, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)levelflags;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUseDel(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong usename, jint forcelevelflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)usename, (uint32_t)forcelevelflags) : 0;
#else
    (void)uncservername;
    (void)usename;
    (void)forcelevelflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUseEnum(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jint levelflags, jlong bufptr, jint preferedmaximumsize, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (uint32_t)levelflags, (void*)(uintptr_t)bufptr, (uint32_t)preferedmaximumsize, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)uncservername;
    (void)levelflags;
    (void)bufptr;
    (void)preferedmaximumsize;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUseGetInfo(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong usename, jint levelflags, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUseGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)usename, (uint32_t)levelflags, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)uncservername;
    (void)usename;
    (void)levelflags;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserChangePassword(JNIEnv* km_env, jclass km_clazz, jlong domainname, jlong username, jlong oldpassword, jlong newpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserChangePassword");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)domainname, (void*)(uintptr_t)username, (void*)(uintptr_t)oldpassword, (void*)(uintptr_t)newpassword) : 0;
#else
    (void)domainname;
    (void)username;
    (void)oldpassword;
    (void)newpassword;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username) : 0;
#else
    (void)servername;
    (void)username;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jint filter, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (uint32_t)filter, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)filter;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserGetGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetGroups");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries) : 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserGetLocalGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jint flags, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserGetLocalGroups");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (uint32_t)flags, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries) : 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)flags;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserModalsGet(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsGet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserModalsSet(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserModalsSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserSetGroups(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong buf, jint num_entries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetGroups");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)buf, (uint32_t)num_entries) : 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)num_entries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetUserSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)username;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetValidateName(JNIEnv* km_env, jclass km_clazz, jlong lpserver, jlong lpname, jlong lpaccount, jlong lppassword, jint nametype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidateName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpserver, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpaccount, (void*)(uintptr_t)lppassword, (int32_t)nametype) : 0;
#else
    (void)lpserver;
    (void)lpname;
    (void)lpaccount;
    (void)lppassword;
    (void)nametype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetValidatePasswordPolicy(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong qualifier, jint validationtype, jlong inputarg, jlong outputarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)qualifier, (int32_t)validationtype, (void*)(uintptr_t)inputarg, (void*)(uintptr_t)outputarg) : 0;
#else
    (void)servername;
    (void)qualifier;
    (void)validationtype;
    (void)inputarg;
    (void)outputarg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetValidatePasswordPolicyFree(JNIEnv* km_env, jclass km_clazz, jlong outputarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetValidatePasswordPolicyFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)outputarg) : 0;
#else
    (void)outputarg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buffer, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buffer, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buffer;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaTransportAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaTransportDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong transportname, jint ucond) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)transportname, (uint32_t)ucond) : 0;
#else
    (void)servername;
    (void)transportname;
    (void)ucond;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaTransportEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaTransportEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaUserEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaUserGetInfo(JNIEnv* km_env, jclass km_clazz, jlong reserved, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)reserved, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)reserved;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1NetWkstaUserSetInfo(JNIEnv* km_env, jclass km_clazz, jlong reserved, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetWkstaUserSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)reserved, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)reserved;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterAssert(JNIEnv* km_env, jclass km_clazz, jlong pszfailedassertion, jlong pszfilename, jint dwlinenumber, jlong pszmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterAssert");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszfailedassertion, (void*)(uintptr_t)pszfilename, (uint32_t)dwlinenumber, (void*)(uintptr_t)pszmessage);
#else
    (void)pszfailedassertion;
    (void)pszfilename;
    (void)dwlinenumber;
    (void)pszmessage;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint dwerrorcode, jlong lplpszerrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwerrorcode, (void*)(uintptr_t)lplpszerrorstring) : 0;
#else
    (void)dwerrorcode;
    (void)lplpszerrorstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint dwerrorcode, jlong lplpwszerrorstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterGetErrorStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwerrorcode, (void*)(uintptr_t)lplpwszerrorstring) : 0;
#else
    (void)dwerrorcode;
    (void)lplpwszerrorstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogDeregisterA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle);
#else
    (void)hloghandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogDeregisterW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogDeregisterW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle);
#else
    (void)hloghandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventDataA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwdatabytes, jlong lpdatabytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwdatabytes, (void*)(uintptr_t)lpdatabytes);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventDataW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwdatabytes, jlong lpdatabytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventDataW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwdatabytes, (void*)(uintptr_t)lpdatabytes);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwdatabytes;
    (void)lpdatabytes;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventStringA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode, jint dwerrorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode, (uint32_t)dwerrorindex);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventStringW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode, jint dwerrorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventStringW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode, (uint32_t)dwerrorindex);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
    (void)dwerrorindex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventValistExA(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (void*)(uintptr_t)arglist);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventValistExW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwerrorcode, jint dwmessageid, jlong ptszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventValistExW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwerrorcode, (uint32_t)dwmessageid, (void*)(uintptr_t)ptszformat, (void*)(uintptr_t)arglist);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwerrorcode;
    (void)dwmessageid;
    (void)ptszformat;
    (void)arglist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogEventW(JNIEnv* km_env, jclass km_clazz, jlong hloghandle, jint dweventtype, jint dwmessageid, jint dwsubstringcount, jlong plpszsubstringarray, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogEventW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hloghandle, (uint32_t)dweventtype, (uint32_t)dwmessageid, (uint32_t)dwsubstringcount, (void*)(uintptr_t)plpszsubstringarray, (uint32_t)dwerrorcode);
#else
    (void)hloghandle;
    (void)dweventtype;
    (void)dwmessageid;
    (void)dwsubstringcount;
    (void)plpszsubstringarray;
    (void)dwerrorcode;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogRegisterA(JNIEnv* km_env, jclass km_clazz, jlong lpszsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsource) : NULL;
#else
    (void)lpszsource;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1RouterLogRegisterW(JNIEnv* km_env, jclass km_clazz, jlong lpszsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RouterLogRegisterW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsource) : NULL;
#else
    (void)lpszsource;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1SetNetScheduleAccountInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jlong pwszaccount, jlong pwszpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mstask.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNetScheduleAccountInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (void*)(uintptr_t)pwszaccount, (void*)(uintptr_t)pwszpassword) : -1;
#else
    (void)pwszservername;
    (void)pwszaccount;
    (void)pwszpassword;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDeregisterA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid) : 0;
#else
    (void)dwtraceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDeregisterExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDeregisterExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDeregisterW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDeregisterW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid) : 0;
#else
    (void)dwtraceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDumpExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpbbytes, jint dwbytecount, jint dwgroupsize, jint baddressprefix, jlong lpszprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpbbytes, (uint32_t)dwbytecount, (uint32_t)dwgroupsize, (int32_t)baddressprefix, (void*)(uintptr_t)lpszprefix) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceDumpExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpbbytes, jint dwbytecount, jint dwgroupsize, jint baddressprefix, jlong lpszprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceDumpExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpbbytes, (uint32_t)dwbytecount, (uint32_t)dwgroupsize, (int32_t)baddressprefix, (void*)(uintptr_t)lpszprefix) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpbbytes;
    (void)dwbytecount;
    (void)dwgroupsize;
    (void)baddressprefix;
    (void)lpszprefix;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceGetConsoleA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lphconsole) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lphconsole) : 0;
#else
    (void)dwtraceid;
    (void)lphconsole;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceGetConsoleW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jlong lphconsole) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceGetConsoleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (void*)(uintptr_t)lphconsole) : 0;
#else
    (void)dwtraceid;
    (void)lphconsole;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TracePutsExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszstring) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TracePutsExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TracePutsExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszstring) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceRegisterExA(JNIEnv* km_env, jclass km_clazz, jlong lpszcallername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcallername, (uint32_t)dwflags) : 0;
#else
    (void)lpszcallername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceRegisterExW(JNIEnv* km_env, jclass km_clazz, jlong lpszcallername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceRegisterExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcallername, (uint32_t)dwflags) : 0;
#else
    (void)lpszcallername;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceVprintfExA(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (void*)(uintptr_t)arglist) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_netmanagement_WindowsWin32NetworkmanagementNetmanagementJniBridge_windowssys_1windows_1win32_1networkmanagement_1netmanagement_1TraceVprintfExW(JNIEnv* km_env, jclass km_clazz, jint dwtraceid, jint dwflags, jlong lpszformat, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceVprintfExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtraceid, (uint32_t)dwflags, (void*)(uintptr_t)lpszformat, (void*)(uintptr_t)arglist) : 0;
#else
    (void)dwtraceid;
    (void)dwflags;
    (void)lpszformat;
    (void)arglist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

