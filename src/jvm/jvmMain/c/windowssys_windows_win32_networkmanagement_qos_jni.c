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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong arg1Socket, jlong destaddr, jint traffictype, jint flags, jlong flowid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSAddSocketToFlow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (uint64_t)arg1Socket, (void*)(uintptr_t)destaddr, (int32_t)traffictype, (uint32_t)flags, (void*)(uintptr_t)flowid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)arg1Socket;
    (void)destaddr;
    (void)traffictype;
    (void)flags;
    (void)flowid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSCancel(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCancel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong qoshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(JNIEnv* km_env, jclass km_clazz, jlong version, jlong qoshandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSCreateHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)version, (void*)(uintptr_t)qoshandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)version;
    (void)qoshandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong size, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSEnumerateFlows");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (void*)(uintptr_t)size, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)size;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jint flowid, jint operation, jlong size, jlong buffer, jint flags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSNotifyFlow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (uint32_t)flowid, (int32_t)operation, (void*)(uintptr_t)size, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jint flowid, jint operation, jlong size, jlong buffer, jint flags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSQueryFlow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (uint32_t)flowid, (int32_t)operation, (void*)(uintptr_t)size, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong arg1Socket, jint flowid, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSRemoveSocketFromFlow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (uint64_t)arg1Socket, (uint32_t)flowid, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)arg1Socket;
    (void)flowid;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jint flowid, jint operation, jint size, jlong buffer, jint flags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSSetFlow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (uint32_t)flowid, (int32_t)operation, (uint32_t)size, (void*)(uintptr_t)buffer, (uint32_t)flags, (void*)(uintptr_t)overlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)flowid;
    (void)operation;
    (void)size;
    (void)buffer;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong destaddr, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSStartTrackingClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (void*)(uintptr_t)destaddr, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)destaddr;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(JNIEnv* km_env, jclass km_clazz, jlong qoshandle, jlong destaddr, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("qwave.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QOSStopTrackingClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)qoshandle, (void*)(uintptr_t)destaddr, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)qoshandle;
    (void)destaddr;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcAddFilter(JNIEnv* km_env, jclass km_clazz, jlong flowhandle, jlong pgenericfilter, jlong pfilterhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcAddFilter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flowhandle, (void*)(uintptr_t)pgenericfilter, (void*)(uintptr_t)pfilterhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flowhandle;
    (void)pgenericfilter;
    (void)pfilterhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcAddFlow(JNIEnv* km_env, jclass km_clazz, jlong ifchandle, jlong clflowctx, jint flags, jlong pgenericflow, jlong pflowhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcAddFlow");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifchandle, (void*)(uintptr_t)clflowctx, (uint32_t)flags, (void*)(uintptr_t)pgenericflow, (void*)(uintptr_t)pflowhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifchandle;
    (void)clflowctx;
    (void)flags;
    (void)pgenericflow;
    (void)pflowhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(JNIEnv* km_env, jclass km_clazz, jlong ifchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcCloseInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifchandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifchandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(JNIEnv* km_env, jclass km_clazz, jlong filterhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeleteFilter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filterhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)filterhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(JNIEnv* km_env, jclass km_clazz, jlong flowhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeleteFlow");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flowhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flowhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(JNIEnv* km_env, jclass km_clazz, jlong clienthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcDeregisterClient");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clienthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(JNIEnv* km_env, jclass km_clazz, jlong ifchandle, jlong penumhandle, jlong pflowcount, jlong pbufsize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcEnumerateFlows");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifchandle, (void*)(uintptr_t)penumhandle, (void*)(uintptr_t)pflowcount, (void*)(uintptr_t)pbufsize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifchandle;
    (void)penumhandle;
    (void)pflowcount;
    (void)pbufsize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(JNIEnv* km_env, jclass km_clazz, jlong clienthandle, jlong pbuffersize, jlong interfacebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcEnumerateInterfaces");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienthandle, (void*)(uintptr_t)pbuffersize, (void*)(uintptr_t)interfacebuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clienthandle;
    (void)pbuffersize;
    (void)interfacebuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(JNIEnv* km_env, jclass km_clazz, jlong flowhandle, jint strsize, jlong pflowname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcGetFlowNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flowhandle, (uint32_t)strsize, (void*)(uintptr_t)pflowname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flowhandle;
    (void)strsize;
    (void)pflowname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(JNIEnv* km_env, jclass km_clazz, jlong flowhandle, jint strsize, jlong pflowname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcGetFlowNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flowhandle, (uint32_t)strsize, (void*)(uintptr_t)pflowname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flowhandle;
    (void)strsize;
    (void)pflowname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(JNIEnv* km_env, jclass km_clazz, jlong flowhandle, jlong pgenericflow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcModifyFlow");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)flowhandle, (void*)(uintptr_t)pgenericflow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flowhandle;
    (void)pgenericflow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(JNIEnv* km_env, jclass km_clazz, jlong pinterfacename, jlong clienthandle, jlong clifcctx, jlong pifchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcOpenInterfaceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterfacename, (void*)(uintptr_t)clienthandle, (void*)(uintptr_t)clifcctx, (void*)(uintptr_t)pifchandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterfacename;
    (void)clienthandle;
    (void)clifcctx;
    (void)pifchandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(JNIEnv* km_env, jclass km_clazz, jlong pinterfacename, jlong clienthandle, jlong clifcctx, jlong pifchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcOpenInterfaceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinterfacename, (void*)(uintptr_t)clienthandle, (void*)(uintptr_t)clifcctx, (void*)(uintptr_t)pifchandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinterfacename;
    (void)clienthandle;
    (void)clifcctx;
    (void)pifchandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(JNIEnv* km_env, jclass km_clazz, jlong pflowname, jlong pguidparam, jlong pbuffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryFlowA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflowname, (void*)(uintptr_t)pguidparam, (void*)(uintptr_t)pbuffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pflowname;
    (void)pguidparam;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(JNIEnv* km_env, jclass km_clazz, jlong pflowname, jlong pguidparam, jlong pbuffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryFlowW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflowname, (void*)(uintptr_t)pguidparam, (void*)(uintptr_t)pbuffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pflowname;
    (void)pguidparam;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(JNIEnv* km_env, jclass km_clazz, jlong ifchandle, jlong pguidparam, jboolean notifychange, jlong pbuffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcQueryInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifchandle, (void*)(uintptr_t)pguidparam, (bool)notifychange, (void*)(uintptr_t)pbuffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifchandle;
    (void)pguidparam;
    (void)notifychange;
    (void)pbuffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(JNIEnv* km_env, jclass km_clazz, jint tciversion, jlong clregctx, jlong clienthandlerlist, jlong pclienthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcRegisterClient");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)tciversion, (void*)(uintptr_t)clregctx, (void*)(uintptr_t)clienthandlerlist, (void*)(uintptr_t)pclienthandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)tciversion;
    (void)clregctx;
    (void)clienthandlerlist;
    (void)pclienthandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(JNIEnv* km_env, jclass km_clazz, jlong pflowname, jlong pguidparam, jint buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetFlowA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflowname, (void*)(uintptr_t)pguidparam, (uint32_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pflowname;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(JNIEnv* km_env, jclass km_clazz, jlong pflowname, jlong pguidparam, jint buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetFlowW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflowname, (void*)(uintptr_t)pguidparam, (uint32_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pflowname;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_qos_WindowsWin32NetworkmanagementQosJniBridge_windowssysWindowsWin32NetworkmanagementQosTcSetInterface(JNIEnv* km_env, jclass km_clazz, jlong ifchandle, jlong pguidparam, jint buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("traffic.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TcSetInterface");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifchandle, (void*)(uintptr_t)pguidparam, (uint32_t)buffersize, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ifchandle;
    (void)pguidparam;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

