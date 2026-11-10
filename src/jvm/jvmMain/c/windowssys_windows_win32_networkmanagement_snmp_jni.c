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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCancelMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jint reqid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCancelMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int32_t)reqid) : 0;
#else
    (void)session;
    (void)reqid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCleanupEx(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCleanupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpClose(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session) : 0;
#else
    (void)session;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpContextToStr(JNIEnv* km_env, jclass km_clazz, jlong context, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpContextToStr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)context, (void*)(uintptr_t)string) : 0;
#else
    (void)context;
    (void)string;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCountVbl(JNIEnv* km_env, jclass km_clazz, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCountVbl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)vbl) : 0;
#else
    (void)vbl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCreatePdu(JNIEnv* km_env, jclass km_clazz, jlong session, jint pdu_type, jint request_id, jint error_status, jint error_index, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, int32_t, int32_t, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreatePdu");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (uint32_t)pdu_type, (int32_t)request_id, (int32_t)error_status, (int32_t)error_index, (int64_t)varbindlist) : -1;
#else
    (void)session;
    (void)pdu_type;
    (void)request_id;
    (void)error_status;
    (void)error_index;
    (void)varbindlist;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCreateSession(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg, jlong fcallback, jlong lpclientdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateSession");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg, (void*)(uintptr_t)fcallback, (void*)(uintptr_t)lpclientdata) : -1;
#else
    (void)hwnd;
    (void)wmsg;
    (void)fcallback;
    (void)lpclientdata;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpCreateVbl(JNIEnv* km_env, jclass km_clazz, jlong session, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpCreateVbl");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)name, (void*)(uintptr_t)value) : -1;
#else
    (void)session;
    (void)name;
    (void)value;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpDecodeMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu, jlong msgbufdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDecodeMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)srcentity, (void*)(uintptr_t)dstentity, (void*)(uintptr_t)context, (void*)(uintptr_t)pdu, (void*)(uintptr_t)msgbufdesc) : 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpDeleteVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg_1_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDeleteVb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)vbl, (uint32_t)arg_1_index) : 0;
#else
    (void)vbl;
    (void)arg_1_index;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpDuplicatePdu(JNIEnv* km_env, jclass km_clazz, jlong session, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicatePdu");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int64_t)pdu) : -1;
#else
    (void)session;
    (void)pdu;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpDuplicateVbl(JNIEnv* km_env, jclass km_clazz, jlong session, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpDuplicateVbl");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int64_t)vbl) : -1;
#else
    (void)session;
    (void)vbl;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpEncodeMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu, jlong msgbufdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEncodeMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (int64_t)pdu, (void*)(uintptr_t)msgbufdesc) : 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    (void)msgbufdesc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpEntityToStr(JNIEnv* km_env, jclass km_clazz, jlong entity, jint size, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpEntityToStr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)entity, (uint32_t)size, (void*)(uintptr_t)string) : 0;
#else
    (void)entity;
    (void)size;
    (void)string;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpFreeContext(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeContext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)context) : 0;
#else
    (void)context;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpFreeDescriptor(JNIEnv* km_env, jclass km_clazz, jint syntax, jlong descriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeDescriptor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)syntax, (void*)(uintptr_t)descriptor) : 0;
#else
    (void)syntax;
    (void)descriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpFreeEntity(JNIEnv* km_env, jclass km_clazz, jlong entity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeEntity");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)entity) : 0;
#else
    (void)entity;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpFreePdu(JNIEnv* km_env, jclass km_clazz, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreePdu");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)pdu) : 0;
#else
    (void)pdu;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpFreeVbl(JNIEnv* km_env, jclass km_clazz, jlong vbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpFreeVbl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)vbl) : 0;
#else
    (void)vbl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetLastError(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetLastError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session) : 0;
#else
    (void)session;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetPduData(JNIEnv* km_env, jclass km_clazz, jlong pdu, jlong pdu_type, jlong request_id, jlong error_status, jlong error_index, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetPduData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)pdu, (void*)(uintptr_t)pdu_type, (void*)(uintptr_t)request_id, (void*)(uintptr_t)error_status, (void*)(uintptr_t)error_index, (void*)(uintptr_t)varbindlist) : 0;
