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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jint reqid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCancelMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int32_t)reqid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)reqid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanupEx");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpClose(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr(JNIEnv* km_env, jclass km_clazz, jlong context, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpContextToStr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)context, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    (void)string;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(JNIEnv* km_env, jclass km_clazz, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCountVbl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)vbl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vbl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(JNIEnv* km_env, jclass km_clazz, jlong session, jint pduType, jint requestId, jint errorStatus, jint errorIndex, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, int32_t, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreatePdu");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (uint32_t)pduType, (int32_t)requestId, (int32_t)errorStatus, (int32_t)errorIndex, (int64_t)varbindlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)pduType;
    (void)requestId;
    (void)errorStatus;
    (void)errorIndex;
    (void)varbindlist;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong fcallback, jlong lpclientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateSession");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)fcallback, (void*)(uintptr_t)lpclientdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wmsg;
    (void)fcallback;
    (void)lpclientdata;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl(JNIEnv* km_env, jclass km_clazz, jlong session, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateVbl");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)name;
    (void)value;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu, jlong msgbufdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDecodeMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (void*)(uintptr_t)srcentity, (void*)(uintptr_t)dstentity, (void*)(uintptr_t)context, (void*)(uintptr_t)pdu, (void*)(uintptr_t)msgbufdesc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg1Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDeleteVb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)vbl, (uint32_t)arg1Index);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vbl;
    (void)arg1Index;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(JNIEnv* km_env, jclass km_clazz, jlong session, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicatePdu");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int64_t)pdu);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)pdu;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(JNIEnv* km_env, jclass km_clazz, jlong session, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicateVbl");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int64_t)vbl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)vbl;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu, jlong msgbufdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEncodeMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (int64_t)pdu, (void*)(uintptr_t)msgbufdesc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr(JNIEnv* km_env, jclass km_clazz, jlong entity, jint size, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEntityToStr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)entity, (uint32_t)size, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)entity;
    (void)size;
    (void)string;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeContext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)context);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor(JNIEnv* km_env, jclass km_clazz, jint syntax, jlong descriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeDescriptor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)syntax, (void*)(uintptr_t)descriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)syntax;
    (void)descriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(JNIEnv* km_env, jclass km_clazz, jlong entity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeEntity");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)entity);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)entity;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(JNIEnv* km_env, jclass km_clazz, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreePdu");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pdu);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdu;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(JNIEnv* km_env, jclass km_clazz, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeVbl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)vbl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vbl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetLastError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData(JNIEnv* km_env, jclass km_clazz, jlong pdu, jlong pduType, jlong requestId, jlong errorStatus, jlong errorIndex, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetPduData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pdu, (void*)(uintptr_t)pduType, (void*)(uintptr_t)requestId, (void*)(uintptr_t)errorStatus, (void*)(uintptr_t)errorIndex, (void*)(uintptr_t)varbindlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdu;
    (void)pduType;
    (void)requestId;
    (void)errorStatus;
    (void)errorIndex;
    (void)varbindlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode(JNIEnv* km_env, jclass km_clazz, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetransmitMode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nretransmitmode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nretransmitmode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry(JNIEnv* km_env, jclass km_clazz, jlong hentity, jlong npolicyretry, jlong nactualretry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (void*)(uintptr_t)npolicyretry, (void*)(uintptr_t)nactualretry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)npolicyretry;
    (void)nactualretry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout(JNIEnv* km_env, jclass km_clazz, jlong hentity, jlong npolicytimeout, jlong nactualtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTimeout");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (void*)(uintptr_t)npolicytimeout, (void*)(uintptr_t)nactualtimeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)npolicytimeout;
    (void)nactualtimeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode(JNIEnv* km_env, jclass km_clazz, jlong ntranslatemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTranslateMode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ntranslatemode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ntranslatemode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg1Index, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)vbl, (uint32_t)arg1Index, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vbl;
    (void)arg1Index;
    (void)name;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo(JNIEnv* km_env, jclass km_clazz, jlong vendorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVendorInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vendorinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vendorinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpListen(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint lstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (uint32_t)lstatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)lstatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint lstatus, jint nuseentityaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListenEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (uint32_t)lstatus, (uint32_t)nuseentityaddr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)lstatus;
    (void)nuseentityaddr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)session);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl(JNIEnv* km_env, jclass km_clazz, jlong session, jint dwctlcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrCtl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)session, (uint32_t)dwctlcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)dwctlcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap(JNIEnv* km_env, jclass km_clazz, jlong enterprise, jlong ipaddress, jlong generictrap, jlong specifictrap, jlong timestamp, jlong variablebindings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enterprise, (void*)(uintptr_t)ipaddress, (void*)(uintptr_t)generictrap, (void*)(uintptr_t)specifictrap, (void*)(uintptr_t)timestamp, (void*)(uintptr_t)variablebindings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enterprise;
    (void)ipaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)timestamp;
    (void)variablebindings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx(JNIEnv* km_env, jclass km_clazz, jlong enterprise, jlong agentaddress, jlong sourceaddress, jlong generictrap, jlong specifictrap, jlong community, jlong timestamp, jlong variablebindings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrapEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enterprise, (void*)(uintptr_t)agentaddress, (void*)(uintptr_t)sourceaddress, (void*)(uintptr_t)generictrap, (void*)(uintptr_t)specifictrap, (void*)(uintptr_t)community, (void*)(uintptr_t)timestamp, (void*)(uintptr_t)variablebindings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enterprise;
    (void)agentaddress;
    (void)sourceaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)community;
    (void)timestamp;
    (void)variablebindings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr(JNIEnv* km_env, jclass km_clazz, jlong oid, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOidToStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oid, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oid;
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen(JNIEnv* km_env, jclass km_clazz, jlong lpagentaddress, jlong lpagentcommunity, jint ntimeout, jint nretries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOpen");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpagentaddress, (void*)(uintptr_t)lpagentcommunity, (int32_t)ntimeout, (int32_t)nretries);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpagentaddress;
    (void)lpagentcommunity;
    (void)ntimeout;
    (void)nretries;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest(JNIEnv* km_env, jclass km_clazz, jlong session, jbyte requesttype, jlong variablebindings, jlong errorstatus, jlong errorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)session, (uint8_t)requesttype, (void*)(uintptr_t)variablebindings, (void*)(uintptr_t)errorstatus, (void*)(uintptr_t)errorindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)requesttype;
    (void)variablebindings;
    (void)errorstatus;
    (void)errorindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid(JNIEnv* km_env, jclass km_clazz, jlong string, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrStrToOid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)oid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    (void)oid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen(JNIEnv* km_env, jclass km_clazz, jlong phtrapavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrTrapListen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phtrapavailable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phtrapavailable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare(JNIEnv* km_env, jclass km_clazz, jlong xoid, jlong yoid, jint maxlen, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCompare");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)xoid, (void*)(uintptr_t)yoid, (uint32_t)maxlen, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)xoid;
    (void)yoid;
    (void)maxlen;
    (void)result;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy(JNIEnv* km_env, jclass km_clazz, jlong srcoid, jlong dstoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCopy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)srcoid, (void*)(uintptr_t)dstoid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)srcoid;
    (void)dstoid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr(JNIEnv* km_env, jclass km_clazz, jlong srcoid, jint size, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidToStr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)srcoid, (uint32_t)size, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)srcoid;
    (void)size;
    (void)string;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOpen");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wmsg;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRecvMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (void*)(uintptr_t)srcentity, (void*)(uintptr_t)dstentity, (void*)(uintptr_t)context, (void*)(uintptr_t)pdu);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong notification, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRegister");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (void*)(uintptr_t)notification, (uint32_t)state);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)notification;
    (void)state;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSendMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (int64_t)pdu);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData(JNIEnv* km_env, jclass km_clazz, jlong pdu, jlong pduType, jlong requestId, jlong nonRepeaters, jlong maxRepetitions, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPduData");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pdu, (void*)(uintptr_t)pduType, (void*)(uintptr_t)requestId, (void*)(uintptr_t)nonRepeaters, (void*)(uintptr_t)maxRepetitions, (void*)(uintptr_t)varbindlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdu;
    (void)pduType;
    (void)requestId;
    (void)nonRepeaters;
    (void)maxRepetitions;
    (void)varbindlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint nport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPort");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (uint32_t)nport);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)nport;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(JNIEnv* km_env, jclass km_clazz, jint nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetransmitMode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nretransmitmode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nretransmitmode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint npolicyretry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetry");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (uint32_t)npolicyretry);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)npolicyretry;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint npolicytimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTimeout");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hentity, (uint32_t)npolicytimeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hentity;
    (void)npolicytimeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(JNIEnv* km_env, jclass km_clazz, jint ntranslatemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTranslateMode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ntranslatemode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ntranslatemode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg1Index, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetVb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)vbl, (uint32_t)arg1Index, (void*)(uintptr_t)name, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vbl;
    (void)arg1Index;
    (void)name;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup(JNIEnv* km_env, jclass km_clazz, jlong nmajorversion, jlong nminorversion, jlong nlevel, jlong ntranslatemode, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nmajorversion, (void*)(uintptr_t)nminorversion, (void*)(uintptr_t)nlevel, (void*)(uintptr_t)ntranslatemode, (void*)(uintptr_t)nretransmitmode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx(JNIEnv* km_env, jclass km_clazz, jlong nmajorversion, jlong nminorversion, jlong nlevel, jlong ntranslatemode, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartupEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nmajorversion, (void*)(uintptr_t)nminorversion, (void*)(uintptr_t)nlevel, (void*)(uintptr_t)ntranslatemode, (void*)(uintptr_t)nretransmitmode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext(JNIEnv* km_env, jclass km_clazz, jlong session, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToContext");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)string;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity(JNIEnv* km_env, jclass km_clazz, jlong session, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToEntity");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)session;
    (void)string;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid(JNIEnv* km_env, jclass km_clazz, jlong string, jlong dstoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToOid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)dstoid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)string;
    (void)dstoid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcGetUptime");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(JNIEnv* km_env, jclass km_clazz, jint nloglevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogLevel");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)nloglevel);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nloglevel;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(JNIEnv* km_env, jclass km_clazz, jint nlogtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogType");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)nlogtype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nlogtype;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy(JNIEnv* km_env, jclass km_clazz, jlong panydst, jlong panysrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyCpy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)panydst, (void*)(uintptr_t)panysrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)panydst;
    (void)panysrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree(JNIEnv* km_env, jclass km_clazz, jlong pany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pany);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pany;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint(JNIEnv* km_env, jclass km_clazz, jint nloglevel, jlong szformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilDbgPrint");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((int32_t)nloglevel, (void*)(uintptr_t)szformat); break;
            case 1: km_fn_ptr((int32_t)nloglevel, (void*)(uintptr_t)szformat, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((int32_t)nloglevel, (void*)(uintptr_t)szformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((int32_t)nloglevel, (void*)(uintptr_t)szformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((int32_t)nloglevel, (void*)(uintptr_t)szformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)nloglevel;
    (void)szformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA(JNIEnv* km_env, jclass km_clazz, jlong ids, jint idlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilIdsToA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ids, (uint32_t)idlength);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ids;
    (void)idlength;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc(JNIEnv* km_env, jclass km_clazz, jint nbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemAlloc");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)nbytes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmem;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc(JNIEnv* km_env, jclass km_clazz, jlong pmem, jint nbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemReAlloc");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmem, (uint32_t)nbytes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pmem;
    (void)nbytes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp(JNIEnv* km_env, jclass km_clazz, jlong poctets1, jlong poctets2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poctets1, (void*)(uintptr_t)poctets2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poctets1;
    (void)poctets2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy(JNIEnv* km_env, jclass km_clazz, jlong poctetsdst, jlong poctetssrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCpy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poctetsdst, (void*)(uintptr_t)poctetssrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poctetsdst;
    (void)poctetssrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree(JNIEnv* km_env, jclass km_clazz, jlong poctets) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)poctets);
    } else {
        errno = ENOSYS;
    }
#else
    (void)poctets;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp(JNIEnv* km_env, jclass km_clazz, jlong poctets1, jlong poctets2, jint nchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsNCmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poctets1, (void*)(uintptr_t)poctets2, (uint32_t)nchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poctets1;
    (void)poctets2;
    (void)nchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend(JNIEnv* km_env, jclass km_clazz, jlong poiddst, jlong poidsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidAppend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poiddst, (void*)(uintptr_t)poidsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poiddst;
    (void)poidsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp(JNIEnv* km_env, jclass km_clazz, jlong poid1, jlong poid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poid1, (void*)(uintptr_t)poid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poid1;
    (void)poid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy(JNIEnv* km_env, jclass km_clazz, jlong poiddst, jlong poidsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCpy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poiddst, (void*)(uintptr_t)poidsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poiddst;
    (void)poidsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree(JNIEnv* km_env, jclass km_clazz, jlong poid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)poid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)poid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp(JNIEnv* km_env, jclass km_clazz, jlong poid1, jlong poid2, jint nsubids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidNCmp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poid1, (void*)(uintptr_t)poid2, (uint32_t)nsubids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poid1;
    (void)poid2;
    (void)nsubids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA(JNIEnv* km_env, jclass km_clazz, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidToA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)oid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny(JNIEnv* km_env, jclass km_clazz, jlong pany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintAsnAny");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pany);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pany;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid(JNIEnv* km_env, jclass km_clazz, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintOid");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy(JNIEnv* km_env, jclass km_clazz, jlong pvbdst, jlong pvbsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindCpy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvbdst, (void*)(uintptr_t)pvbsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvbdst;
    (void)pvbsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree(JNIEnv* km_env, jclass km_clazz, jlong pvb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvb;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy(JNIEnv* km_env, jclass km_clazz, jlong pvbldst, jlong pvblsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListCpy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvbldst, (void*)(uintptr_t)pvblsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvbldst;
    (void)pvblsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree(JNIEnv* km_env, jclass km_clazz, jlong pvbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvbl);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvbl;
    errno = ENOSYS;
#endif
}

