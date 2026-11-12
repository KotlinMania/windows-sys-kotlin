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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock, jboolean fwrite, jlong lockstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAcquireReadWriteLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lock, (bool)fwrite, (void*)(uintptr_t)lockstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    (void)fwrite;
    (void)lockstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jint length, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAllocateMemoryWithTag");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint32_t)length, (uint32_t)tag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)virtualaddress;
    (void)length;
    (void)tag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timercancelled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCancelTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timercancelled);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong protocolpartycontext, jlong callparameters, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClAddParty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)protocolpartycontext, (void*)(uintptr_t)callparameters, (void*)(uintptr_t)ndispartyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)protocolpartycontext;
    (void)callparameters;
    (void)ndispartyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(JNIEnv* km_env, jclass km_clazz, jlong ndisafhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseAddressFamily");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisafhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisafhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(JNIEnv* km_env, jclass km_clazz, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDeregisterSap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndissaphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndissaphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(JNIEnv* km_env, jclass km_clazz, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDropParty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClIncomingCallComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters, jlong protocolpartycontext, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClMakeCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters, (void*)(uintptr_t)protocolpartycontext, (void*)(uintptr_t)ndispartyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    (void)protocolpartycontext;
    (void)ndispartyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClModifyCallQoS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(JNIEnv* km_env, jclass km_clazz, jlong ndisafhandle, jlong protocolsapcontext, jlong sap, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClRegisterSap");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)protocolsapcontext, (void*)(uintptr_t)sap, (void*)(uintptr_t)ndissaphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisafhandle;
    (void)protocolsapcontext;
    (void)sap;
    (void)ndissaphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(JNIEnv* km_env, jclass km_clazz, jlong configurationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseConfiguration");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)configurationhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)configurationhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmActivateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndispartyhandle, jlong callmgrpartycontext, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmAddPartyComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)callmgrpartycontext, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisafhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseAddressFamilyComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisafhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisafhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseCallComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeactivateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeregisterSapComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndissaphandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndissaphandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchCallConnected");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(JNIEnv* km_env, jclass km_clazz, jlong ndissaphandle, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndissaphandle, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndissaphandle;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCallQoSChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(JNIEnv* km_env, jclass km_clazz, jint closestatus, jlong ndisvchandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCloseCall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)closestatus, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)buffer, (uint32_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)closestatus;
    (void)ndisvchandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(JNIEnv* km_env, jclass km_clazz, jint dropstatus, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingDropParty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)dropstatus, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dropstatus;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDropPartyComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndispartyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong ndispartyhandle, jlong callmgrpartycontext, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmMakeCallComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)callmgrpartycontext, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmModifyCallQoSComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisafhandle, jlong callmgrafcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmOpenAddressFamilyComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)callmgrafcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisafhandle;
    (void)callmgrafcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndissaphandle, jlong callmgrsapcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmRegisterSapComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndissaphandle, (void*)(uintptr_t)callmgrsapcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndissaphandle;
    (void)callmgrsapcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong baseinstancename, jlong vcinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoAssignInstanceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)baseinstancename, (void*)(uintptr_t)vcinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)baseinstancename;
    (void)vcinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisbindinghandle, jlong ndisafhandle, jlong protocolvccontext, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoCreateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisbindinghandle, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)protocolvccontext, (void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisbindinghandle;
    (void)ndisafhandle;
    (void)protocolvccontext;
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoDeleteVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong tapicallid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoGetTapiCallId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)tapicallid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)tapicallid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong ndisdmahandle, jlong buffer, jint offset, jint length, jboolean writetodevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCompleteDmaTransfer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)ndisdmahandle, (void*)(uintptr_t)buffer, (uint32_t)offset, (uint32_t)length, (bool)writetodevice);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong buffer, jlong poolhandle, jlong memorydescriptor, jint offset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCopyBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)buffer, (void*)(uintptr_t)poolhandle, (void*)(uintptr_t)memorydescriptor, (uint32_t)offset, (uint32_t)length);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)buffer;
    (void)poolhandle;
    (void)memorydescriptor;
    (void)offset;
    (void)length;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisDeregisterTdiCallBack");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jint length, jint memoryflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisFreeMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint32_t)length, (uint32_t)memoryflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)virtualaddress;
    (void)length;
    (void)memoryflags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGeneratePartialCancelId");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(JNIEnv* km_env, jclass km_clazz, jlong pidlecount, jlong pkernelanduser, jlong pindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCounts");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pidlecount, (void*)(uintptr_t)pkernelanduser, (void*)(uintptr_t)pindex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pidlecount;
    (void)pkernelanduser;
    (void)pindex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(JNIEnv* km_env, jclass km_clazz, jlong pcpuusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCpuUsage");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcpuusage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcpuusage;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(JNIEnv* km_env, jclass km_clazz, jlong ndisroutinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetRoutineAddress");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisroutinename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ndisroutinename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetSharedDataAlignment");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetVersion");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong protocolhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMAssociateMiniport");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)protocolhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)driverhandle;
    (void)protocolhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong deviceinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMCancelInitializeDeviceInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)deviceinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverhandle;
    (void)deviceinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong ndisminiporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMDeInitializeDeviceInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisminiporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisminiporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(JNIEnv* km_env, jclass km_clazz, jlong ndisbindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMGetBindingContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisbindinghandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ndisbindinghandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong driverinstance, jlong devicecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMInitializeDeviceInstanceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)driverinstance, (void*)(uintptr_t)devicecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverhandle;
    (void)driverinstance;
    (void)devicecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeEvent");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeReadWriteLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeString");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)destination, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
    }
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timerfunction, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timerfunction, (void*)(uintptr_t)functioncontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timerfunction;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)physicaladdress);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemoryAsync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timercancelled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCancelTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timercancelled);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(JNIEnv* km_env, jclass km_clazz, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCloseLog");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)loghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmActivateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong ndisafhandle, jlong miniportvccontext, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmCreateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)miniportvccontext, (void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniportadapterhandle;
    (void)ndisafhandle;
    (void)miniportvccontext;
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeactivateVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeleteVc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong addressfamily, jlong cmcharacteristics, jint sizeofcmcharacteristics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmRegisterAddressFamily");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)addressfamily, (void*)(uintptr_t)cmcharacteristics, (uint32_t)sizeofcmcharacteristics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniportadapterhandle;
    (void)addressfamily;
    (void)cmcharacteristics;
    (void)sizeofcmcharacteristics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoActivateVcComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoDeactivateVcComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint size, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCreateLog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)size, (void*)(uintptr_t)loghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniportadapterhandle;
    (void)size;
    (void)loghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterDmaChannel");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportdmahandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint initialport, jint numberofports, jlong portoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterIoPortRange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)initialport, (uint32_t)numberofports, (void*)(uintptr_t)portoffset);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    (void)portoffset;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(JNIEnv* km_env, jclass km_clazz, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFlushLog");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)loghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFreeSharedMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)virtualaddress, (int64_t)physicaladdress);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong physicaldeviceobject, jlong functionaldeviceobject, jlong nextdeviceobject, jlong allocatedresources, jlong allocatedresourcestranslated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDeviceProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)physicaldeviceobject, (void*)(uintptr_t)functionaldeviceobject, (void*)(uintptr_t)nextdeviceobject, (void*)(uintptr_t)allocatedresources, (void*)(uintptr_t)allocatedresourcestranslated);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)physicaldeviceobject;
    (void)functionaldeviceobject;
    (void)nextdeviceobject;
    (void)allocatedresources;
    (void)allocatedresourcestranslated;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDmaAlignment");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportadapterhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)miniportadapterhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong miniportadapterhandle, jlong timerfunction, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMInitializeTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)timerfunction, (void*)(uintptr_t)functioncontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)miniportadapterhandle;
    (void)timerfunction;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong miniportadapterhandle, jlong physicaladdress, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMMapIoSpace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)miniportadapterhandle, (int64_t)physicaladdress, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)virtualaddress;
    (void)miniportadapterhandle;
    (void)physicaladdress;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong miniporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMQueryAdapterInstanceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)miniporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)padapterinstancename;
    (void)miniporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMReadDmaCounter");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportdmahandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle, jlong miniportadapterhandle, jint dmachannel, jboolean dma32bitaddresses, jlong dmadescription, jint maximumlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterDmaChannel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniportdmahandle, (void*)(uintptr_t)miniportadapterhandle, (uint32_t)dmachannel, (bool)dma32bitaddresses, (void*)(uintptr_t)dmadescription, (uint32_t)maximumlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniportdmahandle;
    (void)miniportadapterhandle;
    (void)dmachannel;
    (void)dma32bitaddresses;
    (void)dmadescription;
    (void)maximumlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(JNIEnv* km_env, jclass km_clazz, jlong portoffset, jlong miniportadapterhandle, jint initialport, jint numberofports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterIoPortRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)portoffset, (void*)(uintptr_t)miniportadapterhandle, (uint32_t)initialport, (uint32_t)numberofports);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)portoffset;
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(JNIEnv* km_env, jclass km_clazz, jlong miniporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRemoveMiniport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)miniporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jint millisecondperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSetPeriodicTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (uint32_t)millisecondperiod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)millisecondperiod;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(JNIEnv* km_env, jclass km_clazz, jint microsecondstosleep) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSleep");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)microsecondstosleep);
    } else {
        errno = ENOSYS;
    }
