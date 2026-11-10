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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCancelIncident(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCancelIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCloseIncident(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCloseIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateConnectivityIncident(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateConnectivityIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateDNSIncident(JNIEnv* km_env, jclass km_clazz, jlong hostname, jshort querytype, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateDNSIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint16_t)querytype, (void*)(uintptr_t)handle) : -1;
#else
    (void)hostname;
    (void)querytype;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateGroupingIncident(JNIEnv* km_env, jclass km_clazz, jlong cloudname, jlong groupname, jlong identity, jlong invitation, jlong addresses, jlong appid, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateGroupingIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cloudname, (void*)(uintptr_t)groupname, (void*)(uintptr_t)identity, (void*)(uintptr_t)invitation, (void*)(uintptr_t)addresses, (void*)(uintptr_t)appid, (void*)(uintptr_t)handle) : -1;
#else
    (void)cloudname;
    (void)groupname;
    (void)identity;
    (void)invitation;
    (void)addresses;
    (void)appid;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateIncident(JNIEnv* km_env, jclass km_clazz, jlong helperclassname, jint celt, jlong attributes, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)helperclassname, (uint32_t)celt, (void*)(uintptr_t)attributes, (void*)(uintptr_t)handle) : -1;
#else
    (void)helperclassname;
    (void)celt;
    (void)attributes;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreatePnrpIncident(JNIEnv* km_env, jclass km_clazz, jlong cloudname, jlong peername, jint diagnosepublish, jlong appid, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreatePnrpIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cloudname, (void*)(uintptr_t)peername, (int32_t)diagnosepublish, (void*)(uintptr_t)appid, (void*)(uintptr_t)handle) : -1;
#else
    (void)cloudname;
    (void)peername;
    (void)diagnosepublish;
    (void)appid;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateSharingIncident(JNIEnv* km_env, jclass km_clazz, jlong uncpath, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateSharingIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncpath, (void*)(uintptr_t)handle) : -1;
#else
    (void)uncpath;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateWebIncident(JNIEnv* km_env, jclass km_clazz, jlong url, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWebIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)url, (void*)(uintptr_t)handle) : -1;
#else
    (void)url;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateWebIncidentEx(JNIEnv* km_env, jclass km_clazz, jlong url, jint usewinhttp, jlong modulename, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWebIncidentEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)url, (int32_t)usewinhttp, (void*)(uintptr_t)modulename, (void*)(uintptr_t)handle) : -1;
#else
    (void)url;
    (void)usewinhttp;
    (void)modulename;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfCreateWinSockIncident(JNIEnv* km_env, jclass km_clazz, jlong sock, jlong host, jshort port, jlong appid, jlong userid, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfCreateWinSockIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sock, (void*)(uintptr_t)host, (uint16_t)port, (void*)(uintptr_t)appid, (void*)(uintptr_t)userid, (void*)(uintptr_t)handle) : -1;
#else
    (void)sock;
    (void)host;
    (void)port;
    (void)appid;
    (void)userid;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfDiagnoseIncident(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong rootcausecount, jlong rootcauses, jint dwwait, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfDiagnoseIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)rootcausecount, (void*)(uintptr_t)rootcauses, (uint32_t)dwwait, (uint32_t)dwflags) : -1;
#else
    (void)handle;
    (void)rootcausecount;
    (void)rootcauses;
    (void)dwwait;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfExecuteDiagnosis(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfExecuteDiagnosis");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)hwnd) : -1;
#else
    (void)handle;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfGetTraceFile(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong tracefilelocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfGetTraceFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)tracefilelocation) : -1;
#else
    (void)handle;
    (void)tracefilelocation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge_windowssys_1windows_1win32_1networkmanagement_1networkdiagnosticsframework_1ndfRepairIncident(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong repairex, jint dwwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndfapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdfRepairIncident");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)repairex, (uint32_t)dwwait) : -1;
#else
    (void)handle;
    (void)repairex;
    (void)dwwait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

