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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDCancelOpenSession(JNIEnv* km_env, jclass km_clazz, jlong hsessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCancelOpenSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionhandle) : 0;
#else
    (void)hsessionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCloseHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle) : 0;
#else
    (void)hclienthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDCloseSession(JNIEnv* km_env, jclass km_clazz, jlong hsessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDCloseSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionhandle) : 0;
#else
    (void)hsessionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDOpenHandle(JNIEnv* km_env, jclass km_clazz, jint dwclientversion, jlong pdwnegotiatedversion, jlong phclienthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDOpenHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwclientversion, (void*)(uintptr_t)pdwnegotiatedversion, (void*)(uintptr_t)phclienthandle) : 0;
#else
    (void)dwclientversion;
    (void)pdwnegotiatedversion;
    (void)phclienthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDOpenLegacySession(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong plegacymacaddress, jlong phsessionhandle, jlong pguidsessioninterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDOpenLegacySession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)plegacymacaddress, (void*)(uintptr_t)phsessionhandle, (void*)(uintptr_t)pguidsessioninterface) : 0;
#else
    (void)hclienthandle;
    (void)plegacymacaddress;
    (void)phsessionhandle;
    (void)pguidsessioninterface;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDStartOpenSession(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pdeviceaddress, jlong pvcontext, jlong pfncallback, jlong phsessionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDStartOpenSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pdeviceaddress, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)phsessionhandle) : 0;
#else
    (void)hclienthandle;
    (void)pdeviceaddress;
    (void)pvcontext;
    (void)pfncallback;
    (void)phsessionhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WFDUpdateDeviceVisibility(JNIEnv* km_env, jclass km_clazz, jlong pdeviceaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WFDUpdateDeviceVisibility");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdeviceaddress) : 0;
#else
    (void)pdeviceaddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanAllocateMemory(JNIEnv* km_env, jclass km_clazz, jint dwmemorysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanAllocateMemory");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwmemorysize) : NULL;
#else
    (void)dwmemorysize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanCloseHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanConnect(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong pconnectionparameters, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)pconnectionparameters, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pconnectionparameters;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanConnect2(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong pconnectionparameters, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanConnect2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)pconnectionparameters, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pconnectionparameters;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanDeleteProfile(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDeleteProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanDeviceServiceCommand(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong pdeviceserviceguid, jint dwopcode, jint dwinbuffersize, jlong pinbuffer, jint dwoutbuffersize, jlong poutbuffer, jlong pdwbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDeviceServiceCommand");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)pdeviceserviceguid, (uint32_t)dwopcode, (uint32_t)dwinbuffersize, (void*)(uintptr_t)pinbuffer, (uint32_t)dwoutbuffersize, (void*)(uintptr_t)poutbuffer, (void*)(uintptr_t)pdwbytesreturned) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdeviceserviceguid;
    (void)dwopcode;
    (void)dwinbuffersize;
    (void)pinbuffer;
    (void)dwoutbuffersize;
    (void)poutbuffer;
    (void)pdwbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanDisconnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanEnumInterfaces(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong preserved, jlong ppinterfacelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanEnumInterfaces");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppinterfacelist) : 0;
#else
    (void)hclienthandle;
    (void)preserved;
    (void)ppinterfacelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanExtractPsdIEDataList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint dwiedatasize, jlong prawiedata, jlong strformat, jlong preserved, jlong pppsdiedatalist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanExtractPsdIEDataList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (uint32_t)dwiedatasize, (void*)(uintptr_t)prawiedata, (void*)(uintptr_t)strformat, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pppsdiedatalist) : 0;
#else
    (void)hclienthandle;
    (void)dwiedatasize;
    (void)prawiedata;
    (void)strformat;
    (void)preserved;
    (void)pppsdiedatalist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanFreeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmemory);
#else
    (void)pmemory;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetAvailableNetworkList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint dwflags, jlong preserved, jlong ppavailablenetworklist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetAvailableNetworkList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (uint32_t)dwflags, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppavailablenetworklist) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)preserved;
    (void)ppavailablenetworklist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetAvailableNetworkList2(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint dwflags, jlong preserved, jlong ppavailablenetworklist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetAvailableNetworkList2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (uint32_t)dwflags, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppavailablenetworklist) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)preserved;
    (void)ppavailablenetworklist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetFilterList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint wlanfilterlisttype, jlong preserved, jlong ppnetworklist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetFilterList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)wlanfilterlisttype, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppnetworklist) : 0;
