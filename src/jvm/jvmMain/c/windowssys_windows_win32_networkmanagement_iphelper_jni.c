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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(JNIEnv* km_env, jclass km_clazz, jint address, jint ipmask, jint ifindex, jlong ntecontext, jlong nteinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIPAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)address, (uint32_t)ipmask, (uint32_t)ifindex, (void*)(uintptr_t)ntecontext, (void*)(uintptr_t)nteinstance);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)address;
    (void)ipmask;
    (void)ifindex;
    (void)ntecontext;
    (void)nteinstance;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(JNIEnv* km_env, jclass km_clazz, jlong notifyoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIPChangeNotify");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)notifyoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)notifyoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(JNIEnv* km_env, jclass km_clazz, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelIfTimestampConfigChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notificationhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(JNIEnv* km_env, jclass km_clazz, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelMibChangeNotify2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong crosstimestamp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CaptureInterfaceHardwareCrossTimestamp");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)crosstimestamp);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)crosstimestamp;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(JNIEnv* km_env, jclass km_clazz, jlong compartmentguid, jlong compartmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertCompartmentGuidToId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)compartmentguid, (void*)(uintptr_t)compartmentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)compartmentguid;
    (void)compartmentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(JNIEnv* km_env, jclass km_clazz, jint compartmentid, jlong compartmentguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertCompartmentIdToGuid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)compartmentid, (void*)(uintptr_t)compartmentguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)compartmentid;
    (void)compartmentguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(JNIEnv* km_env, jclass km_clazz, jlong interfacealias, jlong interfaceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceAliasToLuid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfacealias, (void*)(uintptr_t)interfaceluid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfacealias;
    (void)interfaceluid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(JNIEnv* km_env, jclass km_clazz, jlong interfaceguid, jlong interfaceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceGuidToLuid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceguid, (void*)(uintptr_t)interfaceluid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceguid;
    (void)interfaceluid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(JNIEnv* km_env, jclass km_clazz, jint interfaceindex, jlong interfaceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceIndexToLuid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)interfaceindex, (void*)(uintptr_t)interfaceluid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceindex;
    (void)interfaceluid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong interfacealias, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToAlias");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)interfacealias, (uint64_t)length);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfacealias;
    (void)length;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong interfaceguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToGuid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)interfaceguid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfaceguid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong interfaceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)interfaceindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfaceindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong interfacename, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)interfacename, (uint64_t)length);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong interfacename, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceLuidToNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)interfacename, (uint64_t)length);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfacename;
    (void)length;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(JNIEnv* km_env, jclass km_clazz, jlong interfacename, jlong interfaceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfacename, (void*)(uintptr_t)interfaceluid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfacename;
    (void)interfaceluid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(JNIEnv* km_env, jclass km_clazz, jlong interfacename, jlong interfaceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertInterfaceNameToLuidW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfacename, (void*)(uintptr_t)interfaceluid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfacename;
    (void)interfaceluid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(JNIEnv* km_env, jclass km_clazz, jint mask, jlong masklength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertIpv4MaskToLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mask, (void*)(uintptr_t)masklength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mask;
    (void)masklength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(JNIEnv* km_env, jclass km_clazz, jint masklength, jlong mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertLengthToIpv4Mask");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)masklength, (void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)masklength;
    (void)mask;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAnycastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(JNIEnv* km_env, jclass km_clazz, jlong proute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpForwardEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpForwardEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(JNIEnv* km_env, jclass km_clazz, jlong parpentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpNetEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parpentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)parpentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIpNetEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePersistentTcpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePersistentUdpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(JNIEnv* km_env, jclass km_clazz, jint dwaddress, jint dwmask, jint dwifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProxyArpEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwaddress, (uint32_t)dwmask, (uint32_t)dwifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(JNIEnv* km_env, jclass km_clazz, jlong sourceaddresslist, jint sourceaddresscount, jlong destinationaddresslist, jint destinationaddresscount, jint addresssortoptions, jlong sortedaddresspairlist, jlong sortedaddresspaircount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSortedAddressPairs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourceaddresslist, (uint32_t)sourceaddresscount, (void*)(uintptr_t)destinationaddresslist, (uint32_t)destinationaddresscount, (uint32_t)addresssortoptions, (void*)(uintptr_t)sortedaddresspairlist, (void*)(uintptr_t)sortedaddresspaircount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourceaddresslist;
    (void)sourceaddresscount;
    (void)destinationaddresslist;
    (void)destinationaddresscount;
    (void)addresssortoptions;
    (void)sortedaddresspairlist;
    (void)sortedaddresspaircount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUnicastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAnycastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(JNIEnv* km_env, jclass km_clazz, jint ntecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIPAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ntecontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ntecontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(JNIEnv* km_env, jclass km_clazz, jlong proute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpForwardEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpForwardEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(JNIEnv* km_env, jclass km_clazz, jlong parpentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpNetEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parpentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)parpentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIpNetEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePersistentTcpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePersistentUdpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(JNIEnv* km_env, jclass km_clazz, jint dwaddress, jint dwmask, jint dwifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProxyArpEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwaddress, (uint32_t)dwmask, (uint32_t)dwifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwaddress;
    (void)dwmask;
    (void)dwifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUnicastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(JNIEnv* km_env, jclass km_clazz, jlong phandle, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableMediaSense");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phandle, (void*)(uintptr_t)poverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phandle;
    (void)poverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperEnableRouter(JNIEnv* km_env, jclass km_clazz, jlong phandle, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableRouter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phandle, (void*)(uintptr_t)poverlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phandle;
    (void)poverlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(JNIEnv* km_env, jclass km_clazz, jint dwifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpNetTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(JNIEnv* km_env, jclass km_clazz, jshort family, jint interfaceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpNetTable2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (uint32_t)interfaceindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)interfaceindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(JNIEnv* km_env, jclass km_clazz, jshort family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushIpPathTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeDnsSettings");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
    }
#else
    (void)settings;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInterfaceDnsSettings");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
    }
#else
    (void)settings;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(JNIEnv* km_env, jclass km_clazz, jlong memory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeMibTable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)memory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)memory;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong ifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdapterIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)ifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adaptername;
    (void)ifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdapterOrderMap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(JNIEnv* km_env, jclass km_clazz, jint family, jint flags, jlong reserved, jlong adapteraddresses, jlong sizepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdaptersAddresses");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)family, (uint32_t)flags, (void*)(uintptr_t)reserved, (void*)(uintptr_t)adapteraddresses, (void*)(uintptr_t)sizepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)flags;
    (void)reserved;
    (void)adapteraddresses;
    (void)sizepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(JNIEnv* km_env, jclass km_clazz, jlong adapterinfo, jlong sizepointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAdaptersInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adapterinfo, (void*)(uintptr_t)sizepointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adapterinfo;
    (void)sizepointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAnycastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAnycastIpAddressTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(JNIEnv* km_env, jclass km_clazz, jint dwdestaddr, jlong pdwbestifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdestaddr, (void*)(uintptr_t)pdwbestifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwdestaddr;
    (void)pdwbestifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(JNIEnv* km_env, jclass km_clazz, jlong pdestaddr, jlong pdwbestifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestInterfaceEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdestaddr, (void*)(uintptr_t)pdwbestifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdestaddr;
    (void)pdwbestifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(JNIEnv* km_env, jclass km_clazz, jint dwdestaddr, jint dwsourceaddr, jlong pbestroute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestRoute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdestaddr, (uint32_t)dwsourceaddr, (void*)(uintptr_t)pbestroute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwdestaddr;
    (void)dwsourceaddr;
    (void)pbestroute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jint interfaceindex, jlong sourceaddress, jlong destinationaddress, jint addresssortoptions, jlong bestroute, jlong bestsourceaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBestRoute2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (uint32_t)interfaceindex, (void*)(uintptr_t)sourceaddress, (void*)(uintptr_t)destinationaddress, (uint32_t)addresssortoptions, (void*)(uintptr_t)bestroute, (void*)(uintptr_t)bestsourceaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)interfaceindex;
    (void)sourceaddress;
    (void)destinationaddress;
    (void)addresssortoptions;
    (void)bestroute;
    (void)bestsourceaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentId");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(JNIEnv* km_env, jclass km_clazz, jlong compartmentscope, jlong compartmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadCompartmentScope");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)compartmentscope, (void*)(uintptr_t)compartmentid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)compartmentscope;
    (void)compartmentid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultCompartmentId");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDnsSettings");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)settings;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(JNIEnv* km_env, jclass km_clazz, jlong ptcptable, jlong pdwsize, jint border, jint ulaf, jint tableclass, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExtendedTcpTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptcptable, (void*)(uintptr_t)pdwsize, (int32_t)border, (uint32_t)ulaf, (int32_t)tableclass, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ptcptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(JNIEnv* km_env, jclass km_clazz, jlong pudptable, jlong pdwsize, jint border, jint ulaf, jint tableclass, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExtendedUdpTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pudptable, (void*)(uintptr_t)pdwsize, (int32_t)border, (uint32_t)ulaf, (int32_t)tableclass, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pudptable;
    (void)pdwsize;
    (void)border;
    (void)ulaf;
    (void)tableclass;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(JNIEnv* km_env, jclass km_clazz, jint ifindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFriendlyIfIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ifindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(JNIEnv* km_env, jclass km_clazz, jlong statistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIcmpStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIcmpStatisticsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(JNIEnv* km_env, jclass km_clazz, jlong pifrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pifrow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pifrow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(JNIEnv* km_env, jclass km_clazz, jint level, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfEntry2Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)level, (void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)level;
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(JNIEnv* km_env, jclass km_clazz, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfStackTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfTable(JNIEnv* km_env, jclass km_clazz, jlong piftable, jlong pdwsize, jint border) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)piftable, (void*)(uintptr_t)pdwsize, (int32_t)border);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)piftable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(JNIEnv* km_env, jclass km_clazz, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(JNIEnv* km_env, jclass km_clazz, jint level, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIfTable2Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)level, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)level;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong timestampcapabilites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceActiveTimestampCapabilities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)timestampcapabilites);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong timestampcapabilites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceCurrentTimestampCapabilities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)timestampcapabilites);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong timestampcapabilites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceHardwareTimestampCapabilities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)timestampcapabilites);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(JNIEnv* km_env, jclass km_clazz, jlong piftable, jlong dwoutbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)piftable, (void*)(uintptr_t)dwoutbuflen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)piftable;
    (void)dwoutbuflen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(JNIEnv* km_env, jclass km_clazz, jlong interfaceluid, jlong timestampcapabilites) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInterfaceSupportedTimestampCapabilities");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceluid, (void*)(uintptr_t)timestampcapabilites);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceluid;
    (void)timestampcapabilites;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(JNIEnv* km_env, jclass km_clazz, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInvertedIfStackTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(JNIEnv* km_env, jclass km_clazz, jlong pipaddrtable, jlong pdwsize, jint border) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpAddrTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pipaddrtable, (void*)(uintptr_t)pdwsize, (int32_t)border);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pipaddrtable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(JNIEnv* km_env, jclass km_clazz, jint errorcode, jlong buffer, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpErrorString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)errorcode, (void*)(uintptr_t)buffer, (void*)(uintptr_t)size);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)errorcode;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(JNIEnv* km_env, jclass km_clazz, jlong pipforwardtable, jlong pdwsize, jint border) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pipforwardtable, (void*)(uintptr_t)pdwsize, (int32_t)border);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pipforwardtable;
    (void)pdwsize;
    (void)border;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpForwardTable2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpInterfaceEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpInterfaceTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(JNIEnv* km_env, jclass km_clazz, jlong ipnettable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ipnettable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ipnettable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetTable2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(JNIEnv* km_env, jclass km_clazz, jint interfaceindex, jshort addressfamily, jlong bandwidthestimates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpNetworkConnectionBandwidthEstimates");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)interfaceindex, (uint16_t)addressfamily, (void*)(uintptr_t)bandwidthestimates);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceindex;
    (void)addressfamily;
    (void)bandwidthestimates;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpPathEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpPathTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(JNIEnv* km_env, jclass km_clazz, jlong statistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIpStatisticsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(JNIEnv* km_env, jclass km_clazz, jlong jobhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetJobCompartmentId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)jobhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)jobhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMulticastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMulticastIpAddressTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(JNIEnv* km_env, jclass km_clazz, jlong connectivityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkConnectivityHint");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connectivityhint);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connectivityhint;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(JNIEnv* km_env, jclass km_clazz, jint interfaceindex, jlong connectivityhint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkConnectivityHintForInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)interfaceindex, (void*)(uintptr_t)connectivityhint);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceindex;
    (void)connectivityhint;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(JNIEnv* km_env, jclass km_clazz, jlong networkguid, jlong compartmentid, jlong siteid, jlong networkname, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkguid, (void*)(uintptr_t)compartmentid, (void*)(uintptr_t)siteid, (void*)(uintptr_t)networkname, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)networkguid;
    (void)compartmentid;
    (void)siteid;
    (void)networkname;
    (void)length;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(JNIEnv* km_env, jclass km_clazz, jlong pfixedinfo, jlong poutbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNetworkParams");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfixedinfo, (void*)(uintptr_t)poutbuflen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pfixedinfo;
    (void)poutbuflen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(JNIEnv* km_env, jclass km_clazz, jlong pdwnumif) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfInterfaces");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwnumif);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdwnumif;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(JNIEnv* km_env, jclass km_clazz, jint ulpid, jlong pinfo, jint arg2Class, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromPidAndInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulpid, (void*)(uintptr_t)pinfo, (int32_t)arg2Class, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulpid;
    (void)pinfo;
    (void)arg2Class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(JNIEnv* km_env, jclass km_clazz, jlong ptcpentry, jint arg1Class, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromTcp6Entry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptcpentry, (int32_t)arg1Class, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ptcpentry;
    (void)arg1Class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(JNIEnv* km_env, jclass km_clazz, jlong ptcpentry, jint arg1Class, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromTcpEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptcpentry, (int32_t)arg1Class, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ptcpentry;
    (void)arg1Class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(JNIEnv* km_env, jclass km_clazz, jlong pudpentry, jint arg1Class, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromUdp6Entry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pudpentry, (int32_t)arg1Class, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pudpentry;
    (void)arg1Class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(JNIEnv* km_env, jclass km_clazz, jlong pudpentry, jint arg1Class, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOwnerModuleFromUdpEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pudpentry, (int32_t)arg1Class, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pudpentry;
    (void)arg1Class;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(JNIEnv* km_env, jclass km_clazz, jint ifindex, jlong pperadapterinfo, jlong poutbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerAdapterInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ifindex, (void*)(uintptr_t)pperadapterinfo, (void*)(uintptr_t)poutbuflen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifindex;
    (void)pperadapterinfo;
    (void)poutbuflen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(JNIEnv* km_env, jclass km_clazz, jlong row, jint estatstype, jlong rw, jint rwversion, jint rwsize, jlong ros, jint rosversion, jint rossize, jlong rod, jint rodversion, jint rodsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerTcp6ConnectionEStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row, (int32_t)estatstype, (void*)(uintptr_t)rw, (uint32_t)rwversion, (uint32_t)rwsize, (void*)(uintptr_t)ros, (uint32_t)rosversion, (uint32_t)rossize, (void*)(uintptr_t)rod, (uint32_t)rodversion, (uint32_t)rodsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(JNIEnv* km_env, jclass km_clazz, jlong row, jint estatstype, jlong rw, jint rwversion, jint rwsize, jlong ros, jint rosversion, jint rossize, jlong rod, jint rodversion, jint rodsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerTcpConnectionEStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row, (int32_t)estatstype, (void*)(uintptr_t)rw, (uint32_t)rwversion, (uint32_t)rwsize, (void*)(uintptr_t)ros, (uint32_t)rosversion, (uint32_t)rossize, (void*)(uintptr_t)rod, (uint32_t)rodversion, (uint32_t)rodsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)ros;
    (void)rosversion;
    (void)rossize;
    (void)rod;
    (void)rodversion;
    (void)rodsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(JNIEnv* km_env, jclass km_clazz, jint destipaddress, jlong hopcount, jint maxhops, jlong rtt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRTTAndHopCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)destipaddress, (void*)(uintptr_t)hopcount, (uint32_t)maxhops, (void*)(uintptr_t)rtt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destipaddress;
    (void)hopcount;
    (void)maxhops;
    (void)rtt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(JNIEnv* km_env, jclass km_clazz, jint sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSessionCompartmentId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(JNIEnv* km_env, jclass km_clazz, jlong tcptable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcp6Table");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tcptable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(JNIEnv* km_env, jclass km_clazz, jlong tcptable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcp6Table2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tcptable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(JNIEnv* km_env, jclass km_clazz, jlong statistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatisticsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpStatisticsEx2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(JNIEnv* km_env, jclass km_clazz, jlong tcptable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tcptable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(JNIEnv* km_env, jclass km_clazz, jlong tcptable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTcpTable2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tcptable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)tcptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(JNIEnv* km_env, jclass km_clazz, jlong port) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTeredoPort");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)port);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)port;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(JNIEnv* km_env, jclass km_clazz, jlong udp6table, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdp6Table");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)udp6table, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udp6table;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(JNIEnv* km_env, jclass km_clazz, jlong stats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stats);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)stats;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatisticsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpStatisticsEx2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(JNIEnv* km_env, jclass km_clazz, jlong udptable, jlong sizepointer, jint order) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUdpTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)udptable, (void*)(uintptr_t)sizepointer, (int32_t)order);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udptable;
    (void)sizepointer;
    (void)order;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(JNIEnv* km_env, jclass km_clazz, jlong pipifinfo, jlong dwoutbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUniDirectionalAdapterInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pipifinfo, (void*)(uintptr_t)dwoutbuflen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pipifinfo;
    (void)dwoutbuflen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUnicastIpAddressTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Icmp6CreateFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(JNIEnv* km_env, jclass km_clazz, jlong replybuffer, jint replysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Icmp6ParseReplies");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)replybuffer, (uint32_t)replysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)replybuffer;
    (void)replysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(JNIEnv* km_env, jclass km_clazz, jlong icmphandle, jlong event, jlong apcroutine, jlong apccontext, jlong sourceaddress, jlong destinationaddress, jlong requestdata, jshort requestsize, jlong requestoptions, jlong replybuffer, jint replysize, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Icmp6SendEcho2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)icmphandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)sourceaddress, (void*)(uintptr_t)destinationaddress, (void*)(uintptr_t)requestdata, (uint16_t)requestsize, (void*)(uintptr_t)requestoptions, (void*)(uintptr_t)replybuffer, (uint32_t)replysize, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)icmphandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)sourceaddress;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong icmphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpCloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)icmphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)icmphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpCreateFile");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(JNIEnv* km_env, jclass km_clazz, jlong replybuffer, jint replysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpParseReplies");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)replybuffer, (uint32_t)replysize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)replybuffer;
    (void)replysize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(JNIEnv* km_env, jclass km_clazz, jlong icmphandle, jint destinationaddress, jlong requestdata, jshort requestsize, jlong requestoptions, jlong replybuffer, jint replysize, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpSendEcho");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)icmphandle, (uint32_t)destinationaddress, (void*)(uintptr_t)requestdata, (uint16_t)requestsize, (void*)(uintptr_t)requestoptions, (void*)(uintptr_t)replybuffer, (uint32_t)replysize, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)icmphandle;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(JNIEnv* km_env, jclass km_clazz, jlong icmphandle, jlong event, jlong apcroutine, jlong apccontext, jint destinationaddress, jlong requestdata, jshort requestsize, jlong requestoptions, jlong replybuffer, jint replysize, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpSendEcho2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)icmphandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (uint32_t)destinationaddress, (void*)(uintptr_t)requestdata, (uint16_t)requestsize, (void*)(uintptr_t)requestoptions, (void*)(uintptr_t)replybuffer, (uint32_t)replysize, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)icmphandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(JNIEnv* km_env, jclass km_clazz, jlong icmphandle, jlong event, jlong apcroutine, jlong apccontext, jint sourceaddress, jint destinationaddress, jlong requestdata, jshort requestsize, jlong requestoptions, jlong replybuffer, jint replysize, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, uint16_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IcmpSendEcho2Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)icmphandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (uint32_t)sourceaddress, (uint32_t)destinationaddress, (void*)(uintptr_t)requestdata, (uint16_t)requestsize, (void*)(uintptr_t)requestoptions, (void*)(uintptr_t)replybuffer, (uint32_t)replysize, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)icmphandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)sourceaddress;
    (void)destinationaddress;
    (void)requestdata;
    (void)requestsize;
    (void)requestoptions;
    (void)replybuffer;
    (void)replysize;
    (void)timeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeIpForwardEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
    }
#else
    (void)row;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeIpInterfaceEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
    }
#else
    (void)row;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeUnicastIpAddressEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
    }
#else
    (void)row;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(JNIEnv* km_env, jclass km_clazz, jlong adapterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IpReleaseAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adapterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adapterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(JNIEnv* km_env, jclass km_clazz, jlong adapterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IpRenewAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adapterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adapterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPersistentTcpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(JNIEnv* km_env, jclass km_clazz, jshort startport, jshort numberofports, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPersistentUdpPortReservation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)startport, (uint16_t)numberofports, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startport;
    (void)numberofports;
    (void)token;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(JNIEnv* km_env, jclass km_clazz, jlong pptable, jlong pdwcount, jint border, jlong hheap, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NhpAllocateAndGetInterfaceInfoFromStack");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pptable, (void*)(uintptr_t)pdwcount, (int32_t)border, (void*)(uintptr_t)hheap, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pptable;
    (void)pdwcount;
    (void)border;
    (void)hheap;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyAddrChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(JNIEnv* km_env, jclass km_clazz, jlong callercontext, jlong callback, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyIfTimestampConfigChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callercontext, (void*)(uintptr_t)callback, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callercontext;
    (void)callback;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(JNIEnv* km_env, jclass km_clazz, jshort family, jlong callback, jlong callercontext, jboolean initialnotification, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyIpInterfaceChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (bool)initialnotification, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong callercontext, jboolean initialnotification, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyNetworkConnectivityHintChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (bool)initialnotification, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyRouteChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)overlapped;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(JNIEnv* km_env, jclass km_clazz, jshort addressfamily, jlong callback, jlong callercontext, jboolean initialnotification, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyRouteChange2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)addressfamily, (void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (bool)initialnotification, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)addressfamily;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(JNIEnv* km_env, jclass km_clazz, jshort family, jlong table, jlong callercallback, jlong callercontext, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyStableUnicastIpAddressTable");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)table, (void*)(uintptr_t)callercallback, (void*)(uintptr_t)callercontext, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)table;
    (void)callercallback;
    (void)callercontext;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong callercontext, jboolean initialnotification, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyTeredoPortChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (bool)initialnotification, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(JNIEnv* km_env, jclass km_clazz, jshort family, jlong callback, jlong callercontext, jboolean initialnotification, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyUnicastIpAddressChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)family, (void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (bool)initialnotification, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)family;
    (void)callback;
    (void)callercontext;
    (void)initialnotification;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(JNIEnv* km_env, jclass km_clazz, jlong networkstring, jint types, jlong addressinfo, jlong portnumber, jlong prefixlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseNetworkString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkstring, (uint32_t)types, (void*)(uintptr_t)addressinfo, (void*)(uintptr_t)portnumber, (void*)(uintptr_t)prefixlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)networkstring;
    (void)types;
    (void)addressinfo;
    (void)portnumber;
    (void)prefixlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(JNIEnv* km_env, jclass km_clazz, jlong ih, jint cinfilters, jlong pfiltin, jint coutfilters, jlong pfiltout, jlong pfhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfAddFiltersToInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ih, (uint32_t)cinfilters, (void*)(uintptr_t)pfiltin, (uint32_t)coutfilters, (void*)(uintptr_t)pfiltout, (void*)(uintptr_t)pfhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    (void)pfhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jint gffilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfAddGlobalFilterToInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (int32_t)gffilter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)gffilter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jint pfattype, jlong ipaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfBindInterfaceToIPAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (int32_t)pfattype, (void*)(uintptr_t)ipaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)pfattype;
    (void)ipaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jint dwindex, jint pfatlinktype, jlong linkipaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfBindInterfaceToIndex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (uint32_t)dwindex, (int32_t)pfatlinktype, (void*)(uintptr_t)linkipaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)dwindex;
    (void)pfatlinktype;
    (void)linkipaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(JNIEnv* km_env, jclass km_clazz, jint dwname, jint inaction, jint outaction, jint buselog, jint bmustbeunique, jlong ppinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfCreateInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwname, (int32_t)inaction, (int32_t)outaction, (int32_t)buselog, (int32_t)bmustbeunique, (void*)(uintptr_t)ppinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwname;
    (void)inaction;
    (void)outaction;
    (void)buselog;
    (void)bmustbeunique;
    (void)ppinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(JNIEnv* km_env, jclass km_clazz, jlong pinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfDeleteInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfDeleteLog");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jlong ppfstats, jlong pdwbuffersize, jint fresetcounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfGetInterfaceStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (void*)(uintptr_t)ppfstats, (void*)(uintptr_t)pdwbuffersize, (int32_t)fresetcounters);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)ppfstats;
    (void)pdwbuffersize;
    (void)fresetcounters;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfMakeLog");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jlong platebindinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRebindFilters");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (void*)(uintptr_t)platebindinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)platebindinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jint cfilters, jlong pvhandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveFilterHandles");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (uint32_t)cfilters, (void*)(uintptr_t)pvhandles);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)cfilters;
    (void)pvhandles;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(JNIEnv* km_env, jclass km_clazz, jlong ih, jint cinfilters, jlong pfiltin, jint coutfilters, jlong pfiltout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveFiltersFromInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ih, (uint32_t)cinfilters, (void*)(uintptr_t)pfiltin, (uint32_t)coutfilters, (void*)(uintptr_t)pfiltout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ih;
    (void)cinfilters;
    (void)pfiltin;
    (void)coutfilters;
    (void)pfiltout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(JNIEnv* km_env, jclass km_clazz, jlong pinterface, jint gffilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfRemoveGlobalFilterFromInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface, (int32_t)gffilter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    (void)gffilter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(JNIEnv* km_env, jclass km_clazz, jlong pbbuffer, jint dwsize, jint dwthreshold, jint dwentries, jlong pdwloggedentries, jlong pdwlostentries, jlong pdwsizeused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfSetLogBuffer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbbuffer, (uint32_t)dwsize, (uint32_t)dwthreshold, (uint32_t)dwentries, (void*)(uintptr_t)pdwloggedentries, (void*)(uintptr_t)pdwlostentries, (void*)(uintptr_t)pdwsizeused);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbbuffer;
    (void)dwsize;
    (void)dwthreshold;
    (void)dwentries;
    (void)pdwloggedentries;
    (void)pdwlostentries;
    (void)pdwsizeused;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(JNIEnv* km_env, jclass km_clazz, jlong pininterface, jlong poutinterface, jint cbytes, jlong pbpacket, jlong ppaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfTestPacket");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pininterface, (void*)(uintptr_t)poutinterface, (uint32_t)cbytes, (void*)(uintptr_t)pbpacket, (void*)(uintptr_t)ppaction);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pininterface;
    (void)poutinterface;
    (void)cbytes;
    (void)pbpacket;
    (void)ppaction;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(JNIEnv* km_env, jclass km_clazz, jlong pinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfUnBindInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterface);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterface;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong callercontext, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterInterfaceTimestampConfigChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)callercontext, (void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)callback;
    (void)callercontext;
    (void)notificationhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(JNIEnv* km_env, jclass km_clazz, jlong row, jlong sourceaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveIpNetEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row, (void*)(uintptr_t)sourceaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    (void)sourceaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong physicaladdress, jlong physicaladdresslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveNeighbor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)physicaladdress, (void*)(uintptr_t)physicaladdresslength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)networkaddress;
    (void)physicaladdress;
    (void)physicaladdresslength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(JNIEnv* km_env, jclass km_clazz, jlong poverlapped, jlong lpdwenablecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreMediaSense");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poverlapped, (void*)(uintptr_t)lpdwenablecount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSendARP(JNIEnv* km_env, jclass km_clazz, jint destip, jint srcip, jlong pmacaddr, jlong phyaddrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendARP");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)destip, (uint32_t)srcip, (void*)(uintptr_t)pmacaddr, (void*)(uintptr_t)phyaddrlen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)destip;
    (void)srcip;
    (void)pmacaddr;
    (void)phyaddrlen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(JNIEnv* km_env, jclass km_clazz, jint compartmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)compartmentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)compartmentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(JNIEnv* km_env, jclass km_clazz, jint compartmentscope) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentThreadCompartmentScope");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)compartmentscope);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)compartmentscope;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(JNIEnv* km_env, jclass km_clazz, jlong settings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDnsSettings");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)settings);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)settings;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(JNIEnv* km_env, jclass km_clazz, jlong pifrow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIfEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pifrow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pifrow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(JNIEnv* km_env, jclass km_clazz, jlong proute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpForwardEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)proute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)proute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(JNIEnv* km_env, jclass km_clazz, jlong route) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpForwardEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)route);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)route;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpInterfaceEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(JNIEnv* km_env, jclass km_clazz, jlong parpentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpNetEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parpentry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)parpentry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpNetEntry2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(JNIEnv* km_env, jclass km_clazz, jlong pipstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pipstats);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pipstats;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(JNIEnv* km_env, jclass km_clazz, jlong statistics, jint family) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpStatisticsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statistics, (uint32_t)family);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)statistics;
    (void)family;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(JNIEnv* km_env, jclass km_clazz, jint nttl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIpTTL");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nttl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nttl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(JNIEnv* km_env, jclass km_clazz, jlong jobhandle, jint compartmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetJobCompartmentId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)jobhandle, (uint32_t)compartmentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)jobhandle;
    (void)compartmentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(JNIEnv* km_env, jclass km_clazz, jlong networkguid, jint compartmentid, jlong networkname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNetworkInformation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkguid, (uint32_t)compartmentid, (void*)(uintptr_t)networkname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)networkguid;
    (void)compartmentid;
    (void)networkname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(JNIEnv* km_env, jclass km_clazz, jlong row, jint estatstype, jlong rw, jint rwversion, jint rwsize, jint offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerTcp6ConnectionEStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row, (int32_t)estatstype, (void*)(uintptr_t)rw, (uint32_t)rwversion, (uint32_t)rwsize, (uint32_t)offset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(JNIEnv* km_env, jclass km_clazz, jlong row, jint estatstype, jlong rw, jint rwversion, jint rwsize, jint offset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPerTcpConnectionEStats");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row, (int32_t)estatstype, (void*)(uintptr_t)rw, (uint32_t)rwversion, (uint32_t)rwsize, (uint32_t)offset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    (void)estatstype;
    (void)rw;
    (void)rwversion;
    (void)rwsize;
    (void)offset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(JNIEnv* km_env, jclass km_clazz, jint sessionid, jint compartmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSessionCompartmentId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sessionid, (uint32_t)compartmentid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sessionid;
    (void)compartmentid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(JNIEnv* km_env, jclass km_clazz, jlong ptcprow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTcpEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptcprow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ptcprow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(JNIEnv* km_env, jclass km_clazz, jlong row) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUnicastIpAddressEntry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)row);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)row;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(JNIEnv* km_env, jclass km_clazz, jlong poverlapped, jlong lpdwenablecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnenableRouter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poverlapped, (void*)(uintptr_t)lpdwenablecount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)poverlapped;
    (void)lpdwenablecount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(JNIEnv* km_env, jclass km_clazz, jlong notificationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterInterfaceTimestampConfigChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)notificationhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notificationhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(JNIEnv* km_env, jclass km_clazz, jint interfaceindex, jlong interfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "if_indextoname");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)interfaceindex, (void*)(uintptr_t)interfacename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)interfaceindex;
    (void)interfacename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_iphelper_WindowsWin32NetworkmanagementIphelperJniBridge_windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(JNIEnv* km_env, jclass km_clazz, jlong interfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("iphlpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "if_nametoindex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfacename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfacename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

