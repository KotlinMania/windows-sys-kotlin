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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(JNIEnv* km_env, jclass km_clazz, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMP_WaitNoPendingInstallEvents");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtimeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwtimeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jint dndevinst, jint priority, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint32_t)dndevinst, (int32_t)priority, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jint dndevinst, jint priority, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint32_t)dndevinst, (int32_t)priority, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_IDA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_IDW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_ID_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_ID_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(JNIEnv* km_env, jclass km_clazz, jlong ullstartvalue, jlong ullendvalue, jlong rlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Range");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ullstartvalue, (uint64_t)ullendvalue, (uint64_t)rlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong lclogconf, jint resourceid, jlong resourcedata, jint resourcelen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Res_Des");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)lclogconf, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong lclogconf, jint resourceid, jlong resourcedata, jint resourcelen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Res_Des_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)lclogconf, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong phmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Connect_MachineA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)phmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)phmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(JNIEnv* km_env, jclass km_clazz, jlong uncservername, jlong phmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Connect_MachineW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncservername, (void*)(uintptr_t)phmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uncservername;
    (void)phmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint dnparent, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNodeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)dnparent, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint dnparent, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNodeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)dnparent, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint dnparent, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNode_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)dnparent, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint dnparent, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNode_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)dnparent, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(JNIEnv* km_env, jclass km_clazz, jlong prlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Class_Key");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Class_Key_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(JNIEnv* km_env, jclass km_clazz, jint dndevnode, jint ulhardwareprofile, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevnode, (uint32_t)ulhardwareprofile, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(JNIEnv* km_env, jclass km_clazz, jint dndevnode, jint ulhardwareprofile, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevnode, (uint32_t)ulhardwareprofile, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(JNIEnv* km_env, jclass km_clazz, jlong ullstartvalue, jlong ullendvalue, jlong rlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Range");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ullstartvalue, (uint64_t)ullendvalue, (uint64_t)rlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint resourceid, jlong resourcedata, jint resourcelen, jlong pbconflictdetected, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (void*)(uintptr_t)pbconflictdetected, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint resourceid, jlong resourcedata, jint resourcelen, jlong pbconflictdetected, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (void*)(uintptr_t)pbconflictdetected, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disable_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disable_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(JNIEnv* km_env, jclass km_clazz, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disconnect_Machine");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(JNIEnv* km_env, jclass km_clazz, jlong rlhold, jlong rlhnew, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Dup_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlhold, (uint64_t)rlhnew, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enable_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enable_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(JNIEnv* km_env, jclass km_clazz, jint ulclassindex, jlong classguid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Classes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulclassindex, (void*)(uintptr_t)classguid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(JNIEnv* km_env, jclass km_clazz, jint ulclassindex, jlong classguid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Classes_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulclassindex, (void*)(uintptr_t)classguid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(JNIEnv* km_env, jclass km_clazz, jint ulenumindex, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulenumindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(JNIEnv* km_env, jclass km_clazz, jint ulenumindex, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulenumindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(JNIEnv* km_env, jclass km_clazz, jint ulenumindex, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulenumindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(JNIEnv* km_env, jclass km_clazz, jint ulenumindex, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulenumindex, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(JNIEnv* km_env, jclass km_clazz, jlong pullstart, jlong ullstart, jint ullength, jlong ullalignment, jlong ullend, jlong rlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Find_Range");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullstart, (uint64_t)ullstart, (uint32_t)ullength, (uint64_t)ullalignment, (uint64_t)ullend, (uint64_t)rlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullstart;
    (void)ullstart;
    (void)ullength;
    (void)ullalignment;
    (void)ullend;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(JNIEnv* km_env, jclass km_clazz, jlong rlh, jlong pullstart, jlong pullend, jlong preelement, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_First_Range");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlh, (void*)(uintptr_t)pullstart, (void*)(uintptr_t)pullend, (void*)(uintptr_t)preelement, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlh;
    (void)pullstart;
    (void)pullend;
    (void)preelement;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(JNIEnv* km_env, jclass km_clazz, jlong lclogconftobefreed, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)lclogconftobefreed, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(JNIEnv* km_env, jclass km_clazz, jlong lclogconftobefreed, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)lclogconftobefreed, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(JNIEnv* km_env, jclass km_clazz, jlong lclogconf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Handle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)lclogconf);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lclogconf;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(JNIEnv* km_env, jclass km_clazz, jlong rlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(JNIEnv* km_env, jclass km_clazz, jlong rdresdes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des_Handle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rdresdes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rdresdes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(JNIEnv* km_env, jclass km_clazz, jlong clconflictlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Resource_Conflict_Handle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)clconflictlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clconflictlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Child");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Child_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszkeyname, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszkeyname, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszkeyname, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszkeyname, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszkeyname, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszkeyname, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszkeyname, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszkeyname, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_NameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_NameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykeyarray, jlong propertykeycount, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykeyarray, jlong propertykeycount, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(JNIEnv* km_env, jclass km_clazz, jlong puldepth, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Depth");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puldepth, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(JNIEnv* km_env, jclass km_clazz, jlong puldepth, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Depth_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puldepth, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszcustompropertyname, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszcustompropertyname, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszcustompropertyname, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszcustompropertyname, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszcustompropertyname, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszcustompropertyname, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pszcustompropertyname, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pszcustompropertyname, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykeyarray, jlong propertykeycount, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykeyarray, jlong propertykeycount, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong pulregdatatype, jlong buffer, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)pulregdatatype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(JNIEnv* km_env, jclass km_clazz, jlong pulstatus, jlong pulproblemnumber, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Status");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulstatus, (void*)(uintptr_t)pulproblemnumber, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(JNIEnv* km_env, jclass km_clazz, jlong pulstatus, jlong pulproblemnumber, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Status_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulstatus, (void*)(uintptr_t)pulproblemnumber, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_IDA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_IDW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(JNIEnv* km_env, jclass km_clazz, jlong pszfilter, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfilter, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(JNIEnv* km_env, jclass km_clazz, jlong pszfilter, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfilter, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(JNIEnv* km_env, jclass km_clazz, jlong pszfilter, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfilter, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(JNIEnv* km_env, jclass km_clazz, jlong pszfilter, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfilter, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong pszfilter, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)pszfilter, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong pszfilter, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)pszfilter, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong pszfilter, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)pszfilter, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong pszfilter, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)pszfilter, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(JNIEnv* km_env, jclass km_clazz, jlong pullen, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(JNIEnv* km_env, jclass km_clazz, jlong pullen, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong aliasinterfaceguid, jlong pszaliasdeviceinterface, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)aliasinterfaceguid, (void*)(uintptr_t)pszaliasdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong aliasinterfaceguid, jlong pszaliasdeviceinterface, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)aliasinterfaceguid, (void*)(uintptr_t)pszaliasdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong aliasinterfaceguid, jlong pszaliasdeviceinterface, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)aliasinterfaceguid, (void*)(uintptr_t)pszaliasdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong aliasinterfaceguid, jlong pszaliasdeviceinterface, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)aliasinterfaceguid, (void*)(uintptr_t)pszaliasdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(JNIEnv* km_env, jclass km_clazz, jlong interfaceclassguid, jlong pdeviceid, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(JNIEnv* km_env, jclass km_clazz, jlong interfaceclassguid, jlong pdeviceid, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(JNIEnv* km_env, jclass km_clazz, jlong interfaceclassguid, jlong pdeviceid, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(JNIEnv* km_env, jclass km_clazz, jlong interfaceclassguid, jlong pdeviceid, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong interfaceclassguid, jlong pdeviceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong interfaceclassguid, jlong pdeviceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong interfaceclassguid, jlong pdeviceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(JNIEnv* km_env, jclass km_clazz, jlong pullen, jlong interfaceclassguid, jlong pdeviceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pullen, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykey, jlong propertytype, jlong propertybuffer, jlong propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (void*)(uintptr_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykeyarray, jlong propertykeycount, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_KeysW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykeyarray, jlong propertykeycount, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_Keys_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykeyarray, (void*)(uintptr_t)propertykeycount, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(JNIEnv* km_env, jclass km_clazz, jlong pulstate, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Global_State");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulstate, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulstate;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(JNIEnv* km_env, jclass km_clazz, jlong pulstate, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Global_State_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulstate, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulstate;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulhardwareprofile, jlong pulvalue, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulhardwareprofile, (void*)(uintptr_t)pulvalue, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulhardwareprofile, jlong pulvalue, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulhardwareprofile, (void*)(uintptr_t)pulvalue, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulhardwareprofile, jlong pulvalue, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulhardwareprofile, (void*)(uintptr_t)pulvalue, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulhardwareprofile, jlong pulvalue, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulhardwareprofile, (void*)(uintptr_t)pulvalue, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(JNIEnv* km_env, jclass km_clazz, jint ulindex, jlong phwprofileinfo, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulindex, (void*)(uintptr_t)phwprofileinfo, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(JNIEnv* km_env, jclass km_clazz, jint ulindex, jlong phwprofileinfo, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulindex, (void*)(uintptr_t)phwprofileinfo, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(JNIEnv* km_env, jclass km_clazz, jint ulindex, jlong phwprofileinfo, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulindex, (void*)(uintptr_t)phwprofileinfo, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(JNIEnv* km_env, jclass km_clazz, jint ulindex, jlong phwprofileinfo, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulindex, (void*)(uintptr_t)phwprofileinfo, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(JNIEnv* km_env, jclass km_clazz, jlong lclogconf, jlong ppriority, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)lclogconf, (void*)(uintptr_t)ppriority, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(JNIEnv* km_env, jclass km_clazz, jlong lclogconf, jlong ppriority, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)lclogconf, (void*)(uintptr_t)ppriority, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jlong lclogconf, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint64_t)lclogconf, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(JNIEnv* km_env, jclass km_clazz, jlong plclogconf, jlong lclogconf, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plclogconf, (uint64_t)lclogconf, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint forresource, jlong presourceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)forresource, (void*)(uintptr_t)presourceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint forresource, jlong presourceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)forresource, (void*)(uintptr_t)presourceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Parent");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Parent_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(JNIEnv* km_env, jclass km_clazz, jlong rdresdes, jlong buffer, jint bufferlen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rdresdes, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(JNIEnv* km_env, jclass km_clazz, jlong rdresdes, jlong buffer, jint bufferlen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rdresdes, (void*)(uintptr_t)buffer, (uint32_t)bufferlen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(JNIEnv* km_env, jclass km_clazz, jlong pulsize, jlong rdresdes, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulsize, (uint64_t)rdresdes, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(JNIEnv* km_env, jclass km_clazz, jlong pulsize, jlong rdresdes, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulsize, (uint64_t)rdresdes, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(JNIEnv* km_env, jclass km_clazz, jlong clconflictlist, jlong pulcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_Count");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)clconflictlist, (void*)(uintptr_t)pulcount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clconflictlist;
    (void)pulcount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(JNIEnv* km_env, jclass km_clazz, jlong clconflictlist, jint ulindex, jlong pconflictdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)clconflictlist, (uint32_t)ulindex, (void*)(uintptr_t)pconflictdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(JNIEnv* km_env, jclass km_clazz, jlong clconflictlist, jint ulindex, jlong pconflictdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)clconflictlist, (uint32_t)ulindex, (void*)(uintptr_t)pconflictdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Sibling");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Sibling_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Version");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(JNIEnv* km_env, jclass km_clazz, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Version_Ex");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmachine;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(JNIEnv* km_env, jclass km_clazz, jlong rlhold1, jlong rlhold2, jlong rlhnew, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Intersect_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlhold1, (uint64_t)rlhold2, (uint64_t)rlhnew, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(JNIEnv* km_env, jclass km_clazz, jlong rlhold, jlong rlhnew, jlong ullmaxvalue, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Invert_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlhold, (uint64_t)rlhnew, (uint64_t)ullmaxvalue, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ullmaxvalue;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(JNIEnv* km_env, jclass km_clazz, jlong pbpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbpresent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbpresent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(JNIEnv* km_env, jclass km_clazz, jlong pbpresent, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbpresent, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pbpresent;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(JNIEnv* km_env, jclass km_clazz, jshort wversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Version_Available");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(JNIEnv* km_env, jclass km_clazz, jshort wversion, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Version_Available_Ex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wversion, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wversion;
    (void)hmachine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNodeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNodeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(JNIEnv* km_env, jclass km_clazz, jlong pdndevinst, jlong pdeviceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdndevinst, (void*)(uintptr_t)pdeviceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(JNIEnv* km_env, jclass km_clazz, jint cmreturncode, jint defaulterr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_MapCrToWin32Err");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cmreturncode, (uint32_t)defaulterr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cmreturncode;
    (void)defaulterr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(JNIEnv* km_env, jclass km_clazz, jlong rlhold1, jlong rlhold2, jlong rlhnew, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Merge_Range_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)rlhold1, (uint64_t)rlhold2, (uint64_t)rlhnew, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint resourceid, jlong resourcedata, jint resourcelen, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Modify_Res_Des");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(JNIEnv* km_env, jclass km_clazz, jlong prdresdes, jlong rdresdes, jint resourceid, jlong resourcedata, jint resourcelen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Modify_Res_Des_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prdresdes, (uint64_t)rdresdes, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(JNIEnv* km_env, jclass km_clazz, jint dnfromdevinst, jint dntodevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Move_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnfromdevinst, (uint32_t)dntodevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dnfromdevinst, jint dntodevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Move_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnfromdevinst, (uint32_t)dntodevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(JNIEnv* km_env, jclass km_clazz, jlong preelement, jlong pullstart, jlong pullend, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Next_Range");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)preelement, (void*)(uintptr_t)pullstart, (void*)(uintptr_t)pullend, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)preelement;
    (void)pullstart;
    (void)pullend;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszclassname, jint samdesired, jint disposition, jlong phkclass, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_KeyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszclassname, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkclass, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszclassname, jint samdesired, jint disposition, jlong phkclass, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_KeyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszclassname, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkclass, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszclassname, jint samdesired, jint disposition, jlong phkclass, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszclassname, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkclass, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong pszclassname, jint samdesired, jint disposition, jlong phkclass, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)pszclassname, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkclass, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(JNIEnv* km_env, jclass km_clazz, jint dndevnode, jint samdesired, jint ulhardwareprofile, jint disposition, jlong phkdevice, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_DevNode_Key");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevnode, (uint32_t)samdesired, (uint32_t)ulhardwareprofile, (uint32_t)disposition, (void*)(uintptr_t)phkdevice, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(JNIEnv* km_env, jclass km_clazz, jint dndevnode, jint samdesired, jint ulhardwareprofile, jint disposition, jlong phkdevice, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_DevNode_Key_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevnode, (uint32_t)samdesired, (uint32_t)ulhardwareprofile, (uint32_t)disposition, (void*)(uintptr_t)phkdevice, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint samdesired, jint disposition, jlong phkdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint samdesired, jint disposition, jlong phkdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint samdesired, jint disposition, jlong phkdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint samdesired, jint disposition, jlong phkdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)samdesired, (uint32_t)disposition, (void*)(uintptr_t)phkdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint datalen, jint dndevinst, jint resourceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)datalen, (uint32_t)dndevinst, (uint32_t)resourceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint datalen, jint dndevinst, jint resourceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)datalen, (uint32_t)dndevinst, (uint32_t)resourceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(JNIEnv* km_env, jclass km_clazz, jlong pulsize, jint dndevinst, jint resourceid, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulsize, (uint32_t)dndevinst, (uint32_t)resourceid, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(JNIEnv* km_env, jclass km_clazz, jlong pulsize, jint dndevinst, jint resourceid, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pulsize, (uint32_t)dndevinst, (uint32_t)resourceid, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(JNIEnv* km_env, jclass km_clazz, jlong pclconflictlist, jint dndevinst, jint resourceid, jlong resourcedata, jint resourcelen, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Resource_Conflict_List");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pclconflictlist, (uint32_t)dndevinst, (uint32_t)resourceid, (void*)(uintptr_t)resourcedata, (uint32_t)resourcelen, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pclconflictlist;
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Driver");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Driver_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong interfaceclassguid, jlong pszreference, jlong pszdeviceinterface, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pszreference, (void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong interfaceclassguid, jlong pszreference, jlong pszdeviceinterface, jlong pullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pszreference, (void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong interfaceclassguid, jlong pszreference, jlong pszdeviceinterface, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pszreference, (void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong interfaceclassguid, jlong pszreference, jlong pszdeviceinterface, jlong pullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)pszreference, (void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)pullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong pfilter, jlong pcontext, jlong pcallback, jlong pnotifycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Notification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfilter, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pnotifycontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pfilter;
    (void)pcontext;
    (void)pcallback;
    (void)pnotifycontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Remove_SubTree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(JNIEnv* km_env, jclass km_clazz, jint dnancestor, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Remove_SubTree_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dnancestor, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_EjectA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_EjectW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong pvetotype, jlong pszvetoname, jint ulnamelength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)pvetotype, (void*)(uintptr_t)pszvetoname, (uint32_t)ulnamelength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Eject_PC");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(JNIEnv* km_env, jclass km_clazz, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Eject_PC_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(JNIEnv* km_env, jclass km_clazz, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Run_Detection");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(JNIEnv* km_env, jclass km_clazz, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Run_Detection_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulproperty, jlong buffer, jint ullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint ulproperty, jlong buffer, jint ullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproblem, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproblem, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproblem, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproblem, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong buffer, jint ullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong buffer, jint ullength, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong buffer, jint ullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulproperty, jlong buffer, jint ullength, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulproperty, (void*)(uintptr_t)buffer, (uint32_t)ullength, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Device_Interface_PropertyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Device_Interface_Property_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(JNIEnv* km_env, jclass km_clazz, jint ulhardwareprofile, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulhardwareprofile, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(JNIEnv* km_env, jclass km_clazz, jint ulhardwareprofile, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ulhardwareprofile, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulconfig, jint ulvalue, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulconfig, (uint32_t)ulvalue, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulconfig, jint ulvalue, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulconfig, (uint32_t)ulvalue, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulconfig, jint ulvalue, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulconfig, (uint32_t)ulvalue, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(JNIEnv* km_env, jclass km_clazz, jlong pdeviceid, jint ulconfig, jint ulvalue, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdeviceid, (uint32_t)ulconfig, (uint32_t)ulvalue, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Setup_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Setup_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(JNIEnv* km_env, jclass km_clazz, jlong ullstartvalue, jlong ullendvalue, jlong rlh, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Test_Range_Available");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)ullstartvalue, (uint64_t)ullendvalue, (uint64_t)rlh, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Uninstall_DevNode");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(JNIEnv* km_env, jclass km_clazz, jint dndevinst, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Uninstall_DevNode_Ex");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dndevinst, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceinterface, jint ulflags, jlong hmachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszdeviceinterface, (uint32_t)ulflags, (int64_t)hmachine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(JNIEnv* km_env, jclass km_clazz, jlong notifycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Notification");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)notifycontext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)notifycontext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong infpath, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDriverA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)infpath, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong infpath, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDriverW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)infpath, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong hwndparent, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiRollbackDriver");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)hwndparent, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)hwndparent;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong deviceinfoset, jlong deviceinfodata, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiShowUpdateDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong filepath, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiShowUpdateDriver");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)filepath, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)filepath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong deviceinfoset, jlong deviceinfodata, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong infpath, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDriverA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)infpath, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong infpath, jint flags, jlong needreboot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDriverW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)infpath, (uint32_t)flags, (void*)(uintptr_t)needreboot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(JNIEnv* km_env, jclass km_clazz, jlong window, jlong modulehandle, jlong commandline, jint showcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallHinfSectionA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)window, (void*)(uintptr_t)modulehandle, (void*)(uintptr_t)commandline, (int32_t)showcommand);
    } else {
        errno = ENOSYS;
    }
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(JNIEnv* km_env, jclass km_clazz, jlong window, jlong modulehandle, jlong commandline, jint showcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallHinfSectionW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)window, (void*)(uintptr_t)modulehandle, (void*)(uintptr_t)commandline, (int32_t)showcommand);
    } else {
        errno = ENOSYS;
    }
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong layoutinfhandle, jlong sectionname, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong layoutinfhandle, jlong sectionname, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong listinfhandle, jlong sectionname, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)sectionname, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong listinfhandle, jlong sectionname, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)sectionname, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong targetfilespec, jlong filesize, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)targetfilespec, (int64_t)filesize, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong targetfilespec, jlong filesize, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)targetfilespec, (int64_t)filesize, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToSourceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToSourceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong driveroot, jlong amount, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)driveroot, (int64_t)amount, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong driveroot, jlong amount, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)driveroot, (int64_t)amount, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong sourcefile, jlong targetfile, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupBackupErrorA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetfile, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong sourcefile, jlong targetfile, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupBackupErrorW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetfile, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCancelTemporarySourceList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(JNIEnv* km_env, jclass km_clazz, jlong queuehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseFileQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(JNIEnv* km_env, jclass km_clazz, jlong infhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseInfFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)infhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)infhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseLog");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(JNIEnv* km_env, jclass km_clazz, jlong owner, jlong queuehandle, jlong msghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCommitFileQueueA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)owner, (void*)(uintptr_t)queuehandle, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(JNIEnv* km_env, jclass km_clazz, jlong owner, jlong queuehandle, jlong msghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCommitFileQueueW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)owner, (void*)(uintptr_t)queuehandle, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong diskname, jlong pathtosource, jlong sourcefile, jlong targetpathfile, jint win32errorcode, jint style, jlong pathbuffer, jint pathbuffersize, jlong pathrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyErrorA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)diskname, (void*)(uintptr_t)pathtosource, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetpathfile, (uint32_t)win32errorcode, (uint32_t)style, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbuffersize, (void*)(uintptr_t)pathrequiredsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong diskname, jlong pathtosource, jlong sourcefile, jlong targetpathfile, jint win32errorcode, jint style, jlong pathbuffer, jint pathbuffersize, jlong pathrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyErrorW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)diskname, (void*)(uintptr_t)pathtosource, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetpathfile, (uint32_t)win32errorcode, (uint32_t)style, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbuffersize, (void*)(uintptr_t)pathrequiredsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(JNIEnv* km_env, jclass km_clazz, jlong sourceinffilename, jlong oemsourcemedialocation, jint oemsourcemediatype, jint copystyle, jlong destinationinffilename, jint destinationinffilenamesize, jlong requiredsize, jlong destinationinffilenamecomponent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyOEMInfA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourceinffilename, (void*)(uintptr_t)oemsourcemedialocation, (uint32_t)oemsourcemediatype, (uint32_t)copystyle, (void*)(uintptr_t)destinationinffilename, (uint32_t)destinationinffilenamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)destinationinffilenamecomponent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(JNIEnv* km_env, jclass km_clazz, jlong sourceinffilename, jlong oemsourcemedialocation, jint oemsourcemediatype, jint copystyle, jlong destinationinffilename, jint destinationinffilenamesize, jlong requiredsize, jlong destinationinffilenamecomponent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyOEMInfW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourceinffilename, (void*)(uintptr_t)oemsourcemedialocation, (uint32_t)oemsourcemediatype, (uint32_t)copystyle, (void*)(uintptr_t)destinationinffilename, (uint32_t)destinationinffilenamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)destinationinffilenamecomponent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong reserved1, jint reserved2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong reserved1, jint reserved2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong targetfilename, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong targetfilename, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(JNIEnv* km_env, jclass km_clazz, jlong context, jint notification, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)notification, (uint64_t)param1, (uint64_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(JNIEnv* km_env, jclass km_clazz, jlong context, jint notification, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)notification, (uint64_t)param1, (uint64_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong file, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDeleteErrorA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)file, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong file, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDeleteErrorW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)file, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(JNIEnv* km_env, jclass km_clazz, jlong diskspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDestroyDiskSpaceList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiAskForOEMDisk");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(JNIEnv* km_env, jclass km_clazz, jint flags, jlong classguidlist, jint classguidlistsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong classguidlist, jint classguidlistsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong classguidlist, jint classguidlistsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint drivertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildDriverInfoList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)drivertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(JNIEnv* km_env, jclass km_clazz, jint installfunction, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCallClassInstaller");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)installfunction, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)installfunction;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCancelDriverInfoSearch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiChangeState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(JNIEnv* km_env, jclass km_clazz, jlong classname, jlong classguidlist, jint classguidlistsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classname, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(JNIEnv* km_env, jclass km_clazz, jlong classname, jlong classguidlist, jint classguidlistsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classname, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(JNIEnv* km_env, jclass km_clazz, jlong classname, jlong classguidlist, jint classguidlistsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classname, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(JNIEnv* km_env, jclass km_clazz, jlong classname, jlong classguidlist, jint classguidlistsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classname, (void*)(uintptr_t)classguidlist, (uint32_t)classguidlistsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint scope, jint hwprofile, jint keytype, jlong infhandle, jlong infsectionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)scope, (uint32_t)hwprofile, (uint32_t)keytype, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint scope, jint hwprofile, jint keytype, jlong infhandle, jlong infsectionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)scope, (uint32_t)hwprofile, (uint32_t)keytype, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong devicename, jlong classguid, jlong devicedescription, jlong hwndparent, jint creationflags, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)devicename, (void*)(uintptr_t)classguid, (void*)(uintptr_t)devicedescription, (void*)(uintptr_t)hwndparent, (uint32_t)creationflags, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoList");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)hwndparent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)hwndparent;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong hwndparent, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong hwndparent, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong devicename, jlong classguid, jlong devicedescription, jlong hwndparent, jint creationflags, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)devicename, (void*)(uintptr_t)classguid, (void*)(uintptr_t)devicedescription, (void*)(uintptr_t)hwndparent, (uint32_t)creationflags, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong interfaceclassguid, jlong referencestring, jint creationflags, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)referencestring, (uint32_t)creationflags, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jint reserved, jint samdesired, jlong infhandle, jlong infsectionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (uint32_t)reserved, (uint32_t)samdesired, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jint reserved, jint samdesired, jlong infhandle, jlong infsectionname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (uint32_t)reserved, (uint32_t)samdesired, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong interfaceclassguid, jlong referencestring, jint creationflags, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)referencestring, (uint32_t)creationflags, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint scope, jint hwprofile, jint keytype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDevRegKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)scope, (uint32_t)hwprofile, (uint32_t)keytype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceRegKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(JNIEnv* km_env, jclass km_clazz, jlong classimagelistdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyClassImageList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classimagelistdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classimagelistdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyDeviceInfoList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint drivertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyDriverInfoList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)drivertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jint memberindex, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDeviceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (uint32_t)memberindex, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)memberindex;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong interfaceclassguid, jint memberindex, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDeviceInterfaces");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)interfaceclassguid, (uint32_t)memberindex, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)memberindex;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint drivertype, jint memberindex, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)drivertype, (uint32_t)memberindex, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint drivertype, jint memberindex, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)drivertype, (uint32_t)memberindex, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(JNIEnv* km_env, jclass km_clazz, jlong context, jlong alternateplatforminfo, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(JNIEnv* km_env, jclass km_clazz, jlong context, jlong alternateplatforminfo, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infsectionname, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong extension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)extension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infsectionname, jlong alternateplatforminfo, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong extension, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)extension, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infsectionname, jlong alternateplatforminfo, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong extension, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)extension, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infsectionname, jlong infsectionwithext, jint infsectionwithextsize, jlong requiredsize, jlong extension) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infsectionname, (void*)(uintptr_t)infsectionwithext, (uint32_t)infsectionwithextsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)extension);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong miniiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassBitmapIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)miniiconindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)miniiconindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classdescription, jint classdescriptionsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classdescription, (uint32_t)classdescriptionsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classdescription, jint classdescriptionsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classdescription, (uint32_t)classdescriptionsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classdescription, jint classdescriptionsize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classdescription, (uint32_t)classdescriptionsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong classdescription, jint classdescriptionsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)classdescription, (uint32_t)classdescriptionsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong propertysheetheader, jint propertysheetheaderpagelistsize, jlong requiredsize, jint propertysheettype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)propertysheetheader, (uint32_t)propertysheetheaderpagelistsize, (void*)(uintptr_t)requiredsize, (uint32_t)propertysheettype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong propertysheetheader, jint propertysheetheaderpagelistsize, jlong requiredsize, jint propertysheettype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)propertysheetheader, (uint32_t)propertysheetheaderpagelistsize, (void*)(uintptr_t)requiredsize, (uint32_t)propertysheettype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong enumerator, jlong hwndparent, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)enumerator, (void*)(uintptr_t)hwndparent, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong enumerator, jlong hwndparent, jint flags, jlong deviceinfoset, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsExA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)enumerator, (void*)(uintptr_t)hwndparent, (uint32_t)flags, (int64_t)deviceinfoset, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong enumerator, jlong hwndparent, jint flags, jlong deviceinfoset, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsExW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)enumerator, (void*)(uintptr_t)hwndparent, (uint32_t)flags, (int64_t)deviceinfoset, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong enumerator, jlong hwndparent, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)enumerator, (void*)(uintptr_t)hwndparent, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(JNIEnv* km_env, jclass km_clazz, jlong classimagelistdata, jlong classguid, jlong imageindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classimagelistdata, (void*)(uintptr_t)classguid, (void*)(uintptr_t)imageindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classimagelistdata;
    (void)classguid;
    (void)imageindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(JNIEnv* km_env, jclass km_clazz, jlong classimagelistdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classimagelistdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classimagelistdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(JNIEnv* km_env, jclass km_clazz, jlong classimagelistdata, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageListExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classimagelistdata, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(JNIEnv* km_env, jclass km_clazz, jlong classimagelistdata, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageListExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classimagelistdata, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong classinstallparams, jint classinstallparamssize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)classinstallparams, (uint32_t)classinstallparamssize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong classinstallparams, jint classinstallparamssize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)classinstallparams, (uint32_t)classinstallparamssize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jlong propertytype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jint flags, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (uint32_t)flags, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykeyarray, jint propertykeycount, jlong requiredpropertykeycount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykeyarray, (uint32_t)propertykeycount, (void*)(uintptr_t)requiredpropertykeycount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykeyarray, jint propertykeycount, jlong requiredpropertykeycount, jint flags, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeysExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykeyarray, (uint32_t)propertykeycount, (void*)(uintptr_t)requiredpropertykeycount, (uint32_t)flags, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jlong propertytype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint property, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)property, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint property, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)property, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong custompropertyname, jint flags, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)custompropertyname, (uint32_t)flags, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong custompropertyname, jint flags, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)custompropertyname, (uint32_t)flags, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong classguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)classguid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)classguid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfosetdetaildata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfosetdetaildata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfosetdetaildata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfosetdetaildata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstanceid, jint deviceinstanceidsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstanceid, (uint32_t)deviceinstanceidsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstanceid, jint deviceinstanceidsize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstanceid, (uint32_t)deviceinstanceidsize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong aliasinterfaceclassguid, jlong aliasdeviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceAlias");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)aliasinterfaceclassguid, (void*)(uintptr_t)aliasdeviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)aliasinterfaceclassguid;
    (void)aliasdeviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong deviceinterfacedetaildata, jint deviceinterfacedetaildatasize, jlong requiredsize, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)deviceinterfacedetaildata, (uint32_t)deviceinterfacedetaildatasize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong deviceinterfacedetaildata, jint deviceinterfacedetaildatasize, jlong requiredsize, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)deviceinterfacedetaildata, (uint32_t)deviceinterfacedetaildatasize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong propertykeyarray, jint propertykeycount, jlong requiredpropertykeycount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)propertykeyarray, (uint32_t)propertykeycount, (void*)(uintptr_t)requiredpropertykeycount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong propertykey, jlong propertytype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong propertykeyarray, jint propertykeycount, jlong requiredpropertykeycount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)propertykeyarray, (uint32_t)propertykeycount, (void*)(uintptr_t)requiredpropertykeycount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong propertykey, jlong propertytype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)propertykey, (void*)(uintptr_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint property, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)property, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint property, jlong propertyregdatatype, jlong propertybuffer, jint propertybuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)property, (void*)(uintptr_t)propertyregdatatype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinfodetaildata, jint driverinfodetaildatasize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinfodetaildata, (uint32_t)driverinfodetaildatasize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinfodetaildata, jint driverinfodetaildatasize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinfodetaildata, (uint32_t)driverinfodetaildatasize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(JNIEnv* km_env, jclass km_clazz, jint hwprofile, jlong friendlyname, jint friendlynamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hwprofile, (void*)(uintptr_t)friendlyname, (uint32_t)friendlynamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(JNIEnv* km_env, jclass km_clazz, jint hwprofile, jlong friendlyname, jint friendlynamesize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hwprofile, (void*)(uintptr_t)friendlyname, (uint32_t)friendlynamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(JNIEnv* km_env, jclass km_clazz, jint hwprofile, jlong friendlyname, jint friendlynamesize, jlong requiredsize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hwprofile, (void*)(uintptr_t)friendlyname, (uint32_t)friendlynamesize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(JNIEnv* km_env, jclass km_clazz, jint hwprofile, jlong friendlyname, jint friendlynamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hwprofile, (void*)(uintptr_t)friendlyname, (uint32_t)friendlynamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(JNIEnv* km_env, jclass km_clazz, jlong hwprofilelist, jint hwprofilelistsize, jlong requiredsize, jlong currentlyactiveindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwprofilelist, (uint32_t)hwprofilelistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)currentlyactiveindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(JNIEnv* km_env, jclass km_clazz, jlong hwprofilelist, jint hwprofilelistsize, jlong requiredsize, jlong currentlyactiveindex, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwprofilelist, (uint32_t)hwprofilelistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)currentlyactiveindex, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(JNIEnv* km_env, jclass km_clazz, jlong hwprofilelist, jint hwprofilelistsize, jlong requiredsize, jlong currentlyactiveindex, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwprofilelist, (uint32_t)hwprofilelistsize, (void*)(uintptr_t)requiredsize, (void*)(uintptr_t)currentlyactiveindex, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(JNIEnv* km_env, jclass km_clazz, jlong infname, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetINFClassA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infname, (void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(JNIEnv* km_env, jclass km_clazz, jlong infname, jlong classguid, jlong classname, jint classnamesize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetINFClassW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infname, (void*)(uintptr_t)classguid, (void*)(uintptr_t)classname, (uint32_t)classnamesize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong installwizarddata, jint pagetype, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetWizardPage");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)installwizarddata, (uint32_t)pagetype, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)installwizarddata;
    (void)pagetype;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong inffilename, jint flags, jlong filequeue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)filequeue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong inffilename, jint flags, jlong filequeue, jlong interfaceclassguid, jlong reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)filequeue, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong inffilename, jint flags, jlong filequeue, jlong interfaceclassguid, jlong reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)filequeue, (void*)(uintptr_t)interfaceclassguid, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong inffilename, jint flags, jlong filequeue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)filequeue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDeviceInterfaces");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDriverFiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong largeicon, jlong miniiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiLoadClassIcon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)largeicon, (void*)(uintptr_t)miniiconindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)largeicon;
    (void)miniiconindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint cxicon, jint cyicon, jint flags, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiLoadDeviceIcon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)cxicon, (uint32_t)cyicon, (uint32_t)flags, (void*)(uintptr_t)hicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)cxicon;
    (void)cyicon;
    (void)flags;
    (void)hicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKey");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)samdesired);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)classguid;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint samdesired, jint flags, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)samdesired, (uint32_t)flags, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint samdesired, jint flags, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)samdesired, (uint32_t)flags, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint scope, jint hwprofile, jint keytype, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDevRegKey");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)scope, (uint32_t)hwprofile, (uint32_t)keytype, (uint32_t)samdesired);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinstanceid, jlong hwndparent, jint openflags, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinstanceid, (void*)(uintptr_t)hwndparent, (uint32_t)openflags, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinstanceid, jlong hwndparent, jint openflags, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinstanceid, (void*)(uintptr_t)hwndparent, (uint32_t)openflags, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong devicepath, jint openflags, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)devicepath, (uint32_t)openflags, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jint reserved, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceRegKey");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (uint32_t)reserved, (uint32_t)samdesired);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong devicepath, jint openflags, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)devicepath, (uint32_t)openflags, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRegisterCoDeviceInstallers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint flags, jlong compareproc, jlong comparecontext, jlong dupdeviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRegisterDeviceInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)flags, (void*)(uintptr_t)compareproc, (void*)(uintptr_t)comparecontext, (void*)(uintptr_t)dupdeviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)compareproc;
    (void)comparecontext;
    (void)dupdeviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRemoveDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRemoveDeviceInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRestartDevices");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectBestCompatDrv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectOEMDrv");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong classinstallparams, jint classinstallparamssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)classinstallparams, (uint32_t)classinstallparamssize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong classinstallparams, jint classinstallparamssize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)classinstallparams, (uint32_t)classinstallparamssize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint flags, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassPropertyExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)flags, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint property, jlong propertybuffer, jint propertybuffersize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)property, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong classguid, jint property, jlong propertybuffer, jint propertybuffersize, jlong machinename, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)classguid, (uint32_t)property, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (void*)(uintptr_t)machinename, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong deviceinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)deviceinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfaceDefault");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (uint32_t)flags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinterfacedata, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfacePropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinterfacedata, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong propertykey, jint propertytype, jlong propertybuffer, jint propertybuffersize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDevicePropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)propertykey, (uint32_t)propertytype, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint property, jlong propertybuffer, jint propertybuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)property, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jint property, jlong propertybuffer, jint propertybuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (uint32_t)property, (void*)(uintptr_t)propertybuffer, (uint32_t)propertybuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata, jlong driverinstallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata, (void*)(uintptr_t)driverinstallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata, jlong driverinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)driverinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiUnremoveDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong reserved1, jint reserved2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong reserved1, jint reserved2, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint arg1Index, jlong buffer, jint size, jlong sizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupEnumInfSectionsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)arg1Index, (void*)(uintptr_t)buffer, (uint32_t)size, (void*)(uintptr_t)sizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)arg1Index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint arg1Index, jlong buffer, jint size, jlong sizeneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupEnumInfSectionsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)arg1Index, (void*)(uintptr_t)buffer, (uint32_t)size, (void*)(uintptr_t)sizeneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)arg1Index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section, jlong key, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindFirstLineA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (void*)(uintptr_t)key, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section, jlong key, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindFirstLineW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (void*)(uintptr_t)key, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(JNIEnv* km_env, jclass km_clazz, jlong contextin, jlong contextout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextLine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contextin, (void*)(uintptr_t)contextout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contextin;
    (void)contextout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(JNIEnv* km_env, jclass km_clazz, jlong contextin, jlong key, jlong contextout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextMatchLineA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contextin, (void*)(uintptr_t)key, (void*)(uintptr_t)contextout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(JNIEnv* km_env, jclass km_clazz, jlong contextin, jlong key, jlong contextout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextMatchLineW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contextin, (void*)(uintptr_t)key, (void*)(uintptr_t)contextout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(JNIEnv* km_env, jclass km_clazz, jlong list, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFreeSourceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)list, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)list;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(JNIEnv* km_env, jclass km_clazz, jlong list, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFreeSourceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)list, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)list;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong backupparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBackupInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)backupparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)backupparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong backupparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBackupInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)backupparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)backupparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBinaryField");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFieldCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong actualsourcefilename, jlong sourcefilesize, jlong targetfilesize, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)actualsourcefilename, (void*)(uintptr_t)sourcefilesize, (void*)(uintptr_t)targetfilesize, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong actualsourcefilenamebuffer, jint actualsourcefilenamebufferlen, jlong requiredbufferlen, jlong sourcefilesize, jlong targetfilesize, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)actualsourcefilenamebuffer, (uint32_t)actualsourcefilenamebufferlen, (void*)(uintptr_t)requiredbufferlen, (void*)(uintptr_t)sourcefilesize, (void*)(uintptr_t)targetfilesize, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong actualsourcefilenamebuffer, jint actualsourcefilenamebufferlen, jlong requiredbufferlen, jlong sourcefilesize, jlong targetfilesize, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)actualsourcefilenamebuffer, (uint32_t)actualsourcefilenamebufferlen, (void*)(uintptr_t)requiredbufferlen, (void*)(uintptr_t)sourcefilesize, (void*)(uintptr_t)targetfilesize, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(JNIEnv* km_env, jclass km_clazz, jlong sourcefilename, jlong actualsourcefilename, jlong sourcefilesize, jlong targetfilesize, jlong compressiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)actualsourcefilename, (void*)(uintptr_t)sourcefilesize, (void*)(uintptr_t)targetfilesize, (void*)(uintptr_t)compressiontype);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jint subqueuefileop, jlong numoperations) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileQueueCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (uint32_t)subqueuefileop, (void*)(uintptr_t)numoperations);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)subqueuefileop;
    (void)numoperations;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileQueueFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong alternateplatforminfo, jlong localename, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)localename, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong alternateplatforminfo, jlong localename, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)localename, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(JNIEnv* km_env, jclass km_clazz, jlong directorypath, jint infstyle, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfFileListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directorypath, (uint32_t)infstyle, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(JNIEnv* km_env, jclass km_clazz, jlong directorypath, jint infstyle, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfFileListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directorypath, (uint32_t)infstyle, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(JNIEnv* km_env, jclass km_clazz, jlong infspec, jint searchcontrol, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infspec, (uint32_t)searchcontrol, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(JNIEnv* km_env, jclass km_clazz, jlong infspec, jint searchcontrol, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infspec, (uint32_t)searchcontrol, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(JNIEnv* km_env, jclass km_clazz, jlong driverstorelocation, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfPublishedNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverstorelocation, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(JNIEnv* km_env, jclass km_clazz, jlong driverstorelocation, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfPublishedNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverstorelocation, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong integervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetIntField");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)integervalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)integervalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section, jint arg2Index, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineByIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (uint32_t)arg2Index, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    (void)arg2Index;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section, jint arg2Index, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineByIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (uint32_t)arg2Index, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    (void)arg2Index;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineCountA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineCountW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(JNIEnv* km_env, jclass km_clazz, jlong context, jlong infhandle, jlong section, jlong key, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineTextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (void*)(uintptr_t)key, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(JNIEnv* km_env, jclass km_clazz, jlong context, jlong infhandle, jlong section, jlong key, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineTextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)section, (void*)(uintptr_t)key, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetMultiSzFieldA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetMultiSzFieldW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetNonInteractiveMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong filename, jlong sourceid, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileLocationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)filename, (void*)(uintptr_t)sourceid, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong filename, jlong sourceid, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileLocationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)filename, (void*)(uintptr_t)sourceid, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong filename, jlong section, jlong filesize, jint roundingfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileSizeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)filename, (void*)(uintptr_t)section, (void*)(uintptr_t)filesize, (uint32_t)roundingfactor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong filename, jlong section, jlong filesize, jint roundingfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileSizeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)filename, (void*)(uintptr_t)section, (void*)(uintptr_t)filesize, (uint32_t)roundingfactor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint sourceid, jint infodesired, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)sourceid, (uint32_t)infodesired, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint sourceid, jint infodesired, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)sourceid, (uint32_t)infodesired, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetStringFieldA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(JNIEnv* km_env, jclass km_clazz, jlong context, jint fieldindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetStringFieldW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)fieldindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong section, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetTargetPathA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)section, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong section, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetTargetPathW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)section, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetThreadLogToken");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(JNIEnv* km_env, jclass km_clazz, jlong ownerwindow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallback");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ownerwindow);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ownerwindow;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(JNIEnv* km_env, jclass km_clazz, jlong ownerwindow, jlong alternateprogresswindow, jint progressmessage, jint reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallbackEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ownerwindow, (void*)(uintptr_t)alternateprogresswindow, (uint32_t)progressmessage, (uint32_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ownerwindow;
    (void)alternateprogresswindow;
    (void)progressmessage;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(JNIEnv* km_env, jclass km_clazz, jlong logfilename, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitializeFileLogA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logfilename, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)logfilename;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(JNIEnv* km_env, jclass km_clazz, jlong logfilename, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitializeFileLogW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logfilename, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)logfilename;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong sourcefile, jlong sourcepathroot, jlong destinationname, jint copystyle, jlong copymsghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)sourcepathroot, (void*)(uintptr_t)destinationname, (uint32_t)copystyle, (void*)(uintptr_t)copymsghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong sourcefile, jlong sourcepathroot, jlong destinationname, jint copystyle, jlong copymsghandler, jlong context, jlong filewasinuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)sourcepathroot, (void*)(uintptr_t)destinationname, (uint32_t)copystyle, (void*)(uintptr_t)copymsghandler, (void*)(uintptr_t)context, (void*)(uintptr_t)filewasinuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong sourcefile, jlong sourcepathroot, jlong destinationname, jint copystyle, jlong copymsghandler, jlong context, jlong filewasinuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)sourcepathroot, (void*)(uintptr_t)destinationname, (uint32_t)copystyle, (void*)(uintptr_t)copymsghandler, (void*)(uintptr_t)context, (void*)(uintptr_t)filewasinuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong infcontext, jlong sourcefile, jlong sourcepathroot, jlong destinationname, jint copystyle, jlong copymsghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)infcontext, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)sourcepathroot, (void*)(uintptr_t)destinationname, (uint32_t)copystyle, (void*)(uintptr_t)copymsghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong layoutinfhandle, jlong filequeue, jlong sectionname, jlong sourcerootpath, jint copyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)filequeue, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)sourcerootpath, (uint32_t)copyflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong layoutinfhandle, jlong filequeue, jlong sectionname, jlong sourcerootpath, jint copyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)filequeue, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)sourcerootpath, (uint32_t)copyflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(JNIEnv* km_env, jclass km_clazz, jlong owner, jlong infhandle, jlong sectionname, jint flags, jlong relativekeyroot, jlong sourcerootpath, jint copyflags, jlong msghandler, jlong context, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFromInfSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)owner, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags, (void*)(uintptr_t)relativekeyroot, (void*)(uintptr_t)sourcerootpath, (uint32_t)copyflags, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(JNIEnv* km_env, jclass km_clazz, jlong owner, jlong infhandle, jlong sectionname, jint flags, jlong relativekeyroot, jlong sourcerootpath, jint copyflags, jlong msghandler, jlong context, jlong deviceinfoset, jlong deviceinfodata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFromInfSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)owner, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags, (void*)(uintptr_t)relativekeyroot, (void*)(uintptr_t)sourcerootpath, (uint32_t)copyflags, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags, jlong deviceinfoset, jlong deviceinfodata, jlong reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags, jlong deviceinfoset, jlong deviceinfodata, jlong reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags, (int64_t)deviceinfoset, (void*)(uintptr_t)deviceinfodata, (void*)(uintptr_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jlong sectionname, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (void*)(uintptr_t)sectionname, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(JNIEnv* km_env, jclass km_clazz, jlong cabinetfile, jint reserved, jlong msghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupIterateCabinetA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cabinetfile, (uint32_t)reserved, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(JNIEnv* km_env, jclass km_clazz, jlong cabinetfile, jint reserved, jlong msghandler, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupIterateCabinetW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cabinetfile, (uint32_t)reserved, (void*)(uintptr_t)msghandler, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(JNIEnv* km_env, jclass km_clazz, jlong messagestring, jint severity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogErrorA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)messagestring, (uint32_t)severity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)messagestring;
    (void)severity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(JNIEnv* km_env, jclass km_clazz, jlong messagestring, jint severity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogErrorW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)messagestring, (uint32_t)severity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)messagestring;
    (void)severity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong sourcefilename, jlong targetfilename, jint checksum, jlong disktagfile, jlong diskdescription, jlong otherinfo, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (uint32_t)checksum, (void*)(uintptr_t)disktagfile, (void*)(uintptr_t)diskdescription, (void*)(uintptr_t)otherinfo, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong sourcefilename, jlong targetfilename, jint checksum, jlong disktagfile, jlong diskdescription, jlong otherinfo, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (uint32_t)checksum, (void*)(uintptr_t)disktagfile, (void*)(uintptr_t)diskdescription, (void*)(uintptr_t)otherinfo, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong infhandle, jlong errorline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenAppendInfFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)errorline);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong infhandle, jlong errorline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenAppendInfFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)errorline);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenFileQueue");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong infclass, jint infstyle, jlong errorline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenInfFileA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)infclass, (uint32_t)infstyle, (void*)(uintptr_t)errorline);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong infclass, jint infstyle, jlong errorline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenInfFileW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)infclass, (uint32_t)infstyle, (void*)(uintptr_t)errorline);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(JNIEnv* km_env, jclass km_clazz, jint erase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenLog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)erase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)erase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenMasterInf");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong backuppath, jint restoreflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)backuppath, (uint32_t)restoreflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong backuppath, jint restoreflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)backuppath, (uint32_t)restoreflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong diskname, jlong pathtosource, jlong filesought, jlong tagfile, jint diskpromptstyle, jlong pathbuffer, jint pathbuffersize, jlong pathrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptForDiskA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)diskname, (void*)(uintptr_t)pathtosource, (void*)(uintptr_t)filesought, (void*)(uintptr_t)tagfile, (uint32_t)diskpromptstyle, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbuffersize, (void*)(uintptr_t)pathrequiredsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong diskname, jlong pathtosource, jlong filesought, jlong tagfile, jint diskpromptstyle, jlong pathbuffer, jint pathbuffersize, jlong pathrequiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptForDiskW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)diskname, (void*)(uintptr_t)pathtosource, (void*)(uintptr_t)filesought, (void*)(uintptr_t)tagfile, (uint32_t)diskpromptstyle, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbuffersize, (void*)(uintptr_t)pathrequiredsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jlong owner, jint scanonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptReboot");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (void*)(uintptr_t)owner, (int32_t)scanonly);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)owner;
    (void)scanonly;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong targetfilename, jint desiredinfo, jlong dataout, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryFileLogA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)targetfilename, (int32_t)desiredinfo, (void*)(uintptr_t)dataout, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong targetfilename, jint desiredinfo, jlong dataout, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryFileLogW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)targetfilename, (int32_t)desiredinfo, (void*)(uintptr_t)dataout, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfFileInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfFileInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong alternateplatforminfo, jlong originalfileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)originalfileinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong alternateplatforminfo, jlong originalfileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)originalfileinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong key, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)key, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(JNIEnv* km_env, jclass km_clazz, jlong infinformation, jint infindex, jlong key, jlong returnbuffer, jint returnbuffersize, jlong requiredsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infinformation, (uint32_t)infindex, (void*)(uintptr_t)key, (void*)(uintptr_t)returnbuffer, (uint32_t)returnbuffersize, (void*)(uintptr_t)requiredsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong list, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySourceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)list, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)list;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong list, jlong count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySourceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)list, (void*)(uintptr_t)count);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)list;
    (void)count;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong drivespec, jlong spacerequired, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)drivespec, (void*)(uintptr_t)spacerequired, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong drivespec, jlong spacerequired, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)drivespec, (void*)(uintptr_t)spacerequired, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcerootpath, jlong sourcepath, jlong sourcefilename, jlong sourcedescription, jlong sourcetagfile, jlong targetdirectory, jlong targetfilename, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)sourcepath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)sourcedescription, (void*)(uintptr_t)sourcetagfile, (void*)(uintptr_t)targetdirectory, (void*)(uintptr_t)targetfilename, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(JNIEnv* km_env, jclass km_clazz, jlong copyparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyIndirectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)copyparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)copyparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(JNIEnv* km_env, jclass km_clazz, jlong copyparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyIndirectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)copyparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)copyparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcerootpath, jlong infhandle, jlong listinfhandle, jlong section, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopySectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcerootpath, jlong infhandle, jlong listinfhandle, jlong section, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopySectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcerootpath, jlong sourcepath, jlong sourcefilename, jlong sourcedescription, jlong sourcetagfile, jlong targetdirectory, jlong targetfilename, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)sourcepath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)sourcedescription, (void*)(uintptr_t)sourcetagfile, (void*)(uintptr_t)targetdirectory, (void*)(uintptr_t)targetfilename, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong sourcerootpath, jlong sourcefilename, jlong targetfilename, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDefaultCopyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong sourcerootpath, jlong sourcefilename, jlong targetfilename, jint copystyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDefaultCopyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)sourcerootpath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetfilename, (uint32_t)copystyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong pathpart1, jlong pathpart2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)pathpart1, (void*)(uintptr_t)pathpart2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong listinfhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong listinfhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong pathpart1, jlong pathpart2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)pathpart1, (void*)(uintptr_t)pathpart2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcepath, jlong sourcefilename, jlong targetpath, jlong targetfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcepath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetpath, (void*)(uintptr_t)targetfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong listinfhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameSectionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong infhandle, jlong listinfhandle, jlong section) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameSectionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)section);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong sourcepath, jlong sourcefilename, jlong targetpath, jlong targetfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)sourcepath, (void*)(uintptr_t)sourcefilename, (void*)(uintptr_t)targetpath, (void*)(uintptr_t)targetfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong targetfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)targetfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle, jlong logsectionname, jlong targetfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle, (void*)(uintptr_t)logsectionname, (void*)(uintptr_t)targetfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong targetfilespec, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)targetfilespec, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong targetfilespec, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)targetfilespec, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromSourceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromSourceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong layoutinfhandle, jlong sectionname, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong layoutinfhandle, jlong sectionname, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)layoutinfhandle, (void*)(uintptr_t)sectionname, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong listinfhandle, jlong sectionname, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)sectionname, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(JNIEnv* km_env, jclass km_clazz, jlong diskspace, jlong infhandle, jlong listinfhandle, jlong sectionname, jint operation, jlong reserved1, jint reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)diskspace, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)listinfhandle, (void*)(uintptr_t)sectionname, (uint32_t)operation, (void*)(uintptr_t)reserved1, (uint32_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong sourcefile, jlong targetfile, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRenameErrorA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetfile, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong dialogtitle, jlong sourcefile, jlong targetfile, jint win32errorcode, jint style) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRenameErrorW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)dialogtitle, (void*)(uintptr_t)sourcefile, (void*)(uintptr_t)targetfile, (uint32_t)win32errorcode, (uint32_t)style);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jint flags, jlong window, jlong callbackroutine, jlong callbackcontext, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupScanFileQueueA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (uint32_t)flags, (void*)(uintptr_t)window, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jint flags, jlong window, jlong callbackroutine, jlong callbackcontext, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupScanFileQueueW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (uint32_t)flags, (void*)(uintptr_t)window, (void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint id, jlong directory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)id, (void*)(uintptr_t)directory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint id, jlong directory, jint flags, jint reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)id, (void*)(uintptr_t)directory, (uint32_t)flags, (uint32_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint id, jlong directory, jint flags, jint reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)id, (void*)(uintptr_t)directory, (uint32_t)flags, (uint32_t)reserved1, (void*)(uintptr_t)reserved2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(JNIEnv* km_env, jclass km_clazz, jlong infhandle, jint id, jlong directory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infhandle, (uint32_t)id, (void*)(uintptr_t)directory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong alternateplatforminfo, jlong alternatedefaultcatalogfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)alternatedefaultcatalogfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(JNIEnv* km_env, jclass km_clazz, jlong queuehandle, jlong alternateplatforminfo, jlong alternatedefaultcatalogfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queuehandle, (void*)(uintptr_t)alternateplatforminfo, (void*)(uintptr_t)alternatedefaultcatalogfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jint flagmask, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (uint32_t)flagmask, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)flagmask;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(JNIEnv* km_env, jclass km_clazz, jint noninteractiveflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetNonInteractiveMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)noninteractiveflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)noninteractiveflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(JNIEnv* km_env, jclass km_clazz, jlong override) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)override);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)override;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(JNIEnv* km_env, jclass km_clazz, jlong override) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)override);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)override;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcelist, jint sourcecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetSourceListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcelist, (uint32_t)sourcecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcelist, jint sourcecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetSourceListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcelist, (uint32_t)sourcecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(JNIEnv* km_env, jclass km_clazz, jlong logtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetThreadLogToken");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)logtoken);
    } else {
        errno = ENOSYS;
    }