#else
    (void)hclienthandle;
    (void)wlanfilterlisttype;
    (void)preserved;
    (void)ppnetworklist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetInterfaceCapability(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong preserved, jlong ppcapability) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetInterfaceCapability");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppcapability) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    (void)ppcapability;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetNetworkBssList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong pdot11ssid, jint dot11bsstype, jint bsecurityenabled, jlong preserved, jlong ppwlanbsslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetNetworkBssList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)pdot11ssid, (int32_t)dot11bsstype, (int32_t)bsecurityenabled, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppwlanbsslist) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdot11ssid;
    (void)dot11bsstype;
    (void)bsecurityenabled;
    (void)preserved;
    (void)ppwlanbsslist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetProfile(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jlong preserved, jlong pstrprofilexml, jlong pdwflags, jlong pdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pstrprofilexml, (void*)(uintptr_t)pdwflags, (void*)(uintptr_t)pdwgrantedaccess) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    (void)pstrprofilexml;
    (void)pdwflags;
    (void)pdwgrantedaccess;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetProfileCustomUserData(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jlong preserved, jlong pdwdatasize, jlong ppdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfileCustomUserData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwdatasize, (void*)(uintptr_t)ppdata) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetProfileList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong preserved, jlong ppprofilelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetProfileList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)preserved, (void*)(uintptr_t)ppprofilelist) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)preserved;
    (void)ppprofilelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetSecuritySettings(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint securableobject, jlong pvaluetype, jlong pstrcurrentsddl, jlong pdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetSecuritySettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)securableobject, (void*)(uintptr_t)pvaluetype, (void*)(uintptr_t)pstrcurrentsddl, (void*)(uintptr_t)pdwgrantedaccess) : 0;
#else
    (void)hclienthandle;
    (void)securableobject;
    (void)pvaluetype;
    (void)pstrcurrentsddl;
    (void)pdwgrantedaccess;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanGetSupportedDeviceServices(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong ppdevsvcguidlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanGetSupportedDeviceServices");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)ppdevsvcguidlist) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)ppdevsvcguidlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkForceStart(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkForceStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkForceStop(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkForceStop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkInitSettings(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkInitSettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkQueryProperty(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint opcode, jlong pdwdatasize, jlong ppvdata, jlong pwlanopcodevaluetype, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQueryProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)opcode, (void*)(uintptr_t)pdwdatasize, (void*)(uintptr_t)ppvdata, (void*)(uintptr_t)pwlanopcodevaluetype, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)pdwdatasize;
    (void)ppvdata;
    (void)pwlanopcodevaluetype;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkQuerySecondaryKey(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pdwkeylength, jlong ppuckeydata, jlong pbispassphrase, jlong pbpersistent, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQuerySecondaryKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pdwkeylength, (void*)(uintptr_t)ppuckeydata, (void*)(uintptr_t)pbispassphrase, (void*)(uintptr_t)pbpersistent, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pdwkeylength;
    (void)ppuckeydata;
    (void)pbispassphrase;
    (void)pbpersistent;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkQueryStatus(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong ppwlanhostednetworkstatus, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkQueryStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)ppwlanhostednetworkstatus, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)ppwlanhostednetworkstatus;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkRefreshSecuritySettings(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkRefreshSecuritySettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkSetProperty(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint opcode, jint dwdatasize, jlong pvdata, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkSetProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)opcode, (uint32_t)dwdatasize, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)dwdatasize;
    (void)pvdata;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkSetSecondaryKey(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint dwkeylength, jlong puckeydata, jint bispassphrase, jint bpersistent, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkSetSecondaryKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (uint32_t)dwkeylength, (void*)(uintptr_t)puckeydata, (int32_t)bispassphrase, (int32_t)bpersistent, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)dwkeylength;
    (void)puckeydata;
    (void)bispassphrase;
    (void)bpersistent;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkStartUsing(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkStartUsing");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanHostedNetworkStopUsing(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pfailreason, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanHostedNetworkStopUsing");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pfailreason, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)hclienthandle;
    (void)pfailreason;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanIhvControl(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint type, jint dwinbuffersize, jlong pinbuffer, jint dwoutbuffersize, jlong poutbuffer, jlong pdwbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanIhvControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (int32_t)type, (uint32_t)dwinbuffersize, (void*)(uintptr_t)pinbuffer, (uint32_t)dwoutbuffersize, (void*)(uintptr_t)poutbuffer, (void*)(uintptr_t)pdwbytesreturned) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)type;
    (void)dwinbuffersize;
    (void)pinbuffer;
    (void)dwoutbuffersize;
    (void)poutbuffer;
    (void)pdwbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanOpenHandle(JNIEnv* km_env, jclass km_clazz, jint dwclientversion, jlong preserved, jlong pdwnegotiatedversion, jlong phclienthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanOpenHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwclientversion, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwnegotiatedversion, (void*)(uintptr_t)phclienthandle) : 0;