#else
    (void)pdu;
    (void)pdu_type;
    (void)request_id;
    (void)error_status;
    (void)error_index;
    (void)varbindlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetRetransmitMode(JNIEnv* km_env, jclass km_clazz, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetransmitMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nretransmitmode) : 0;
#else
    (void)nretransmitmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetRetry(JNIEnv* km_env, jclass km_clazz, jlong hentity, jlong npolicyretry, jlong nactualretry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetRetry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (void*)(uintptr_t)npolicyretry, (void*)(uintptr_t)nactualretry) : 0;
#else
    (void)hentity;
    (void)npolicyretry;
    (void)nactualretry;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetTimeout(JNIEnv* km_env, jclass km_clazz, jlong hentity, jlong npolicytimeout, jlong nactualtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTimeout");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (void*)(uintptr_t)npolicytimeout, (void*)(uintptr_t)nactualtimeout) : 0;
#else
    (void)hentity;
    (void)npolicytimeout;
    (void)nactualtimeout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetTranslateMode(JNIEnv* km_env, jclass km_clazz, jlong ntranslatemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetTranslateMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ntranslatemode) : 0;
#else
    (void)ntranslatemode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg_1_index, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)vbl, (uint32_t)arg_1_index, (void*)(uintptr_t)name, (void*)(uintptr_t)value) : 0;
#else
    (void)vbl;
    (void)arg_1_index;
    (void)name;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpGetVendorInfo(JNIEnv* km_env, jclass km_clazz, jlong vendorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpGetVendorInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vendorinfo) : 0;
#else
    (void)vendorinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpListen(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint lstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (uint32_t)lstatus) : 0;
#else
    (void)hentity;
    (void)lstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpListenEx(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint lstatus, jint nuseentityaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpListenEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (uint32_t)lstatus, (uint32_t)nuseentityaddr) : 0;
#else
    (void)hentity;
    (void)lstatus;
    (void)nuseentityaddr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrClose(JNIEnv* km_env, jclass km_clazz, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)session) : -1;
#else
    (void)session;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrCtl(JNIEnv* km_env, jclass km_clazz, jlong session, jint dwctlcode, jlong lpvinbuffer, jint cbinbuffer, jlong lpvoutbuffer, jint cboutbuffer, jlong lpcbbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrCtl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)session, (uint32_t)dwctlcode, (void*)(uintptr_t)lpvinbuffer, (uint32_t)cbinbuffer, (void*)(uintptr_t)lpvoutbuffer, (uint32_t)cboutbuffer, (void*)(uintptr_t)lpcbbytesreturned) : -1;
#else
    (void)session;
    (void)dwctlcode;
    (void)lpvinbuffer;
    (void)cbinbuffer;
    (void)lpvoutbuffer;
    (void)cboutbuffer;
    (void)lpcbbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrGetTrap(JNIEnv* km_env, jclass km_clazz, jlong enterprise, jlong ipaddress, jlong generictrap, jlong specifictrap, jlong timestamp, jlong variablebindings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enterprise, (void*)(uintptr_t)ipaddress, (void*)(uintptr_t)generictrap, (void*)(uintptr_t)specifictrap, (void*)(uintptr_t)timestamp, (void*)(uintptr_t)variablebindings) : -1;
#else
    (void)enterprise;
    (void)ipaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)timestamp;
    (void)variablebindings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrGetTrapEx(JNIEnv* km_env, jclass km_clazz, jlong enterprise, jlong agentaddress, jlong sourceaddress, jlong generictrap, jlong specifictrap, jlong community, jlong timestamp, jlong variablebindings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrGetTrapEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enterprise, (void*)(uintptr_t)agentaddress, (void*)(uintptr_t)sourceaddress, (void*)(uintptr_t)generictrap, (void*)(uintptr_t)specifictrap, (void*)(uintptr_t)community, (void*)(uintptr_t)timestamp, (void*)(uintptr_t)variablebindings) : -1;
