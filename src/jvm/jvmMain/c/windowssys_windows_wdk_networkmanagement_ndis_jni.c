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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisAcquireReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock, jboolean fwrite, jlong lockstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAcquireReadWriteLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lock, (bool)fwrite, (void*)(uintptr_t)lockstate);
#else
    (void)lock;
    (void)fwrite;
    (void)lockstate;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisAllocateMemoryWithTag(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jint length, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisAllocateMemoryWithTag");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint32_t)length, (uint32_t)tag) : -1;
#else
    (void)virtualaddress;
    (void)length;
    (void)tag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timercancelled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCancelTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timercancelled);
#else
    (void)timer;
    (void)timercancelled;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClAddParty(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong protocolpartycontext, jlong callparameters, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClAddParty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)protocolpartycontext, (void*)(uintptr_t)callparameters, (void*)(uintptr_t)ndispartyhandle) : -1;
#else
    (void)ndisvchandle;
    (void)protocolpartycontext;
    (void)callparameters;
    (void)ndispartyhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClCloseAddressFamily(JNIEnv* km_env, jclass km_clazz, jlong ndisafhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseAddressFamily");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisafhandle) : -1;
#else
    (void)ndisafhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClCloseCall(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClCloseCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size) : -1;
#else
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClDeregisterSap(JNIEnv* km_env, jclass km_clazz, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDeregisterSap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndissaphandle) : -1;
#else
    (void)ndissaphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClDropParty(JNIEnv* km_env, jclass km_clazz, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClDropParty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size) : -1;
#else
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClIncomingCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClIncomingCallComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClMakeCall(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters, jlong protocolpartycontext, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClMakeCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters, (void*)(uintptr_t)protocolpartycontext, (void*)(uintptr_t)ndispartyhandle) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    (void)protocolpartycontext;
    (void)ndispartyhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClModifyCallQoS(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClModifyCallQoS");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisClRegisterSap(JNIEnv* km_env, jclass km_clazz, jlong ndisafhandle, jlong protocolsapcontext, jlong sap, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisClRegisterSap");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)protocolsapcontext, (void*)(uintptr_t)sap, (void*)(uintptr_t)ndissaphandle) : -1;
#else
    (void)ndisafhandle;
    (void)protocolsapcontext;
    (void)sap;
    (void)ndissaphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCloseConfiguration(JNIEnv* km_env, jclass km_clazz, jlong configurationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseConfiguration");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)configurationhandle);
#else
    (void)configurationhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCloseFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCloseFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filehandle);
#else
    (void)filehandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmActivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmActivateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmAddPartyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndispartyhandle, jlong callmgrpartycontext, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmAddPartyComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)callmgrpartycontext, (void*)(uintptr_t)callparameters);
#else
    (void)status;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmCloseAddressFamilyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisafhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseAddressFamilyComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisafhandle);
#else
    (void)status;
    (void)ndisafhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmCloseCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmCloseCallComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle);
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDeactivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeactivateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDeregisterSapComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndissaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDeregisterSapComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndissaphandle);
#else
    (void)status;
    (void)ndissaphandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDispatchCallConnected(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchCallConnected");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndisvchandle);
#else
    (void)ndisvchandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDispatchIncomingCall(JNIEnv* km_env, jclass km_clazz, jlong ndissaphandle, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndissaphandle, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters) : -1;
#else
    (void)ndissaphandle;
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDispatchIncomingCallQoSChange(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCallQoSChange");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
#else
    (void)ndisvchandle;
    (void)callparameters;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDispatchIncomingCloseCall(JNIEnv* km_env, jclass km_clazz, jint closestatus, jlong ndisvchandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCloseCall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)closestatus, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)buffer, (uint32_t)size);
#else
    (void)closestatus;
    (void)ndisvchandle;
    (void)buffer;
    (void)size;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDispatchIncomingDropParty(JNIEnv* km_env, jclass km_clazz, jint dropstatus, jlong ndispartyhandle, jlong buffer, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDispatchIncomingDropParty");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)dropstatus, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)buffer, (uint32_t)size);
#else
    (void)dropstatus;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmDropPartyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndispartyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmDropPartyComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndispartyhandle);
#else
    (void)status;
    (void)ndispartyhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmMakeCallComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong ndispartyhandle, jlong callmgrpartycontext, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmMakeCallComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)ndispartyhandle, (void*)(uintptr_t)callmgrpartycontext, (void*)(uintptr_t)callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmModifyCallQoSComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmModifyCallQoSComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmOpenAddressFamilyComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisafhandle, jlong callmgrafcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmOpenAddressFamilyComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)callmgrafcontext);
