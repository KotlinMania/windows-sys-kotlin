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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1CanSendToFaxRecipient(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanSendToFaxRecipient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxAbort(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAbort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxAccessCheck(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint accessmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxAccessCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)accessmask) : -1;
#else
    (void)faxhandle;
    (void)accessmask;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxClose(JNIEnv* km_env, jclass km_clazz, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle) : -1;
#else
    (void)faxhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxCompleteJobParamsA(JNIEnv* km_env, jclass km_clazz, jlong jobparams, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo) : -1;
#else
    (void)jobparams;
    (void)coverpageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxCompleteJobParamsW(JNIEnv* km_env, jclass km_clazz, jlong jobparams, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxCompleteJobParamsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo) : -1;
#else
    (void)jobparams;
    (void)coverpageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxConnectFaxServerA(JNIEnv* km_env, jclass km_clazz, jlong machinename, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)machinename, (void*)(uintptr_t)faxhandle) : -1;
#else
    (void)machinename;
    (void)faxhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxConnectFaxServerW(JNIEnv* km_env, jclass km_clazz, jlong machinename, jlong faxhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxConnectFaxServerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)machinename, (void*)(uintptr_t)faxhandle) : -1;
#else
    (void)machinename;
    (void)faxhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnableRoutingMethodA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jint enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (int32_t)enabled) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnableRoutingMethodW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jint enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnableRoutingMethodW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (int32_t)enabled) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumGlobalRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo, (void*)(uintptr_t)methodsreturned) : -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumGlobalRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumGlobalRoutingInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo, (void*)(uintptr_t)methodsreturned) : -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    (void)methodsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumJobsA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong jobentry, jlong jobsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)jobentry, (void*)(uintptr_t)jobsreturned) : -1;
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumJobsW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong jobentry, jlong jobsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumJobsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)jobentry, (void*)(uintptr_t)jobsreturned) : -1;
#else
    (void)faxhandle;
    (void)jobentry;
    (void)jobsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumPortsA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong portinfo, jlong portsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)portinfo, (void*)(uintptr_t)portsreturned) : -1;
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumPortsW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong portinfo, jlong portsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumPortsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)portinfo, (void*)(uintptr_t)portsreturned) : -1;
#else
    (void)faxhandle;
    (void)portinfo;
    (void)portsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumRoutingMethodsA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingmethod, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingmethod, (void*)(uintptr_t)methodsreturned) : -1;
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxEnumRoutingMethodsW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingmethod, jlong methodsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxEnumRoutingMethodsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingmethod, (void*)(uintptr_t)methodsreturned) : -1;
#else
    (void)faxporthandle;
    (void)routingmethod;
    (void)methodsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxFreeBuffer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetConfigurationA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig) : -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetConfigurationW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetConfigurationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig) : -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetDeviceStatusA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong devicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)devicestatus) : -1;
#else
    (void)faxporthandle;
    (void)devicestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetDeviceStatusW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong devicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetDeviceStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)devicestatus) : -1;
#else
    (void)faxporthandle;
    (void)devicestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetJobA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)jobentry) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetJobW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetJobW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)jobentry) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)jobentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetLoggingCategoriesA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jlong numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (void*)(uintptr_t)numbercategories) : -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetLoggingCategoriesW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jlong numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetLoggingCategoriesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (void*)(uintptr_t)numbercategories) : -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetPageData(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jlong buffer, jlong buffersize, jlong imagewidth, jlong imageheight) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPageData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)imagewidth, (void*)(uintptr_t)imageheight) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)buffer;
    (void)buffersize;
    (void)imagewidth;
    (void)imageheight;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetPortA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo) : -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetPortW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetPortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo) : -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jlong routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (void*)(uintptr_t)routinginfobuffersize) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxGetRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jlong routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxGetRoutingInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (void*)(uintptr_t)routinginfobuffersize) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxInitializeEventQueue(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong completionport, jlong completionkey, jlong hwnd, jint messagestart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxInitializeEventQueue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)completionport, (uint64_t)completionkey, (void*)(uintptr_t)hwnd, (uint32_t)messagestart) : -1;
#else
    (void)faxhandle;
    (void)completionport;
    (void)completionkey;
    (void)hwnd;
    (void)messagestart;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxOpenPort(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint deviceid, jint flags, jlong faxporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxOpenPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)deviceid, (uint32_t)flags, (void*)(uintptr_t)faxporthandle) : -1;
#else
    (void)faxhandle;
    (void)deviceid;
    (void)flags;
    (void)faxporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxPrintCoverPageA(JNIEnv* km_env, jclass km_clazz, jlong faxcontextinfo, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxcontextinfo, (void*)(uintptr_t)coverpageinfo) : -1;
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxPrintCoverPageW(JNIEnv* km_env, jclass km_clazz, jlong faxcontextinfo, jlong coverpageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxPrintCoverPageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxcontextinfo, (void*)(uintptr_t)coverpageinfo) : -1;
#else
    (void)faxcontextinfo;
    (void)coverpageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxRegisterRoutingExtensionW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong extensionname, jlong friendlyname, jlong imagename, jlong callback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterRoutingExtensionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)extensionname, (void*)(uintptr_t)friendlyname, (void*)(uintptr_t)imagename, (void*)(uintptr_t)callback, (void*)(uintptr_t)context) : -1;