#else
    (void)dwclientversion;
    (void)preserved;
    (void)pdwnegotiatedversion;
    (void)phclienthandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanQueryAutoConfigParameter(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint opcode, jlong preserved, jlong pdwdatasize, jlong ppdata, jlong pwlanopcodevaluetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanQueryAutoConfigParameter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)opcode, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwdatasize, (void*)(uintptr_t)ppdata, (void*)(uintptr_t)pwlanopcodevaluetype) : 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    (void)pwlanopcodevaluetype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanQueryInterface(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint opcode, jlong preserved, jlong pdwdatasize, jlong ppdata, jlong pwlanopcodevaluetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanQueryInterface");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (int32_t)opcode, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwdatasize, (void*)(uintptr_t)ppdata, (void*)(uintptr_t)pwlanopcodevaluetype) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)opcode;
    (void)preserved;
    (void)pdwdatasize;
    (void)ppdata;
    (void)pwlanopcodevaluetype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanReasonCodeToString(JNIEnv* km_env, jclass km_clazz, jint dwreasoncode, jint dwbuffersize, jlong pstringbuffer, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanReasonCodeToString");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreasoncode, (uint32_t)dwbuffersize, (void*)(uintptr_t)pstringbuffer, (void*)(uintptr_t)preserved) : 0;
#else
    (void)dwreasoncode;
    (void)dwbuffersize;
    (void)pstringbuffer;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanRegisterDeviceServiceNotification(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pdevsvcguidlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterDeviceServiceNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pdevsvcguidlist) : 0;
#else
    (void)hclienthandle;
    (void)pdevsvcguidlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanRegisterNotification(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint dwnotifsource, jint bignoreduplicate, jlong funccallback, jlong pcallbackcontext, jlong preserved, jlong pdwprevnotifsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (uint32_t)dwnotifsource, (int32_t)bignoreduplicate, (void*)(uintptr_t)funccallback, (void*)(uintptr_t)pcallbackcontext, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwprevnotifsource) : 0;
#else
    (void)hclienthandle;
    (void)dwnotifsource;
    (void)bignoreduplicate;
    (void)funccallback;
    (void)pcallbackcontext;
    (void)preserved;
    (void)pdwprevnotifsource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanRegisterVirtualStationNotification(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint bregister, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRegisterVirtualStationNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)bregister, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)bregister;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanRenameProfile(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong stroldprofilename, jlong strnewprofilename, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanRenameProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)stroldprofilename, (void*)(uintptr_t)strnewprofilename, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)stroldprofilename;
    (void)strnewprofilename;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSaveTemporaryProfile(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jlong stralluserprofilesecurity, jint dwflags, jint boverwrite, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSaveTemporaryProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (void*)(uintptr_t)stralluserprofilesecurity, (uint32_t)dwflags, (int32_t)boverwrite, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)stralluserprofilesecurity;
    (void)dwflags;
    (void)boverwrite;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanScan(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong pdot11ssid, jlong piedata, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanScan");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)pdot11ssid, (void*)(uintptr_t)piedata, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)pdot11ssid;
    (void)piedata;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetAutoConfigParameter(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint opcode, jint dwdatasize, jlong pdata, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetAutoConfigParameter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)opcode, (uint32_t)dwdatasize, (void*)(uintptr_t)pdata, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)opcode;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetFilterList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint wlanfilterlisttype, jlong pnetworklist, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetFilterList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)wlanfilterlisttype, (void*)(uintptr_t)pnetworklist, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)wlanfilterlisttype;
    (void)pnetworklist;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetInterface(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint opcode, jint dwdatasize, jlong pdata, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetInterface");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (int32_t)opcode, (uint32_t)dwdatasize, (void*)(uintptr_t)pdata, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)opcode;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetProfile(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint dwflags, jlong strprofilexml, jlong stralluserprofilesecurity, jint boverwrite, jlong preserved, jlong pdwreasoncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (uint32_t)dwflags, (void*)(uintptr_t)strprofilexml, (void*)(uintptr_t)stralluserprofilesecurity, (int32_t)boverwrite, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pdwreasoncode) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwflags;
    (void)strprofilexml;
    (void)stralluserprofilesecurity;
    (void)boverwrite;
    (void)preserved;
    (void)pdwreasoncode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetProfileCustomUserData(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jint dwdatasize, jlong pdata, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileCustomUserData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (uint32_t)dwdatasize, (void*)(uintptr_t)pdata, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwdatasize;
    (void)pdata;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetProfileEapXmlUserData(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jint dwflags, jlong streapxmluserdata, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileEapXmlUserData");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (uint32_t)dwflags, (void*)(uintptr_t)streapxmluserdata, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwflags;
    (void)streapxmluserdata;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetProfileList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jint dwitems, jlong strprofilenames, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfileList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (uint32_t)dwitems, (void*)(uintptr_t)strprofilenames, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)dwitems;
    (void)strprofilenames;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetProfilePosition(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong pinterfaceguid, jlong strprofilename, jint dwposition, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetProfilePosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)strprofilename, (uint32_t)dwposition, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)pinterfaceguid;
    (void)strprofilename;
    (void)dwposition;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetPsdIEDataList(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jlong strformat, jlong ppsdiedatalist, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetPsdIEDataList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (void*)(uintptr_t)strformat, (void*)(uintptr_t)ppsdiedatalist, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hclienthandle;
    (void)strformat;
    (void)ppsdiedatalist;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanSetSecuritySettings(JNIEnv* km_env, jclass km_clazz, jlong hclienthandle, jint securableobject, jlong strmodifiedsddl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanSetSecuritySettings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclienthandle, (int32_t)securableobject, (void*)(uintptr_t)strmodifiedsddl) : 0;
#else
    (void)hclienthandle;
    (void)securableobject;
    (void)strmodifiedsddl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_wifi_WindowsWin32NetworkmanagementWifiJniBridge_windowssys_1windows_1win32_1networkmanagement_1wifi_1WlanUIEditProfile(JNIEnv* km_env, jclass km_clazz, jint dwclientversion, jlong wstrprofilename, jlong pinterfaceguid, jlong hwnd, jint wlstartpage, jlong preserved, jlong pwlanreasoncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wlanui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WlanUIEditProfile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwclientversion, (void*)(uintptr_t)wstrprofilename, (void*)(uintptr_t)pinterfaceguid, (void*)(uintptr_t)hwnd, (int32_t)wlstartpage, (void*)(uintptr_t)preserved, (void*)(uintptr_t)pwlanreasoncode) : 0;
#else
    (void)dwclientversion;
    (void)wstrprofilename;
    (void)pinterfaceguid;
    (void)hwnd;
    (void)wlstartpage;
    (void)preserved;
    (void)pwlanreasoncode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

