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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxCanSendToFaxRecipient(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanSendToFaxRecipient");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxAbort(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAbort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxAccessCheck(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint accessmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAccessCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)accessmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)accessmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxClose(JNIEnv* km_env, jclass km_clazz, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsA(JNIEnv* km_env, jclass km_clazz, jlong jobparams, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)jobparams;
    (void)coverpageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxCompleteJobParamsW(JNIEnv* km_env, jclass km_clazz, jlong jobparams, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)jobparams;
    (void)coverpageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxConnectFaxServerA(JNIEnv* km_env, jclass km_clazz, jlong machinename, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)machinename, (void*)(uintptr_t)faxhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machinename;
    (void)faxhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxConnectFaxServerW(JNIEnv* km_env, jclass km_clazz, jlong machinename, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)machinename, (void*)(uintptr_t)faxhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machinename;
    (void)faxhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jint enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (int32_t)enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnableRoutingMethodW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jint enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (int32_t)enabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo, (void*)(uintptr_t)methodsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumGlobalRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo, (void*)(uintptr_t)methodsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumJobsA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong jobentry, jlong jobsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)jobentry, (void*)(uintptr_t)jobsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumJobsW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong jobentry, jlong jobsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)jobentry, (void*)(uintptr_t)jobsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumPortsA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong portinfo, jlong portsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)portinfo, (void*)(uintptr_t)portsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumPortsW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong portinfo, jlong portsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)portinfo, (void*)(uintptr_t)portsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingmethod, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingmethod, (void*)(uintptr_t)methodsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxEnumRoutingMethodsW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingmethod, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingmethod, (void*)(uintptr_t)methodsreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxFreeBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetConfigurationA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetConfigurationW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong devicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)devicestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)devicestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetDeviceStatusW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong devicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)devicestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)devicestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetJobA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)jobentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetJobW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)jobentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jlong numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (void*)(uintptr_t)numbercategories);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetLoggingCategoriesW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jlong numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (void*)(uintptr_t)numbercategories);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetPageData(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong buffer, jlong buffersize, jlong imagewidth, jlong imageheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPageData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)imagewidth, (void*)(uintptr_t)imageheight);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    (void)buffer;
    (void)buffersize;
    (void)imagewidth;
    (void)imageheight;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetPortA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetPortW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jlong routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (void*)(uintptr_t)routinginfobuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxGetRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jlong routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (void*)(uintptr_t)routinginfobuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxInitializeEventQueue(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong completionport, jlong completionkey, jlong hwnd, jint messagestart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxInitializeEventQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)completionport, (uint64_t)completionkey, (void*)(uintptr_t)hwnd, (uint32_t)messagestart);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)completionport;
    (void)completionkey;
    (void)hwnd;
    (void)messagestart;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxOpenPort(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint deviceid, jint flags, jlong faxporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxOpenPort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)deviceid, (uint32_t)flags, (void*)(uintptr_t)faxporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)deviceid;
    (void)flags;
    (void)faxporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxPrintCoverPageA(JNIEnv* km_env, jclass km_clazz, jlong faxcontextinfo, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxcontextinfo, (void*)(uintptr_t)coverpageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxPrintCoverPageW(JNIEnv* km_env, jclass km_clazz, jlong faxcontextinfo, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxcontextinfo, (void*)(uintptr_t)coverpageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxRegisterRoutingExtensionW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong extensionname, jlong friendlyname, jlong imagename, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterRoutingExtensionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)extensionname, (void*)(uintptr_t)friendlyname, (void*)(uintptr_t)imagename, (void*)(uintptr_t)callback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)extensionname;
    (void)friendlyname;
    (void)imagename;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxRegisterServiceProviderW(JNIEnv* km_env, jclass km_clazz, jlong deviceprovider, jlong friendlyname, jlong imagename, jlong tspname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterServiceProviderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceprovider, (void*)(uintptr_t)friendlyname, (void*)(uintptr_t)imagename, (void*)(uintptr_t)tspname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceprovider;
    (void)friendlyname;
    (void)imagename;
    (void)tspname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSendDocumentA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong jobparams, jlong coverpageinfo, jlong faxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo, (void*)(uintptr_t)faxjobid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong faxjobid, jlong faxrecipientcallback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxrecipientcallback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSendDocumentForBroadcastW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong faxjobid, jlong faxrecipientcallback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxrecipientcallback, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSendDocumentW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong jobparams, jlong coverpageinfo, jlong faxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo, (void*)(uintptr_t)faxjobid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetConfigurationA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetConfigurationW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)faxconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)routinginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetGlobalRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)routinginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetJobA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jint command, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (uint32_t)command, (void*)(uintptr_t)jobentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetJobW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jint command, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (uint32_t)command, (void*)(uintptr_t)jobentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jint numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (uint32_t)numbercategories);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetLoggingCategoriesW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jint numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (uint32_t)numbercategories);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetPortA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetPortW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)portinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jint routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (uint32_t)routinginfobuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxSetRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jint routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (uint32_t)routinginfobuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxStartPrintJobA(JNIEnv* km_env, jclass km_clazz, jlong printername, jlong printinfo, jlong faxjobid, jlong faxcontextinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)printername, (void*)(uintptr_t)printinfo, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxcontextinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxStartPrintJobW(JNIEnv* km_env, jclass km_clazz, jlong printername, jlong printinfo, jlong faxjobid, jlong faxcontextinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)printername, (void*)(uintptr_t)printinfo, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxcontextinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxFaxUnregisterServiceProviderW(JNIEnv* km_env, jclass km_clazz, jlong deviceprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxUnregisterServiceProviderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxSendToFaxRecipient(JNIEnv* km_env, jclass km_clazz, jint sndmode, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendToFaxRecipient");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sndmode, (void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sndmode;
    (void)lpfilename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssysWindowsWin32DevicesFaxStiCreateInstanceW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint dwver, jlong ppsti, jlong punkouter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sti.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StiCreateInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinst, (uint32_t)dwver, (void*)(uintptr_t)ppsti, (void*)(uintptr_t)punkouter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)dwver;
    (void)ppsti;
    (void)punkouter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