#else
    (void)status;
    (void)ndisafhandle;
    (void)callmgrafcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCmRegisterSapComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndissaphandle, jlong callmgrsapcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCmRegisterSapComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndissaphandle, (void*)(uintptr_t)callmgrsapcontext);
#else
    (void)status;
    (void)ndissaphandle;
    (void)callmgrsapcontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCoAssignInstanceName(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong baseinstancename, jlong vcinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoAssignInstanceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)baseinstancename, (void*)(uintptr_t)vcinstancename) : -1;
#else
    (void)ndisvchandle;
    (void)baseinstancename;
    (void)vcinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCoCreateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisbindinghandle, jlong ndisafhandle, jlong protocolvccontext, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoCreateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisbindinghandle, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)protocolvccontext, (void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)ndisbindinghandle;
    (void)ndisafhandle;
    (void)protocolvccontext;
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCoDeleteVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoDeleteVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCoGetTapiCallId(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong tapicallid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCoGetTapiCallId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)tapicallid) : -1;
#else
    (void)ndisvchandle;
    (void)tapicallid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCompleteDmaTransfer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong ndisdmahandle, jlong buffer, jint offset, jint length, jboolean writetodevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCompleteDmaTransfer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)ndisdmahandle, (void*)(uintptr_t)buffer, (uint32_t)offset, (uint32_t)length, (bool)writetodevice);
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisCopyBuffer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong buffer, jlong poolhandle, jlong memorydescriptor, jint offset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisCopyBuffer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)buffer, (void*)(uintptr_t)poolhandle, (void*)(uintptr_t)memorydescriptor, (uint32_t)offset, (uint32_t)length);
#else
    (void)status;
    (void)buffer;
    (void)poolhandle;
    (void)memorydescriptor;
    (void)offset;
    (void)length;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisDeregisterTdiCallBack(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisDeregisterTdiCallBack");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jint length, jint memoryflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisFreeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)virtualaddress, (uint32_t)length, (uint32_t)memoryflags);
#else
    (void)virtualaddress;
    (void)length;
    (void)memoryflags;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGeneratePartialCancelId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGeneratePartialCancelId");
    }
    uint8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGetCurrentProcessorCounts(JNIEnv* km_env, jclass km_clazz, jlong pidlecount, jlong pkernelanduser, jlong pindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCounts");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pidlecount, (void*)(uintptr_t)pkernelanduser, (void*)(uintptr_t)pindex);
#else
    (void)pidlecount;
    (void)pkernelanduser;
    (void)pindex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGetCurrentProcessorCpuUsage(JNIEnv* km_env, jclass km_clazz, jlong pcpuusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCpuUsage");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcpuusage);
#else
    (void)pcpuusage;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGetRoutineAddress(JNIEnv* km_env, jclass km_clazz, jlong ndisroutinename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetRoutineAddress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisroutinename) : NULL;
#else
    (void)ndisroutinename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGetSharedDataAlignment(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetSharedDataAlignment");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisGetVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisIMAssociateMiniport(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong protocolhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMAssociateMiniport");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)protocolhandle);
#else
    (void)driverhandle;
    (void)protocolhandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisIMCancelInitializeDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong deviceinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMCancelInitializeDeviceInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)deviceinstance) : -1;
#else
    (void)driverhandle;
    (void)deviceinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisIMDeInitializeDeviceInstance(JNIEnv* km_env, jclass km_clazz, jlong ndisminiporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMDeInitializeDeviceInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisminiporthandle) : -1;
#else
    (void)ndisminiporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisIMGetBindingContext(JNIEnv* km_env, jclass km_clazz, jlong ndisbindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMGetBindingContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisbindinghandle) : NULL;
#else
    (void)ndisbindinghandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisIMInitializeDeviceInstanceEx(JNIEnv* km_env, jclass km_clazz, jlong driverhandle, jlong driverinstance, jlong devicecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisIMInitializeDeviceInstanceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driverhandle, (void*)(uintptr_t)driverinstance, (void*)(uintptr_t)devicecontext) : -1;
#else
    (void)driverhandle;
    (void)driverinstance;
    (void)devicecontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisInitializeEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeEvent");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)event);
#else
    (void)event;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisInitializeReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeReadWriteLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lock);