#else
    (void)enterprise;
    (void)agentaddress;
    (void)sourceaddress;
    (void)generictrap;
    (void)specifictrap;
    (void)community;
    (void)timestamp;
    (void)variablebindings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrOidToStr(JNIEnv* km_env, jclass km_clazz, jlong oid, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOidToStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oid, (void*)(uintptr_t)string) : -1;
#else
    (void)oid;
    (void)string;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrOpen(JNIEnv* km_env, jclass km_clazz, jlong lpagentaddress, jlong lpagentcommunity, jint ntimeout, jint nretries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpagentaddress, (void*)(uintptr_t)lpagentcommunity, (int32_t)ntimeout, (int32_t)nretries) : NULL;
#else
    (void)lpagentaddress;
    (void)lpagentcommunity;
    (void)ntimeout;
    (void)nretries;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrRequest(JNIEnv* km_env, jclass km_clazz, jlong session, jbyte requesttype, jlong variablebindings, jlong errorstatus, jlong errorindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)session, (uint8_t)requesttype, (void*)(uintptr_t)variablebindings, (void*)(uintptr_t)errorstatus, (void*)(uintptr_t)errorindex) : -1;
#else
    (void)session;
    (void)requesttype;
    (void)variablebindings;
    (void)errorstatus;
    (void)errorindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrStrToOid(JNIEnv* km_env, jclass km_clazz, jlong string, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrStrToOid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)oid) : -1;
#else
    (void)string;
    (void)oid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpMgrTrapListen(JNIEnv* km_env, jclass km_clazz, jlong phtrapavailable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mgmtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpMgrTrapListen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phtrapavailable) : -1;
#else
    (void)phtrapavailable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpOidCompare(JNIEnv* km_env, jclass km_clazz, jlong xoid, jlong yoid, jint maxlen, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCompare");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)xoid, (void*)(uintptr_t)yoid, (uint32_t)maxlen, (void*)(uintptr_t)result) : 0;
#else
    (void)xoid;
    (void)yoid;
    (void)maxlen;
    (void)result;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpOidCopy(JNIEnv* km_env, jclass km_clazz, jlong srcoid, jlong dstoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidCopy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)srcoid, (void*)(uintptr_t)dstoid) : 0;
#else
    (void)srcoid;
    (void)dstoid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpOidToStr(JNIEnv* km_env, jclass km_clazz, jlong srcoid, jint size, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOidToStr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)srcoid, (uint32_t)size, (void*)(uintptr_t)string) : 0;
#else
    (void)srcoid;
    (void)size;
    (void)string;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpOpen(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint wmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpOpen");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)wmsg) : -1;
#else
    (void)hwnd;
    (void)wmsg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpRecvMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRecvMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)srcentity, (void*)(uintptr_t)dstentity, (void*)(uintptr_t)context, (void*)(uintptr_t)pdu) : 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpRegister(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong notification, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (void*)(uintptr_t)notification, (uint32_t)state) : 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)notification;
    (void)state;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSendMsg(JNIEnv* km_env, jclass km_clazz, jlong session, jlong srcentity, jlong dstentity, jlong context, jlong pdu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSendMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (int64_t)srcentity, (int64_t)dstentity, (int64_t)context, (int64_t)pdu) : 0;
#else
    (void)session;
    (void)srcentity;
    (void)dstentity;
    (void)context;
    (void)pdu;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetPduData(JNIEnv* km_env, jclass km_clazz, jlong pdu, jlong pdu_type, jlong request_id, jlong non_repeaters, jlong max_repetitions, jlong varbindlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPduData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)pdu, (void*)(uintptr_t)pdu_type, (void*)(uintptr_t)request_id, (void*)(uintptr_t)non_repeaters, (void*)(uintptr_t)max_repetitions, (void*)(uintptr_t)varbindlist) : 0;