#else
    (void)faxhandle;
    (void)extensionname;
    (void)friendlyname;
    (void)imagename;
    (void)callback;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxRegisterServiceProviderW(JNIEnv* km_env, jclass km_clazz, jlong deviceprovider, jlong friendlyname, jlong imagename, jlong tspname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxRegisterServiceProviderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceprovider, (void*)(uintptr_t)friendlyname, (void*)(uintptr_t)imagename, (void*)(uintptr_t)tspname) : -1;
#else
    (void)deviceprovider;
    (void)friendlyname;
    (void)imagename;
    (void)tspname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSendDocumentA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong jobparams, jlong coverpageinfo, jlong faxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo, (void*)(uintptr_t)faxjobid) : -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSendDocumentForBroadcastA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong faxjobid, jlong faxrecipientcallback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxrecipientcallback, (void*)(uintptr_t)context) : -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSendDocumentForBroadcastW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong faxjobid, jlong faxrecipientcallback, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentForBroadcastW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxrecipientcallback, (void*)(uintptr_t)context) : -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)faxjobid;
    (void)faxrecipientcallback;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSendDocumentW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong filename, jlong jobparams, jlong coverpageinfo, jlong faxjobid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSendDocumentW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)filename, (void*)(uintptr_t)jobparams, (void*)(uintptr_t)coverpageinfo, (void*)(uintptr_t)faxjobid) : -1;
#else
    (void)faxhandle;
    (void)filename;
    (void)jobparams;
    (void)coverpageinfo;
    (void)faxjobid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetConfigurationA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig) : -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetConfigurationW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong faxconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetConfigurationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)faxconfig) : -1;
#else
    (void)faxhandle;
    (void)faxconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetGlobalRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo) : -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetGlobalRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong routinginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetGlobalRoutingInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)routinginfo) : -1;
#else
    (void)faxhandle;
    (void)routinginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetJobA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jint command, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (uint32_t)command, (void*)(uintptr_t)jobentry) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetJobW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jint jobid, jint command, jlong jobentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetJobW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (uint32_t)jobid, (uint32_t)command, (void*)(uintptr_t)jobentry) : -1;
#else
    (void)faxhandle;
    (void)jobid;
    (void)command;
    (void)jobentry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetLoggingCategoriesA(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jint numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (uint32_t)numbercategories) : -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetLoggingCategoriesW(JNIEnv* km_env, jclass km_clazz, jlong faxhandle, jlong categories, jint numbercategories) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetLoggingCategoriesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxhandle, (void*)(uintptr_t)categories, (uint32_t)numbercategories) : -1;
#else
    (void)faxhandle;
    (void)categories;
    (void)numbercategories;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetPortA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo) : -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetPortW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong portinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetPortW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)portinfo) : -1;
#else
    (void)faxporthandle;
    (void)portinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetRoutingInfoA(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jint routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (uint32_t)routinginfobuffersize) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxSetRoutingInfoW(JNIEnv* km_env, jclass km_clazz, jlong faxporthandle, jlong routingguid, jlong routinginfobuffer, jint routinginfobuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxSetRoutingInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)faxporthandle, (void*)(uintptr_t)routingguid, (void*)(uintptr_t)routinginfobuffer, (uint32_t)routinginfobuffersize) : -1;
#else
    (void)faxporthandle;
    (void)routingguid;
    (void)routinginfobuffer;
    (void)routinginfobuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxStartPrintJobA(JNIEnv* km_env, jclass km_clazz, jlong printername, jlong printinfo, jlong faxjobid, jlong faxcontextinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)printername, (void*)(uintptr_t)printinfo, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxcontextinfo) : -1;
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxStartPrintJobW(JNIEnv* km_env, jclass km_clazz, jlong printername, jlong printinfo, jlong faxjobid, jlong faxcontextinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxStartPrintJobW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)printername, (void*)(uintptr_t)printinfo, (void*)(uintptr_t)faxjobid, (void*)(uintptr_t)faxcontextinfo) : -1;
#else
    (void)printername;
    (void)printinfo;
    (void)faxjobid;
    (void)faxcontextinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1FaxUnregisterServiceProviderW(JNIEnv* km_env, jclass km_clazz, jlong deviceprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winfax.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FaxUnregisterServiceProviderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceprovider) : -1;
#else
    (void)deviceprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1SendToFaxRecipient(JNIEnv* km_env, jclass km_clazz, jint sndmode, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("fxsutility.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendToFaxRecipient");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)sndmode, (void*)(uintptr_t)lpfilename) : 0;
#else
    (void)sndmode;
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_fax_WindowsWin32DevicesFaxJniBridge_windowssys_1windows_1win32_1devices_1fax_1StiCreateInstanceW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint dwver, jlong ppsti, jlong punkouter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sti.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StiCreateInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (uint32_t)dwver, (void*)(uintptr_t)ppsti, (void*)(uintptr_t)punkouter) : -1;
#else
    (void)hinst;
    (void)dwver;
    (void)ppsti;
    (void)punkouter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