#else
    (void)lock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisInitializeString(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)destination, (void*)(uintptr_t)source);
#else
    (void)destination;
    (void)source;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisInitializeTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timerfunction, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisInitializeTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timerfunction, (void*)(uintptr_t)functioncontext);
#else
    (void)timer;
    (void)timerfunction;
    (void)functioncontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMAllocateSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)physicaladdress);
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMAllocateSharedMemoryAsync(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMAllocateSharedMemoryAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)context) : -1;
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong timercancelled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCancelTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)timercancelled);
#else
    (void)timer;
    (void)timercancelled;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCloseLog(JNIEnv* km_env, jclass km_clazz, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCloseLog");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)loghandle);
#else
    (void)loghandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCmActivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmActivateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCmCreateVc(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong ndisafhandle, jlong miniportvccontext, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmCreateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)ndisafhandle, (void*)(uintptr_t)miniportvccontext, (void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)miniportadapterhandle;
    (void)ndisafhandle;
    (void)miniportvccontext;
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCmDeactivateVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeactivateVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCmDeleteVc(JNIEnv* km_env, jclass km_clazz, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmDeleteVc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCmRegisterAddressFamily(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong addressfamily, jlong cmcharacteristics, jint sizeofcmcharacteristics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCmRegisterAddressFamily");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)addressfamily, (void*)(uintptr_t)cmcharacteristics, (uint32_t)sizeofcmcharacteristics) : -1;
#else
    (void)miniportadapterhandle;
    (void)addressfamily;
    (void)cmcharacteristics;
    (void)sizeofcmcharacteristics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCoActivateVcComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle, jlong callparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoActivateVcComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle, (void*)(uintptr_t)callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCoDeactivateVcComplete(JNIEnv* km_env, jclass km_clazz, jint status, jlong ndisvchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCoDeactivateVcComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status, (void*)(uintptr_t)ndisvchandle);
#else
    (void)status;
    (void)ndisvchandle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMCreateLog(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint size, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMCreateLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)size, (void*)(uintptr_t)loghandle) : -1;
#else
    (void)miniportadapterhandle;
    (void)size;
    (void)loghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMDeregisterDmaChannel(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterDmaChannel");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportdmahandle);
#else
    (void)miniportdmahandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMDeregisterIoPortRange(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint initialport, jint numberofports, jlong portoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMDeregisterIoPortRange");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)initialport, (uint32_t)numberofports, (void*)(uintptr_t)portoffset);
#else
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    (void)portoffset;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMFlushLog(JNIEnv* km_env, jclass km_clazz, jlong loghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFlushLog");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)loghandle);
#else
    (void)loghandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMFreeSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jint length, jboolean cached, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMFreeSharedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (uint32_t)length, (bool)cached, (void*)(uintptr_t)virtualaddress, (int64_t)physicaladdress);
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMGetDeviceProperty(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong physicaldeviceobject, jlong functionaldeviceobject, jlong nextdeviceobject, jlong allocatedresources, jlong allocatedresourcestranslated) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDeviceProperty");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)physicaldeviceobject, (void*)(uintptr_t)functionaldeviceobject, (void*)(uintptr_t)nextdeviceobject, (void*)(uintptr_t)allocatedresources, (void*)(uintptr_t)allocatedresourcestranslated);
#else
    (void)miniportadapterhandle;
    (void)physicaldeviceobject;
    (void)functionaldeviceobject;
    (void)nextdeviceobject;
    (void)allocatedresources;
    (void)allocatedresourcestranslated;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMGetDmaAlignment(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMGetDmaAlignment");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportadapterhandle) : 0;
#else
    (void)miniportadapterhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMInitializeTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jlong miniportadapterhandle, jlong timerfunction, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMInitializeTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)timerfunction, (void*)(uintptr_t)functioncontext);
#else
    (void)timer;
    (void)miniportadapterhandle;
    (void)timerfunction;
    (void)functioncontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMMapIoSpace(JNIEnv* km_env, jclass km_clazz, jlong virtualaddress, jlong miniportadapterhandle, jlong physicaladdress, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMMapIoSpace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)virtualaddress, (void*)(uintptr_t)miniportadapterhandle, (int64_t)physicaladdress, (uint32_t)length) : -1;
#else
    (void)virtualaddress;
    (void)miniportadapterhandle;
    (void)physicaladdress;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMQueryAdapterInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong miniporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMQueryAdapterInstanceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)miniporthandle) : -1;