#else
    (void)pdu;
    (void)pdu_type;
    (void)request_id;
    (void)non_repeaters;
    (void)max_repetitions;
    (void)varbindlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetPort(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint nport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetPort");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (uint32_t)nport) : 0;
#else
    (void)hentity;
    (void)nport;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetRetransmitMode(JNIEnv* km_env, jclass km_clazz, jint nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetransmitMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nretransmitmode) : 0;
#else
    (void)nretransmitmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetRetry(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint npolicyretry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetRetry");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (uint32_t)npolicyretry) : 0;
#else
    (void)hentity;
    (void)npolicyretry;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetTimeout(JNIEnv* km_env, jclass km_clazz, jlong hentity, jint npolicytimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTimeout");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hentity, (uint32_t)npolicytimeout) : 0;
#else
    (void)hentity;
    (void)npolicytimeout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetTranslateMode(JNIEnv* km_env, jclass km_clazz, jint ntranslatemode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetTranslateMode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ntranslatemode) : 0;
#else
    (void)ntranslatemode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSetVb(JNIEnv* km_env, jclass km_clazz, jlong vbl, jint arg_1_index, jlong name, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSetVb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)vbl, (uint32_t)arg_1_index, (void*)(uintptr_t)name, (void*)(uintptr_t)value) : 0;
#else
    (void)vbl;
    (void)arg_1_index;
    (void)name;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpStartup(JNIEnv* km_env, jclass km_clazz, jlong nmajorversion, jlong nminorversion, jlong nlevel, jlong ntranslatemode, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nmajorversion, (void*)(uintptr_t)nminorversion, (void*)(uintptr_t)nlevel, (void*)(uintptr_t)ntranslatemode, (void*)(uintptr_t)nretransmitmode) : 0;
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpStartupEx(JNIEnv* km_env, jclass km_clazz, jlong nmajorversion, jlong nminorversion, jlong nlevel, jlong ntranslatemode, jlong nretransmitmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStartupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nmajorversion, (void*)(uintptr_t)nminorversion, (void*)(uintptr_t)nlevel, (void*)(uintptr_t)ntranslatemode, (void*)(uintptr_t)nretransmitmode) : 0;
#else
    (void)nmajorversion;
    (void)nminorversion;
    (void)nlevel;
    (void)ntranslatemode;
    (void)nretransmitmode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpStrToContext(JNIEnv* km_env, jclass km_clazz, jlong session, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToContext");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)string) : -1;
#else
    (void)session;
    (void)string;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpStrToEntity(JNIEnv* km_env, jclass km_clazz, jlong session, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToEntity");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)string) : -1;
#else
    (void)session;
    (void)string;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpStrToOid(JNIEnv* km_env, jclass km_clazz, jlong string, jlong dstoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsnmp32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpStrToOid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string, (void*)(uintptr_t)dstoid) : 0;
#else
    (void)string;
    (void)dstoid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSvcGetUptime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcGetUptime");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSvcSetLogLevel(JNIEnv* km_env, jclass km_clazz, jint nloglevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogLevel");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)nloglevel);
#else
    (void)nloglevel;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpSvcSetLogType(JNIEnv* km_env, jclass km_clazz, jint nlogtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpSvcSetLogType");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)nlogtype);
#else
    (void)nlogtype;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilAsnAnyCpy(JNIEnv* km_env, jclass km_clazz, jlong panydst, jlong panysrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyCpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)panydst, (void*)(uintptr_t)panysrc) : -1;
#else
    (void)panydst;
    (void)panysrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilAsnAnyFree(JNIEnv* km_env, jclass km_clazz, jlong pany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilAsnAnyFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pany);
#else
    (void)pany;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilDbgPrint(JNIEnv* km_env, jclass km_clazz, jint nloglevel, jlong szformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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
    }
#else
    (void)nloglevel;
    (void)szformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilIdsToA(JNIEnv* km_env, jclass km_clazz, jlong ids, jint idlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilIdsToA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ids, (uint32_t)idlength) : NULL;
#else
    (void)ids;
    (void)idlength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilMemAlloc(JNIEnv* km_env, jclass km_clazz, jint nbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbytes) : NULL;
#else
    (void)nbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilMemFree(JNIEnv* km_env, jclass km_clazz, jlong pmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmem);
#else
    (void)pmem;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilMemReAlloc(JNIEnv* km_env, jclass km_clazz, jlong pmem, jint nbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilMemReAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pmem, (uint32_t)nbytes) : NULL;
#else
    (void)pmem;
    (void)nbytes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOctetsCmp(JNIEnv* km_env, jclass km_clazz, jlong poctets1, jlong poctets2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCmp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poctets1, (void*)(uintptr_t)poctets2) : -1;
#else
    (void)poctets1;
    (void)poctets2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOctetsCpy(JNIEnv* km_env, jclass km_clazz, jlong poctetsdst, jlong poctetssrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsCpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poctetsdst, (void*)(uintptr_t)poctetssrc) : -1;
#else
    (void)poctetsdst;
    (void)poctetssrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOctetsFree(JNIEnv* km_env, jclass km_clazz, jlong poctets) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)poctets);
