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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1ncFreeNetconProperties(JNIEnv* km_env, jclass km_clazz, jlong pprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netshell.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NcFreeNetconProperties");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pprops);
#else
    (void)pprops;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1ncIsValidConnectionName(JNIEnv* km_env, jclass km_clazz, jlong pszwname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netshell.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NcIsValidConnectionName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszwname) : -1;
#else
    (void)pszwname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationDiagnoseConnectFailureAndGetInfo(JNIEnv* km_env, jclass km_clazz, jlong wszservername, jlong netisoerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationDiagnoseConnectFailureAndGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wszservername, (void*)(uintptr_t)netisoerror) : 0;
#else
    (void)wszservername;
    (void)netisoerror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationEnumAppContainers(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pdwnumpublicappcs, jlong pppublicappcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationEnumAppContainers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)pdwnumpublicappcs, (void*)(uintptr_t)pppublicappcs) : 0;
#else
    (void)flags;
    (void)pdwnumpublicappcs;
    (void)pppublicappcs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationEnumerateAppContainerRules(JNIEnv* km_env, jclass km_clazz, jlong newenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationEnumerateAppContainerRules");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)newenum) : -1;
#else
    (void)newenum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationFreeAppContainers(JNIEnv* km_env, jclass km_clazz, jlong ppublicappcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationFreeAppContainers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppublicappcs) : 0;
#else
    (void)ppublicappcs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationGetAppContainerConfig(JNIEnv* km_env, jclass km_clazz, jlong pdwnumpublicappcs, jlong appcontainersids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetAppContainerConfig");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwnumpublicappcs, (void*)(uintptr_t)appcontainersids) : 0;
#else
    (void)pdwnumpublicappcs;
    (void)appcontainersids;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationGetEnterpriseIdAsync(JNIEnv* km_env, jclass km_clazz, jlong wszservername, jint dwflags, jlong context, jlong callback, jlong hoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetEnterpriseIdAsync");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wszservername, (uint32_t)dwflags, (void*)(uintptr_t)context, (void*)(uintptr_t)callback, (void*)(uintptr_t)hoperation) : 0;
#else
    (void)wszservername;
    (void)dwflags;
    (void)context;
    (void)callback;
    (void)hoperation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationGetEnterpriseIdClose(JNIEnv* km_env, jclass km_clazz, jlong hoperation, jint bwaitforoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("firewallapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationGetEnterpriseIdClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hoperation, (int32_t)bwaitforoperation) : 0;
#else
    (void)hoperation;
    (void)bwaitforoperation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationRegisterForAppContainerChanges(JNIEnv* km_env, jclass km_clazz, jint flags, jlong callback, jlong context, jlong registrationobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationRegisterForAppContainerChanges");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)registrationobject) : 0;
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)registrationobject;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationSetAppContainerConfig(JNIEnv* km_env, jclass km_clazz, jint dwnumpublicappcs, jlong appcontainersids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationSetAppContainerConfig");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwnumpublicappcs, (void*)(uintptr_t)appcontainersids) : 0;
#else
    (void)dwnumpublicappcs;
    (void)appcontainersids;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationSetupAppContainerBinaries(JNIEnv* km_env, jclass km_clazz, jlong applicationcontainersid, jlong packagefullname, jlong packagefolder, jlong displayname, jint bbinariesfullycomputed, jlong binaries, jint binariescount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationSetupAppContainerBinaries");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)applicationcontainersid, (void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagefolder, (void*)(uintptr_t)displayname, (int32_t)bbinariesfullycomputed, (void*)(uintptr_t)binaries, (uint32_t)binariescount) : -1;
#else
    (void)applicationcontainersid;
    (void)packagefullname;
    (void)packagefolder;
    (void)displayname;
    (void)bbinariesfullycomputed;
    (void)binaries;
    (void)binariescount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_windowsfirewall_WindowsWin32NetworkmanagementWindowsfirewallJniBridge_windowssys_1windows_1win32_1networkmanagement_1windowsfirewall_1networkIsolationUnregisterForAppContainerChanges(JNIEnv* km_env, jclass km_clazz, jlong registrationobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-net-isolation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetworkIsolationUnregisterForAppContainerChanges");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)registrationobject) : 0;
#else
    (void)registrationobject;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