#else
    (void)microsecondstosleep;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong virtualaddress, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMUnmapIoSpace");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)virtualaddress, (uint32_t)length);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)virtualaddress;
    (void)length;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jlong logbuffer, jint logbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMWriteLogData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loghandle, (void*)(uintptr_t)logbuffer, (uint32_t)logbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loghandle;
    (void)logbuffer;
    (void)logbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(JNIEnv* km_env, jclass km_clazz, jlong status, jlong mappedbuffer, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMapFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)mappedbuffer, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)mappedbuffer;
    (void)filehandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jint arg2Index, jlong keyname, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByIndex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (uint32_t)arg2Index, (void*)(uintptr_t)keyname, (void*)(uintptr_t)keyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)configurationhandle;
    (void)arg2Index;
    (void)keyname;
    (void)keyhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jlong subkeyname, jlong subkeyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByName");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)subkeyname, (void*)(uintptr_t)subkeyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)configurationhandle;
    (void)subkeyname;
    (void)subkeyhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(JNIEnv* km_env, jclass km_clazz, jlong status, jlong filehandle, jlong filelength, jlong filename, jlong highestacceptableaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)filelength, (void*)(uintptr_t)filename, (int64_t)highestacceptableaddress);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)filehandle;
    (void)filelength;
    (void)filename;
    (void)highestacceptableaddress;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong ndisbindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryAdapterInstanceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)ndisbindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)padapterinstancename;
    (void)ndisbindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong bindingcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryBindInstanceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)bindingcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)padapterinstancename;
    (void)bindingcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(JNIEnv* km_env, jclass km_clazz, jlong ndisprotocolhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReEnumerateProtocolBindings");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndisprotocolhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisprotocolhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(JNIEnv* km_env, jclass km_clazz, jlong status, jlong parametervalue, jlong configurationhandle, jlong keyword, jint parametertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadConfiguration");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)parametervalue, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)keyword, (int32_t)parametertype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)parametervalue;
    (void)configurationhandle;
    (void)keyword;
    (void)parametertype;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(JNIEnv* km_env, jclass km_clazz, jlong status, jlong networkaddress, jlong networkaddresslength, jlong configurationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadNetworkAddress");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)networkaddress, (void*)(uintptr_t)networkaddresslength, (void*)(uintptr_t)configurationhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)networkaddress;
    (void)networkaddresslength;
    (void)configurationhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(JNIEnv* km_env, jclass km_clazz, jlong registercallback, jlong pnphandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisRegisterTdiCallBack");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)registercallback, (void*)(uintptr_t)pnphandler);
    } else {
        errno = ENOSYS;
    }
#else
    (void)registercallback;
    (void)pnphandler;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock, jlong lockstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReleaseReadWriteLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lock, (void*)(uintptr_t)lockstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    (void)lockstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisResetEvent");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetEvent");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(JNIEnv* km_env, jclass km_clazz, jlong ndistimer, jint millisecondsperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetPeriodicTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndistimer, (uint32_t)millisecondsperiod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndistimer;
    (void)millisecondsperiod;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jint millisecondstodelay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)timer, (uint32_t)millisecondstodelay);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)millisecondstodelay;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(JNIEnv* km_env, jclass km_clazz, jlong ndistimer, jint millisecondstodelay, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimerEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndistimer, (uint32_t)millisecondstodelay, (void*)(uintptr_t)functioncontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndistimer;
    (void)millisecondstodelay;
    (void)functioncontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong ndisdmahandle, jlong buffer, jint offset, jint length, jboolean writetodevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetupDmaTransfer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)ndisdmahandle, (void*)(uintptr_t)buffer, (uint32_t)offset, (uint32_t)length, (bool)writetodevice);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
    errno = ENOSYS;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSystemProcessorCount");
    }
    int8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUnmapFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong ndisadapterhandle, jint length, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUpdateSharedMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)length, (void*)(uintptr_t)virtualaddress, (int64_t)physicaladdress);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisadapterhandle;
    (void)length;
    (void)virtualaddress;
    (void)physicaladdress;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(JNIEnv* km_env, jclass km_clazz, jlong event, jint mstowait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWaitEvent");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)event, (uint32_t)mstowait);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)event;
    (void)mstowait;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jlong keyword, jlong parametervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteConfiguration");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)keyword, (void*)(uintptr_t)parametervalue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)configurationhandle;
    (void)keyword;
    (void)parametervalue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(JNIEnv* km_env, jclass km_clazz, jlong ndisadapterhandle, jint errorcode, jint numberoferrorvalues, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteErrorLogEntry");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)errorcode, (uint32_t)numberoferrorvalues); break;
            case 1: km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)errorcode, (uint32_t)numberoferrorvalues, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)errorcode, (uint32_t)numberoferrorvalues, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)errorcode, (uint32_t)numberoferrorvalues, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)errorcode, (uint32_t)numberoferrorvalues, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisadapterhandle;
    (void)errorcode;
    (void)numberoferrorvalues;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jint eventcode, jint uniqueeventvalue, jshort numstrings, jlong stringslist, jint datasize, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteEventLogEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loghandle, (int32_t)eventcode, (uint32_t)uniqueeventvalue, (uint16_t)numstrings, (void*)(uintptr_t)stringslist, (uint32_t)datasize, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loghandle;
    (void)eventcode;
    (void)uniqueeventvalue;
    (void)numstrings;
    (void)stringslist;
    (void)datasize;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

