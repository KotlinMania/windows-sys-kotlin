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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDAllocateLinkedMemory(JNIEnv* km_env, jclass km_clazz, jlong pparent, jlong cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDAllocateLinkedMemory");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pparent, (uint64_t)cbsize) : NULL;
#else
    (void)pparent;
    (void)cbsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDAttachLinkedMemory(JNIEnv* km_env, jclass km_clazz, jlong pparent, jlong pchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDAttachLinkedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pparent, (void*)(uintptr_t)pchild);
#else
    (void)pparent;
    (void)pchild;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceHost(JNIEnv* km_env, jclass km_clazz, jlong pszlocalid, jlong pcontext, jlong ppdevicehost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHost");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceHost2(JNIEnv* km_env, jclass km_clazz, jlong pszlocalid, jlong pcontext, jlong pconfigparams, jint dwconfigparamcount, jlong ppdevicehost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHost2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)pconfigparams, (uint32_t)dwconfigparamcount, (void*)(uintptr_t)ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceHostAdvanced(JNIEnv* km_env, jclass km_clazz, jlong pszlocalid, jlong pcontext, jlong pphostaddresses, jint dwhostaddresscount, jlong ppdevicehost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceHostAdvanced");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)pphostaddresses, (uint32_t)dwhostaddresscount, (void*)(uintptr_t)ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pphostaddresses;
    (void)dwhostaddresscount;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceProxy(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceid, jlong pszlocalid, jlong pcontext, jlong ppdeviceproxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdeviceid, (void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceProxy2(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceid, jlong pszlocalid, jlong pcontext, jlong pconfigparams, jint dwconfigparamcount, jlong ppdeviceproxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxy2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdeviceid, (void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)pconfigparams, (uint32_t)dwconfigparamcount, (void*)(uintptr_t)ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDeviceProxyAdvanced(JNIEnv* km_env, jclass km_clazz, jlong pszdeviceid, jlong pdeviceaddress, jlong pszlocalid, jlong pcontext, jlong ppdeviceproxy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDeviceProxyAdvanced");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdeviceid, (void*)(uintptr_t)pdeviceaddress, (void*)(uintptr_t)pszlocalid, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pdeviceaddress;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDiscoveryProvider(JNIEnv* km_env, jclass km_clazz, jlong pcontext, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontext, (void*)(uintptr_t)ppprovider) : -1;
#else
    (void)pcontext;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDiscoveryProvider2(JNIEnv* km_env, jclass km_clazz, jlong pcontext, jlong pconfigparams, jint dwconfigparamcount, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontext, (void*)(uintptr_t)pconfigparams, (uint32_t)dwconfigparamcount, (void*)(uintptr_t)ppprovider) : -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDiscoveryPublisher(JNIEnv* km_env, jclass km_clazz, jlong pcontext, jlong pppublisher) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontext, (void*)(uintptr_t)pppublisher) : -1;
#else
    (void)pcontext;
    (void)pppublisher;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateDiscoveryPublisher2(JNIEnv* km_env, jclass km_clazz, jlong pcontext, jlong pconfigparams, jint dwconfigparamcount, jlong pppublisher) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontext, (void*)(uintptr_t)pconfigparams, (uint32_t)dwconfigparamcount, (void*)(uintptr_t)pppublisher) : -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)pppublisher;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateHttpAddress(JNIEnv* km_env, jclass km_clazz, jlong ppaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateHttpAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppaddress) : -1;
#else
    (void)ppaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateHttpMessageParameters(JNIEnv* km_env, jclass km_clazz, jlong pptxparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateHttpMessageParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pptxparams) : -1;
#else
    (void)pptxparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateOutboundAttachment(JNIEnv* km_env, jclass km_clazz, jlong ppattachment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateOutboundAttachment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppattachment) : -1;
#else
    (void)ppattachment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateUdpAddress(JNIEnv* km_env, jclass km_clazz, jlong ppaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateUdpAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppaddress) : -1;
#else
    (void)ppaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDCreateUdpMessageParameters(JNIEnv* km_env, jclass km_clazz, jlong pptxparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDCreateUdpMessageParameters");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pptxparams) : -1;
#else
    (void)pptxparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDDetachLinkedMemory(JNIEnv* km_env, jclass km_clazz, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDDetachLinkedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvoid);
#else
    (void)pvoid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDFreeLinkedMemory(JNIEnv* km_env, jclass km_clazz, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDFreeLinkedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvoid);
#else
    (void)pvoid;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDGenerateFault(JNIEnv* km_env, jclass km_clazz, jlong pszcode, jlong pszsubcode, jlong pszreason, jlong pszdetail, jlong pcontext, jlong ppfault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGenerateFault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszcode, (void*)(uintptr_t)pszsubcode, (void*)(uintptr_t)pszreason, (void*)(uintptr_t)pszdetail, (void*)(uintptr_t)pcontext, (void*)(uintptr_t)ppfault) : -1;
#else
    (void)pszcode;
    (void)pszsubcode;
    (void)pszreason;
    (void)pszdetail;
    (void)pcontext;
    (void)ppfault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDGenerateFaultEx(JNIEnv* km_env, jclass km_clazz, jlong pcode, jlong psubcode, jlong preasons, jlong pszdetail, jlong ppfault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGenerateFaultEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcode, (void*)(uintptr_t)psubcode, (void*)(uintptr_t)preasons, (void*)(uintptr_t)pszdetail, (void*)(uintptr_t)ppfault) : -1;
#else
    (void)pcode;
    (void)psubcode;
    (void)preasons;
    (void)pszdetail;
    (void)ppfault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDGetConfigurationOption(JNIEnv* km_env, jclass km_clazz, jint dwoption, jlong pvoid, jint cboutbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDGetConfigurationOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwoption, (void*)(uintptr_t)pvoid, (uint32_t)cboutbuffer) : -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cboutbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDSetConfigurationOption(JNIEnv* km_env, jclass km_clazz, jint dwoption, jlong pvoid, jint cbinbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDSetConfigurationOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwoption, (void*)(uintptr_t)pvoid, (uint32_t)cbinbuffer) : -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cbinbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDUriDecode(JNIEnv* km_env, jclass km_clazz, jlong source, jint cchsource, jlong destout, jlong cchdestout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDUriDecode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (uint32_t)cchsource, (void*)(uintptr_t)destout, (void*)(uintptr_t)cchdestout) : -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDUriEncode(JNIEnv* km_env, jclass km_clazz, jlong source, jint cchsource, jlong destout, jlong cchdestout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDUriEncode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (uint32_t)cchsource, (void*)(uintptr_t)destout, (void*)(uintptr_t)cchdestout) : -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLAddChild(JNIEnv* km_env, jclass km_clazz, jlong pparent, jlong pchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLAddChild");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pparent, (void*)(uintptr_t)pchild) : -1;
#else
    (void)pparent;
    (void)pchild;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLAddSibling(JNIEnv* km_env, jclass km_clazz, jlong pfirst, jlong psecond) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLAddSibling");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfirst, (void*)(uintptr_t)psecond) : -1;
#else
    (void)pfirst;
    (void)psecond;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLBuildAnyForSingleElement(JNIEnv* km_env, jclass km_clazz, jlong pelementname, jlong psztext, jlong ppany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLBuildAnyForSingleElement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pelementname, (void*)(uintptr_t)psztext, (void*)(uintptr_t)ppany) : -1;
#else
    (void)pelementname;
    (void)psztext;
    (void)ppany;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLCleanupElement(JNIEnv* km_env, jclass km_clazz, jlong pany) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLCleanupElement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pany) : -1;
#else
    (void)pany;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLCreateContext(JNIEnv* km_env, jclass km_clazz, jlong ppcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLCreateContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppcontext) : -1;
#else
    (void)ppcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLGetNameFromBuiltinNamespace(JNIEnv* km_env, jclass km_clazz, jlong psznamespace, jlong pszname, jlong ppname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLGetNameFromBuiltinNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psznamespace, (void*)(uintptr_t)pszname, (void*)(uintptr_t)ppname) : -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)ppname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_webservicesondevices_WindowsWin32DevicesWebservicesondevicesJniBridge_windowssys_1windows_1win32_1devices_1webservicesondevices_1WSDXMLGetValueFromAny(JNIEnv* km_env, jclass km_clazz, jlong psznamespace, jlong pszname, jlong pany, jlong ppszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSDXMLGetValueFromAny");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psznamespace, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pany, (void*)(uintptr_t)ppszvalue) : -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)pany;
    (void)ppszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