#else
    (void)poctets;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOctetsNCmp(JNIEnv* km_env, jclass km_clazz, jlong poctets1, jlong poctets2, jint nchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOctetsNCmp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poctets1, (void*)(uintptr_t)poctets2, (uint32_t)nchars) : -1;
#else
    (void)poctets1;
    (void)poctets2;
    (void)nchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidAppend(JNIEnv* km_env, jclass km_clazz, jlong poiddst, jlong poidsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidAppend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poiddst, (void*)(uintptr_t)poidsrc) : -1;
#else
    (void)poiddst;
    (void)poidsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidCmp(JNIEnv* km_env, jclass km_clazz, jlong poid1, jlong poid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCmp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poid1, (void*)(uintptr_t)poid2) : -1;
#else
    (void)poid1;
    (void)poid2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidCpy(JNIEnv* km_env, jclass km_clazz, jlong poiddst, jlong poidsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidCpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poiddst, (void*)(uintptr_t)poidsrc) : -1;
#else
    (void)poiddst;
    (void)poidsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidFree(JNIEnv* km_env, jclass km_clazz, jlong poid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)poid);
#else
    (void)poid;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidNCmp(JNIEnv* km_env, jclass km_clazz, jlong poid1, jlong poid2, jint nsubids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidNCmp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poid1, (void*)(uintptr_t)poid2, (uint32_t)nsubids) : -1;
#else
    (void)poid1;
    (void)poid2;
    (void)nsubids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilOidToA(JNIEnv* km_env, jclass km_clazz, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilOidToA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oid) : NULL;
#else
    (void)oid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilPrintAsnAny(JNIEnv* km_env, jclass km_clazz, jlong pany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintAsnAny");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pany);
#else
    (void)pany;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilPrintOid(JNIEnv* km_env, jclass km_clazz, jlong oid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilPrintOid");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oid);
#else
    (void)oid;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilVarBindCpy(JNIEnv* km_env, jclass km_clazz, jlong pvbdst, jlong pvbsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindCpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvbdst, (void*)(uintptr_t)pvbsrc) : -1;
#else
    (void)pvbdst;
    (void)pvbsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilVarBindFree(JNIEnv* km_env, jclass km_clazz, jlong pvb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvb);
#else
    (void)pvb;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilVarBindListCpy(JNIEnv* km_env, jclass km_clazz, jlong pvbldst, jlong pvblsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListCpy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvbldst, (void*)(uintptr_t)pvblsrc) : -1;
#else
    (void)pvbldst;
    (void)pvblsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_snmp_WindowsWin32NetworkmanagementSnmpJniBridge_windowssys_1windows_1win32_1networkmanagement_1snmp_1snmpUtilVarBindListFree(JNIEnv* km_env, jclass km_clazz, jlong pvbl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("snmpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SnmpUtilVarBindListFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvbl);
#else
    (void)pvbl;
#endif
}