#else
    (void)logtoken;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupTermDefaultQueueCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(JNIEnv* km_env, jclass km_clazz, jlong fileloghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupTerminateFileLog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileloghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileloghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(JNIEnv* km_env, jclass km_clazz, jlong filequeue, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallNewlyCopiedInfs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filequeue, (uint32_t)flags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filequeue;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(JNIEnv* km_env, jclass km_clazz, jlong inffilename, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallOEMInfA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(JNIEnv* km_env, jclass km_clazz, jlong inffilename, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallOEMInfW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inffilename, (uint32_t)flags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(JNIEnv* km_env, jclass km_clazz, jlong infname, jlong altplatforminfo, jlong infsignerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupVerifyInfFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infname, (void*)(uintptr_t)altplatforminfo, (void*)(uintptr_t)infsignerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(JNIEnv* km_env, jclass km_clazz, jlong infname, jlong altplatforminfo, jlong infsignerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupVerifyInfFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infname, (void*)(uintptr_t)altplatforminfo, (void*)(uintptr_t)infsignerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(JNIEnv* km_env, jclass km_clazz, jlong logtoken, jint category, jint flags, jlong messagestr, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(uint64_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLog");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)flags, (void*)(uintptr_t)messagestr); break;
            case 1: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)flags, (void*)(uintptr_t)messagestr, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)flags, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)flags, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)flags, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)logtoken;
    (void)category;
    (void)flags;
    (void)messagestr;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(JNIEnv* km_env, jclass km_clazz, jlong logtoken, jint category, jint logflags, jint error, jlong messagestr, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLogError");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)logflags, (uint32_t)error, (void*)(uintptr_t)messagestr); break;
            case 1: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)logflags, (uint32_t)error, (void*)(uintptr_t)messagestr, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)logflags, (uint32_t)error, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)logflags, (uint32_t)error, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((uint64_t)logtoken, (uint32_t)category, (uint32_t)logflags, (uint32_t)error, (void*)(uintptr_t)messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)logtoken;
    (void)category;
    (void)logflags;
    (void)error;
    (void)messagestr;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(JNIEnv* km_env, jclass km_clazz, jlong logtoken, jint flags, jlong infhandle, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLogInfLine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)logtoken, (uint32_t)flags, (void*)(uintptr_t)infhandle, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
    }
#else
    (void)logtoken;
    (void)flags;
    (void)infhandle;
    (void)context;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hardwareid, jlong fullinfpath, jint installflags, jlong brebootrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hardwareid, (void*)(uintptr_t)fullinfpath, (uint32_t)installflags, (void*)(uintptr_t)brebootrequired);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_deviceanddriverinstallation_WindowsWin32DevicesDeviceanddriverinstallationJniBridge_windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hardwareid, jlong fullinfpath, jint installflags, jlong brebootrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hardwareid, (void*)(uintptr_t)fullinfpath, (uint32_t)installflags, (void*)(uintptr_t)brebootrequired);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