#else
    (void)padapterinstancename;
    (void)miniporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMReadDmaCounter(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMReadDmaCounter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportdmahandle) : 0;
#else
    (void)miniportdmahandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMRegisterDmaChannel(JNIEnv* km_env, jclass km_clazz, jlong miniportdmahandle, jlong miniportadapterhandle, jint dmachannel, jboolean dma32bitaddresses, jlong dmadescription, jint maximumlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterDmaChannel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniportdmahandle, (void*)(uintptr_t)miniportadapterhandle, (uint32_t)dmachannel, (bool)dma32bitaddresses, (void*)(uintptr_t)dmadescription, (uint32_t)maximumlength) : -1;
#else
    (void)miniportdmahandle;
    (void)miniportadapterhandle;
    (void)dmachannel;
    (void)dma32bitaddresses;
    (void)dmadescription;
    (void)maximumlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMRegisterIoPortRange(JNIEnv* km_env, jclass km_clazz, jlong portoffset, jlong miniportadapterhandle, jint initialport, jint numberofports) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRegisterIoPortRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)portoffset, (void*)(uintptr_t)miniportadapterhandle, (uint32_t)initialport, (uint32_t)numberofports) : -1;
#else
    (void)portoffset;
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMRemoveMiniport(JNIEnv* km_env, jclass km_clazz, jlong miniporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMRemoveMiniport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)miniporthandle) : -1;
#else
    (void)miniporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMSetPeriodicTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jint millisecondperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSetPeriodicTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (uint32_t)millisecondperiod);
#else
    (void)timer;
    (void)millisecondperiod;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMSleep(JNIEnv* km_env, jclass km_clazz, jint microsecondstosleep) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMSleep");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)microsecondstosleep);
#else
    (void)microsecondstosleep;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMUnmapIoSpace(JNIEnv* km_env, jclass km_clazz, jlong miniportadapterhandle, jlong virtualaddress, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMUnmapIoSpace");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniportadapterhandle, (void*)(uintptr_t)virtualaddress, (uint32_t)length);
#else
    (void)miniportadapterhandle;
    (void)virtualaddress;
    (void)length;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMWriteLogData(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jlong logbuffer, jint logbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMWriteLogData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loghandle, (void*)(uintptr_t)logbuffer, (uint32_t)logbuffersize) : -1;
#else
    (void)loghandle;
    (void)logbuffer;
    (void)logbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisMapFile(JNIEnv* km_env, jclass km_clazz, jlong status, jlong mappedbuffer, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisMapFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)mappedbuffer, (void*)(uintptr_t)filehandle);
#else
    (void)status;
    (void)mappedbuffer;
    (void)filehandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisOpenConfigurationKeyByIndex(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jint arg_2_index, jlong keyname, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByIndex");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (uint32_t)arg_2_index, (void*)(uintptr_t)keyname, (void*)(uintptr_t)keyhandle);
#else
    (void)status;
    (void)configurationhandle;
    (void)arg_2_index;
    (void)keyname;
    (void)keyhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisOpenConfigurationKeyByName(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jlong subkeyname, jlong subkeyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByName");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)subkeyname, (void*)(uintptr_t)subkeyhandle);
#else
    (void)status;
    (void)configurationhandle;
    (void)subkeyname;
    (void)subkeyhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisOpenFile(JNIEnv* km_env, jclass km_clazz, jlong status, jlong filehandle, jlong filelength, jlong filename, jlong highestacceptableaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisOpenFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)filelength, (void*)(uintptr_t)filename, (int64_t)highestacceptableaddress);
#else
    (void)status;
    (void)filehandle;
    (void)filelength;
    (void)filename;
    (void)highestacceptableaddress;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisQueryAdapterInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong ndisbindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryAdapterInstanceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)ndisbindinghandle) : -1;
#else
    (void)padapterinstancename;
    (void)ndisbindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisQueryBindInstanceName(JNIEnv* km_env, jclass km_clazz, jlong padapterinstancename, jlong bindingcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisQueryBindInstanceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)padapterinstancename, (void*)(uintptr_t)bindingcontext) : -1;
#else
    (void)padapterinstancename;
    (void)bindingcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisReEnumerateProtocolBindings(JNIEnv* km_env, jclass km_clazz, jlong ndisprotocolhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReEnumerateProtocolBindings");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndisprotocolhandle);
#else
    (void)ndisprotocolhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisReadConfiguration(JNIEnv* km_env, jclass km_clazz, jlong status, jlong parametervalue, jlong configurationhandle, jlong keyword, jint parametertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadConfiguration");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)parametervalue, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)keyword, (int32_t)parametertype);
#else
    (void)status;
    (void)parametervalue;
    (void)configurationhandle;
    (void)keyword;
    (void)parametertype;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisReadNetworkAddress(JNIEnv* km_env, jclass km_clazz, jlong status, jlong networkaddress, jlong networkaddresslength, jlong configurationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReadNetworkAddress");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)networkaddress, (void*)(uintptr_t)networkaddresslength, (void*)(uintptr_t)configurationhandle);
#else
    (void)status;
    (void)networkaddress;
    (void)networkaddresslength;
    (void)configurationhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisRegisterTdiCallBack(JNIEnv* km_env, jclass km_clazz, jlong registercallback, jlong pnphandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisRegisterTdiCallBack");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)registercallback, (void*)(uintptr_t)pnphandler);
#else
    (void)registercallback;
    (void)pnphandler;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisReleaseReadWriteLock(JNIEnv* km_env, jclass km_clazz, jlong lock, jlong lockstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisReleaseReadWriteLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lock, (void*)(uintptr_t)lockstate);
#else
    (void)lock;
    (void)lockstate;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisResetEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisResetEvent");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)event);
#else
    (void)event;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSetEvent(JNIEnv* km_env, jclass km_clazz, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetEvent");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)event);
#else
    (void)event;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSetPeriodicTimer(JNIEnv* km_env, jclass km_clazz, jlong ndistimer, jint millisecondsperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetPeriodicTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndistimer, (uint32_t)millisecondsperiod);
#else
    (void)ndistimer;
    (void)millisecondsperiod;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSetTimer(JNIEnv* km_env, jclass km_clazz, jlong timer, jint millisecondstodelay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)timer, (uint32_t)millisecondstodelay);
#else
    (void)timer;
    (void)millisecondstodelay;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSetTimerEx(JNIEnv* km_env, jclass km_clazz, jlong ndistimer, jint millisecondstodelay, jlong functioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetTimerEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndistimer, (uint32_t)millisecondstodelay, (void*)(uintptr_t)functioncontext);
#else
    (void)ndistimer;
    (void)millisecondstodelay;
    (void)functioncontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSetupDmaTransfer(JNIEnv* km_env, jclass km_clazz, jlong status, jlong ndisdmahandle, jlong buffer, jint offset, jint length, jboolean writetodevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSetupDmaTransfer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)ndisdmahandle, (void*)(uintptr_t)buffer, (uint32_t)offset, (uint32_t)length, (bool)writetodevice);
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisSystemProcessorCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisSystemProcessorCount");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisUnmapFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUnmapFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filehandle);
#else
    (void)filehandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisUpdateSharedMemory(JNIEnv* km_env, jclass km_clazz, jlong ndisadapterhandle, jint length, jlong virtualaddress, jlong physicaladdress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisUpdateSharedMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ndisadapterhandle, (uint32_t)length, (void*)(uintptr_t)virtualaddress, (int64_t)physicaladdress);
#else
    (void)ndisadapterhandle;
    (void)length;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisWaitEvent(JNIEnv* km_env, jclass km_clazz, jlong event, jint mstowait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWaitEvent");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)event, (uint32_t)mstowait) : false;
#else
    (void)event;
    (void)mstowait;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisWriteConfiguration(JNIEnv* km_env, jclass km_clazz, jlong status, jlong configurationhandle, jlong keyword, jlong parametervalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteConfiguration");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)status, (void*)(uintptr_t)configurationhandle, (void*)(uintptr_t)keyword, (void*)(uintptr_t)parametervalue);
#else
    (void)status;
    (void)configurationhandle;
    (void)keyword;
    (void)parametervalue;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_networkmanagement_ndis_WindowsWdkNetworkmanagementNdisJniBridge_windowssys_1windows_1wdk_1networkmanagement_1ndis_1NdisWriteEventLogEntry(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jint eventcode, jint uniqueeventvalue, jshort numstrings, jlong stringslist, jint datasize, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdisWriteEventLogEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loghandle, (int32_t)eventcode, (uint32_t)uniqueeventvalue, (uint16_t)numstrings, (void*)(uintptr_t)stringslist, (uint32_t)datasize, (void*)(uintptr_t)data) : -1;
#else
    (void)loghandle;
    (void)eventcode;
    (void)uniqueeventvalue;
    (void)numstrings;
    (void)stringslist;
    (void)datasize;
    (void)data;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

