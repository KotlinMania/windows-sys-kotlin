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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1DceErrorInqTextA(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong errortext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)errortext) : -1;
#else
    (void)rpcstatus;
    (void)errortext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1DceErrorInqTextW(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong errortext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)errortext) : -1;
#else
    (void)rpcstatus;
    (void)errortext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1IUnknown_1AddRef_1Proxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_AddRef_Proxy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_this) : 0;
#else
    (void)arg_0_this;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1IUnknown_1QueryInterface_1Proxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_QueryInterface_Proxy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_this, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)arg_0_this;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1IUnknown_1Release_1Proxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_Release_Proxy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_this) : 0;
#else
    (void)arg_0_this;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcAllocate(JNIEnv* km_env, jclass km_clazz, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcAsyncAbortCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncAbortCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)exceptioncode) : -1;
#else
    (void)pasync;
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcAsyncSetHandle(JNIEnv* km_env, jclass km_clazz, jlong message, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncSetHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)pasync) : -1;
#else
    (void)message;
    (void)pasync;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingCopy(JNIEnv* km_env, jclass km_clazz, jlong sourcebinding, jlong destinationbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcebinding, (void*)(uintptr_t)destinationbinding) : -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingCreateNP(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong servicename, jlong networkoptions, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCreateNP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)servicename, (void*)(uintptr_t)networkoptions, (void*)(uintptr_t)binding) : -1;
#else
    (void)servername;
    (void)servicename;
    (void)networkoptions;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingHandleToAsyncHandle(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong asynchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingHandleToAsyncHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)asynchandle) : -1;
#else
    (void)binding;
    (void)asynchandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqClientTokenAttributes(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong tokenid, jlong authenticationid, jlong modifiedid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqClientTokenAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)tokenid, (void*)(uintptr_t)authenticationid, (void*)(uintptr_t)modifiedid) : -1;
#else
    (void)binding;
    (void)tokenid;
    (void)authenticationid;
    (void)modifiedid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqDynamicEndpointA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong dynamicendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)dynamicendpoint) : -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqDynamicEndpointW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong dynamicendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)dynamicendpoint) : -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqLocalClientPID(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong pid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqLocalClientPID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)pid) : -1;
#else
    (void)binding;
    (void)pid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqMarshalledTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong marshalledtargetinfosize, jlong marshalledtargetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqMarshalledTargetInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)marshalledtargetinfosize, (void*)(uintptr_t)marshalledtargetinfo) : -1;
#else
    (void)binding;
    (void)marshalledtargetinfosize;
    (void)marshalledtargetinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong securitycontexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)securitycontexthandle) : -1;
#else
    (void)binding;
    (void)securitycontexthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqSecurityContextKeyInfo(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong keyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContextKeyInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)keyinfo) : -1;
#else
    (void)binding;
    (void)keyinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqTransportType(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqTransportType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)type) : -1;
#else
    (void)binding;
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingInqWireIdForSnego(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong wireid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqWireIdForSnego");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)wireid) : -1;
#else
    (void)binding;
    (void)wireid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingIsClientLocal(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong clientlocalflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsClientLocal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)clientlocalflag) : -1;
#else
    (void)bindinghandle;
    (void)clientlocalflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingIsServerLocal(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverlocalflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsServerLocal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverlocalflag) : -1;
#else
    (void)binding;
    (void)serverlocalflag;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingSetPrivateOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingSetPrivateOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (uint64_t)optionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcBindingToStaticStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingToStaticStringBindingW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcClearMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcClearMutex");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mutex);
#else
    (void)mutex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcDeleteMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcDeleteMutex");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mutex);
#else
    (void)mutex;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcExceptionFilter(JNIEnv* km_env, jclass km_clazz, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcExceptionFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)exceptioncode) : -1;
#else
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcFree(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)object);
#else
    (void)object;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreeBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcFreePipeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreePipeBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcGetBufferWithObject(JNIEnv* km_env, jclass km_clazz, jlong message, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBufferWithObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)objectuuid) : -1;
#else
    (void)message;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcGetCurrentCallHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetCurrentCallHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcGetDefaultSD(JNIEnv* km_env, jclass km_clazz, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetDefaultSD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsecuritydescriptor) : -1;
#else
    (void)ppsecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcGetExtendedError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetExtendedError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcIfInqTransferSyntaxes(JNIEnv* km_env, jclass km_clazz, jlong rpcifhandle, jlong transfersyntaxes, jint transfersyntaxsize, jlong transfersyntaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcIfInqTransferSyntaxes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rpcifhandle, (void*)(uintptr_t)transfersyntaxes, (uint32_t)transfersyntaxsize, (void*)(uintptr_t)transfersyntaxcount) : -1;
#else
    (void)rpcifhandle;
    (void)transfersyntaxes;
    (void)transfersyntaxsize;
    (void)transfersyntaxcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcMapWin32Status(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMapWin32Status");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)status) : -1;
#else
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcMgmtEnableDedicatedThreadPool(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMgmtEnableDedicatedThreadPool");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNegotiateTransferSyntax(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNegotiateTransferSyntax");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsBindingSetEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsBindingSetEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsGetBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsInterfaceExported(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong rpcinterfaceinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceExported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)rpcinterfaceinformation) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsInterfaceUnexported(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong rpcinterfaceinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceUnexported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)rpcinterfaceinformation) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsRaiseException(JNIEnv* km_env, jclass km_clazz, jlong message, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsRaiseException");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)message, (int32_t)status);
#else
    (void)message;
    (void)status;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcNsSendReceive(JNIEnv* km_env, jclass km_clazz, jlong message, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsSendReceive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)handle) : -1;
#else
    (void)message;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcOpenClientProcess(JNIEnv* km_env, jclass km_clazz, jlong binding, jint desiredaccess, jlong clientprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcOpenClientProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)desiredaccess, (void*)(uintptr_t)clientprocess) : -1;
#else
    (void)binding;
    (void)desiredaccess;
    (void)clientprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcPauseExecution(JNIEnv* km_env, jclass km_clazz, jint milliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcPauseExecution");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)milliseconds);
#else
    (void)milliseconds;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcReBindBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReBindBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcReallocPipeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message, jint newsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReallocPipeBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message, (uint32_t)newsize) : -1;
#else
    (void)message;
    (void)newsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcReceive(JNIEnv* km_env, jclass km_clazz, jlong message, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReceive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message, (uint32_t)size) : -1;
#else
    (void)message;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcRecordCalloutFailure(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong calloutstate, jlong dllname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRecordCalloutFailure");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)calloutstate, (void*)(uintptr_t)dllname);
#else
    (void)rpcstatus;
    (void)calloutstate;
    (void)dllname;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcRequestMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRequestMutex");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mutex);
#else
    (void)mutex;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcSend(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcSendReceive(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSendReceive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerCheckClientRestriction(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerCheckClientRestriction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerDisableExceptionFilter(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerDisableExceptionFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerGetAssociationID(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong associationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerGetAssociationID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)associationid) : -1;
#else
    (void)binding;
    (void)associationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerInqAddressChangeFn(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqAddressChangeFn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerInqLocalConnAddress(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong buffer, jlong buffersize, jlong addressformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqLocalConnAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)addressformat) : -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerInqRemoteConnAddress(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong buffer, jlong buffersize, jlong addressformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqRemoteConnAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)addressformat) : -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerInqTransportType(JNIEnv* km_env, jclass km_clazz, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqTransportType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)type) : -1;
#else
    (void)type;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerRegisterForwardFunction(JNIEnv* km_env, jclass km_clazz, jlong pforwardfunction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerRegisterForwardFunction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pforwardfunction) : -1;
#else
    (void)pforwardfunction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerSetAddressChangeFn(JNIEnv* km_env, jclass km_clazz, jlong paddresschangefn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSetAddressChangeFn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paddresschangefn) : -1;
#else
    (void)paddresschangefn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerStartService(JNIEnv* km_env, jclass km_clazz, jlong protseq, jlong endpoint, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerStartService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)ifspec) : -1;
#else
    (void)protseq;
    (void)endpoint;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerSubscribeForDisconnectNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)hevent) : -1;
#else
    (void)binding;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerSubscribeForDisconnectNotification2(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong hevent, jlong subscriptionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)hevent, (void*)(uintptr_t)subscriptionid) : -1;
#else
    (void)binding;
    (void)hevent;
    (void)subscriptionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerUseProtseq2A(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerUseProtseq2W(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerUseProtseqEp2A(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcServerUseProtseqEp2W(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcSessionStrictContextHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSessionStrictContextHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcSsDontSerializeContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSsDontSerializeContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcSystemHandleTypeSpecificWork(JNIEnv* km_env, jclass km_clazz, jlong handle, jbyte actualtype, jbyte idltype, jint marshaldirection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSystemHandleTypeSpecificWork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint8_t)actualtype, (uint8_t)idltype, (int32_t)marshaldirection) : -1;
#else
    (void)handle;
    (void)actualtype;
    (void)idltype;
    (void)marshaldirection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1RpcTurnOnEEInfoPropagation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcTurnOnEEInfoPropagation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1I_1UuidCreate(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_UuidCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesBufferHandleReset(JNIEnv* km_env, jclass km_clazz, jlong handle, jint handlestyle, jint operation, jlong pbuffer, jint buffersize, jlong pencodedsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesBufferHandleReset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)handlestyle, (int32_t)operation, (void*)(uintptr_t)pbuffer, (uint32_t)buffersize, (void*)(uintptr_t)pencodedsize) : -1;
#else
    (void)handle;
    (void)handlestyle;
    (void)operation;
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesDecodeBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint buffersize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeBufferHandleCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)phandle) : -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesDecodeIncrementalHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong userstate, jlong readfn, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeIncrementalHandleCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)userstate, (void*)(uintptr_t)readfn, (void*)(uintptr_t)phandle) : -1;
#else
    (void)userstate;
    (void)readfn;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesEncodeDynBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jlong pencodedsize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeDynBufferHandleCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pencodedsize, (void*)(uintptr_t)phandle) : -1;
#else
    (void)pbuffer;
    (void)pencodedsize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesEncodeFixedBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jint buffersize, jlong pencodedsize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeFixedBufferHandleCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer, (uint32_t)buffersize, (void*)(uintptr_t)pencodedsize, (void*)(uintptr_t)phandle) : -1;
#else
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesEncodeIncrementalHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong userstate, jlong allocfn, jlong writefn, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeIncrementalHandleCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)userstate, (void*)(uintptr_t)allocfn, (void*)(uintptr_t)writefn, (void*)(uintptr_t)phandle) : -1;
#else
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesHandleFree(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesHandleFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesIncrementalHandleReset(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong userstate, jlong allocfn, jlong writefn, jlong readfn, jint operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesIncrementalHandleReset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)userstate, (void*)(uintptr_t)allocfn, (void*)(uintptr_t)writefn, (void*)(uintptr_t)readfn, (int32_t)operation) : -1;
#else
    (void)handle;
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)readfn;
    (void)operation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1MesInqProcEncodingId(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pinterfaceid, jlong pprocnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesInqProcEncodingId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pinterfaceid, (void*)(uintptr_t)pprocnum) : -1;
#else
    (void)handle;
    (void)pinterfaceid;
    (void)pprocnum;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRCContextBinding(JNIEnv* km_env, jclass km_clazz, jlong ccontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextBinding");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)ccontext) : NULL;
#else
    (void)ccontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRCContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong ccontext, jlong pbuff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)ccontext, (void*)(uintptr_t)pbuff);
#else
    (void)ccontext;
    (void)pbuff;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRCContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pccontext, jlong hbinding, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextUnmarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pccontext, (void*)(uintptr_t)hbinding, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation);
#else
    (void)pccontext;
    (void)hbinding;
    (void)pbuff;
    (void)datarepresentation;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong ccontext, jlong pbuff, jlong userrundownin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin);
#else
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextMarshall2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong ccontext, jlong pbuff, jlong userrundownin, jlong ctxguard, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin, (void*)(uintptr_t)ctxguard, (uint32_t)flags);
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    (void)ctxguard;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextMarshallEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong ccontext, jlong pbuff, jlong userrundownin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshallEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin);
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuff, (uint32_t)datarepresentation) : NULL;
#else
    (void)pbuff;
    (void)datarepresentation;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextUnmarshall2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong pbuff, jint datarepresentation, jlong ctxguard, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall2");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation, (void*)(uintptr_t)ctxguard, (uint32_t)flags) : NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    (void)ctxguard;
    (void)flags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NDRSContextUnmarshallEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshallEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation) : NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1Ndr64AsyncServerCall64(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCall64");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1Ndr64AsyncServerCallAll(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCallAll");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1Ndr64DcomAsyncStubCall(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64DcomAsyncStubCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrAllocate(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint64_t)len) : NULL;
#else
    (void)pstubmsg;
    (void)len;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrAsyncServerCall(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAsyncServerCall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrByteCountPointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrByteCountPointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrByteCountPointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrByteCountPointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrClearOutParameters(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat, jlong argaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClearOutParameters");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat, (void*)(uintptr_t)argaddr);
#else
    (void)pstubmsg;
    (void)pformat;
    (void)argaddr;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrClientContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jint fcheck) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (int64_t)contexthandle, (int32_t)fcheck);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)fcheck;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrClientContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pcontexthandle, jlong bindhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextUnmarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pcontexthandle, (void*)(uintptr_t)bindhandle);
#else
    (void)pstubmsg;
    (void)pcontexthandle;
    (void)bindhandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrClientInitialize(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint procnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)procnum);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrClientInitializeNew(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint procnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitializeNew");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)procnum);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrComplexStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStringBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStringMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStringMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStringUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConformantVaryingStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrContextHandleInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleInitialize");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrContextHandleSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConvert(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrConvert2(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat, jint numberparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat, (int32_t)numberparams);
#else
    (void)pstubmsg;
    (void)pformat;
    (void)numberparams;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrCorrelationFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg);
#else
    (void)pstubmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrCorrelationInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jint cachesize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationInitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint32_t)cachesize, (uint32_t)flags);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)cachesize;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrCorrelationPass(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationPass");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg);
#else
    (void)pstubmsg;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrCreateServerInterfaceFromStub(JNIEnv* km_env, jclass km_clazz, jlong pstub, jlong pserverif) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCreateServerInterfaceFromStub");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstub, (void*)(uintptr_t)pserverif) : -1;
#else
    (void)pstub;
    (void)pserverif;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrDcomAsyncStubCall(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrDcomAsyncStubCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrEncapsulatedUnionBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrEncapsulatedUnionFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrEncapsulatedUnionMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrEncapsulatedUnionMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrEncapsulatedUnionUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFixedArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFixedArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFixedArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFixedArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFixedArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFreeBuffer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg);
#else
    (void)pstubmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFullPointerXlatFree(JNIEnv* km_env, jclass km_clazz, jlong pxlattables) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pxlattables);
#else
    (void)pxlattables;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrFullPointerXlatInit(JNIEnv* km_env, jclass km_clazz, jint numberofpointers, jint xlatside) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatInit");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numberofpointers, (int32_t)xlatside) : NULL;
#else
    (void)numberofpointers;
    (void)xlatside;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jint bufferlength, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint32_t)bufferlength, (void*)(uintptr_t)handle) : NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrGetDcomProtocolVersion(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetDcomProtocolVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pversion) : -1;
#else
    (void)pstubmsg;
    (void)pversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrGetUserMarshalInfo(JNIEnv* km_env, jclass km_clazz, jlong pflags, jint informationlevel, jlong pmarshalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetUserMarshalInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pflags, (uint32_t)informationlevel, (void*)(uintptr_t)pmarshalinfo) : -1;
#else
    (void)pflags;
    (void)informationlevel;
    (void)pmarshalinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrInterfacePointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrInterfacePointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrInterfacePointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrInterfacePointerMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrInterfacePointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMapCommAndFaultStatus(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pcommstatus, jlong pfaultstatus, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMapCommAndFaultStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pcommstatus, (void*)(uintptr_t)pfaultstatus, (int32_t)status) : -1;
#else
    (void)pstubmsg;
    (void)pcommstatus;
    (void)pfaultstatus;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeAlignSize(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeAlignSizeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSizeAll");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo) : 0;
#else
    (void)handle;
    (void)pproxyinfo;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeDecode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecode");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pobject, (int16_t)size);
#else
    (void)handle;
    (void)pobject;
    (void)size;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeDecodeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecodeAll");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)pobject, (int16_t)size);
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeEncode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncode");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pobject, (int16_t)size);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pobject;
    (void)size;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesSimpleTypeEncodeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncodeAll");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)pobject, (int16_t)size);
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeAlignSize(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject) : 0;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeAlignSize2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize2");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject) : 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeAlignSize3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize3");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject) : 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeDecode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeDecode2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeDecode3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode3");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeEncode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeEncode2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeEncode3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode3");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeFree2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrMesTypeFree3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree3");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonConformantStringBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonConformantStringMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonConformantStringMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonConformantStringUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonEncapsulatedUnionBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonEncapsulatedUnionFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonEncapsulatedUnionMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonEncapsulatedUnionMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNonEncapsulatedUnionUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNsGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jint bufferlength, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsGetBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint32_t)bufferlength, (void*)(uintptr_t)handle) : NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrNsSendReceive(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pbufferend, jlong pautohandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsSendReceive");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pbufferend, (void*)(uintptr_t)pautohandle) : NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    (void)pautohandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrOleAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrOleFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)nodetofree);
#else
    (void)nodetofree;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPartialIgnoreClientBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory);
#else
    (void)pstubmsg;
    (void)pmemory;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPartialIgnoreClientMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory);
#else
    (void)pstubmsg;
    (void)pmemory;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPartialIgnoreServerInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerInitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPartialIgnoreServerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerUnmarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory);
#else
    (void)pstubmsg;
    (void)ppmemory;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPointerMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrPointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRangeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRangeUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSmClientAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSmClientFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)nodetofree);
#else
    (void)nodetofree;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSmSetClientToOsf(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmSetClientToOsf");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmessage);
#else
    (void)pmessage;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSsDefaultAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSsDefaultFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)nodetofree);
#else
    (void)nodetofree;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSsDisableAllocate(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDisableAllocate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmessage);
#else
    (void)pmessage;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrRpcSsEnableAllocate(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsEnableAllocate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pmessage);
#else
    (void)pmessage;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSendReceive(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pbufferend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSendReceive");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pbufferend) : NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerCall2(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCall2");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerCallAll(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallAll");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerCallNdr64(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallNdr64");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg);
#else
    (void)prpcmsg;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jlong rundownroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)contexthandle, (void*)(uintptr_t)rundownroutine);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerContextNewMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jlong rundownroutine, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)contexthandle, (void*)(uintptr_t)rundownroutine, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerContextNewUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg) : NULL;
#else
    (void)pstubmsg;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerInitialize(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitialize");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor) : NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerInitializeMarshall(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg);
#else
    (void)prpcmsg;
    (void)pstubmsg;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerInitializeNew(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeNew");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor) : NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerInitializePartial(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint requestedbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializePartial");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)requestedbuffersize);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)requestedbuffersize;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrServerInitializeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pstubdescriptor, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (void*)(uintptr_t)prpcmsg) : NULL;
#else
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)prpcmsg;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleTypeMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeMarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint8_t)formatchar);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrSimpleTypeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeUnmarshall");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint8_t)formatchar);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrStubCall2(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrStubCall3(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalSimpleTypeConvert(JNIEnv* km_env, jclass km_clazz, jlong pflags, jlong pbuffer, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalSimpleTypeConvert");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pflags, (void*)(uintptr_t)pbuffer, (uint8_t)formatchar) : NULL;
#else
    (void)pflags;
    (void)pbuffer;
    (void)formatchar;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrUserMarshalUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrVaryingArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrVaryingArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrVaryingArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrVaryingArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrVaryingArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrXmitOrRepAsBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrXmitOrRepAsFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrXmitOrRepAsMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrXmitOrRepAsMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMemorySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1NdrXmitOrRepAsUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsUnmarshall");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncAbortCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncAbortCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)exceptioncode) : -1;
#else
    (void)pasync;
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncCancelCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint fabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCancelCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (int32_t)fabort) : -1;
#else
    (void)pasync;
    (void)fabort;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncCompleteCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jlong reply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCompleteCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (void*)(uintptr_t)reply) : -1;
#else
    (void)pasync;
    (void)reply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncGetCallStatus(JNIEnv* km_env, jclass km_clazz, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncGetCallStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync) : -1;
#else
    (void)pasync;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncInitializeHandle(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncInitializeHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)size) : -1;
#else
    (void)pasync;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcAsyncRegisterInfo(JNIEnv* km_env, jclass km_clazz, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncRegisterInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync) : -1;
#else
    (void)pasync;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingBind(JNIEnv* km_env, jclass km_clazz, jlong pasync, jlong binding, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingBind");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pasync, (void*)(uintptr_t)binding, (void*)(uintptr_t)ifspec) : -1;
#else
    (void)pasync;
    (void)binding;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingCopy(JNIEnv* km_env, jclass km_clazz, jlong sourcebinding, jlong destinationbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcebinding, (void*)(uintptr_t)destinationbinding) : -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingCreateA(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jlong security, jlong options, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_template, (void*)(uintptr_t)security, (void*)(uintptr_t)options, (void*)(uintptr_t)binding) : -1;
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingCreateW(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jlong security, jlong options, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_template, (void*)(uintptr_t)security, (void*)(uintptr_t)options, (void*)(uintptr_t)binding) : -1;
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingFree(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingFromStringBindingA(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)binding) : -1;
#else
    (void)stringbinding;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingFromStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)binding) : -1;
#else
    (void)stringbinding;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthClientA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthClientExA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc, (uint32_t)flags) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthClientExW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc, (uint32_t)flags) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthClientW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthInfoExA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc, jint rpcqosversion, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc, (uint32_t)rpcqosversion, (void*)(uintptr_t)securityqos) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthInfoExW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc, jint rpcqosversion, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc, (uint32_t)rpcqosversion, (void*)(uintptr_t)securityqos) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqMaxCalls(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong maxcalls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqMaxCalls");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)maxcalls) : -1;
#else
    (void)binding;
    (void)maxcalls;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqObject(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid) : -1;
#else
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingInqOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong poptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (void*)(uintptr_t)poptionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)poptionvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingReset(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingReset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingServerFromClient(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong serverbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingServerFromClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)serverbinding) : -1;
#else
    (void)clientbinding;
    (void)serverbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetAuthInfoExA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc, (void*)(uintptr_t)securityqos) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetAuthInfoExW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc, (void*)(uintptr_t)securityqos) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetObject(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid) : -1;
#else
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingSetOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (uint64_t)optionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingToStringBindingA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingToStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingUnbind(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingUnbind");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcBindingVectorFree(JNIEnv* km_env, jclass km_clazz, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingVectorFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindingvector) : -1;
#else
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcCancelThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)thread) : -1;
#else
    (void)thread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcCancelThreadEx(JNIEnv* km_env, jclass km_clazz, jlong thread, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThreadEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)thread, (int32_t)timeout) : -1;
#else
    (void)thread;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcCertGeneratePrincipalNameA(JNIEnv* km_env, jclass km_clazz, jlong context, jint flags, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (uint32_t)flags, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcCertGeneratePrincipalNameW(JNIEnv* km_env, jclass km_clazz, jlong context, jint flags, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (uint32_t)flags, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpRegisterA(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpRegisterNoReplaceA(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpRegisterNoReplaceW(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpRegisterW(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpResolveBinding(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpResolveBinding");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)ifspec) : -1;
#else
    (void)binding;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcEpUnregister(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpUnregister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorAddRecord(JNIEnv* km_env, jclass km_clazz, jlong errorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorAddRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)errorinfo) : -1;
#else
    (void)errorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorClearInformation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorClearInformation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorEndEnumeration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorGetNextRecord(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jint copystrings, jlong errorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNextRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle, (int32_t)copystrings, (void*)(uintptr_t)errorinfo) : -1;
#else
    (void)enumhandle;
    (void)copystrings;
    (void)errorinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorGetNumberOfRecords(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jlong records) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNumberOfRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle, (void*)(uintptr_t)records) : -1;
#else
    (void)enumhandle;
    (void)records;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorLoadErrorInfo(JNIEnv* km_env, jclass km_clazz, jlong errorblob, jlong blobsize, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorLoadErrorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)errorblob, (uint64_t)blobsize, (void*)(uintptr_t)enumhandle) : -1;
#else
    (void)errorblob;
    (void)blobsize;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorResetEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorResetEnumeration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorSaveErrorInfo(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jlong errorblob, jlong blobsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorSaveErrorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle, (void*)(uintptr_t)errorblob, (void*)(uintptr_t)blobsize) : -1;
#else
    (void)enumhandle;
    (void)errorblob;
    (void)blobsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcErrorStartEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorStartEnumeration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcExceptionFilter(JNIEnv* km_env, jclass km_clazz, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcExceptionFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)exceptioncode) : -1;
#else
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcFreeAuthorizationContext(JNIEnv* km_env, jclass km_clazz, jlong pauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcFreeAuthorizationContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauthzclientcontext) : -1;
#else
    (void)pauthzclientcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcIfIdVectorFree(JNIEnv* km_env, jclass km_clazz, jlong ifidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfIdVectorFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifidvector) : -1;
#else
    (void)ifidvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcIfInqId(JNIEnv* km_env, jclass km_clazz, jlong rpcifhandle, jlong rpcifid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfInqId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rpcifhandle, (void*)(uintptr_t)rpcifid) : -1;
#else
    (void)rpcifhandle;
    (void)rpcifid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcImpersonateClient2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcImpersonateClientContainer(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClientContainer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEnableIdleCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEnableIdleCleanup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEpEltInqBegin(JNIEnv* km_env, jclass km_clazz, jlong epbinding, jint inquirytype, jlong ifid, jint versoption, jlong objectuuid, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqBegin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)epbinding, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)epbinding;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)objectuuid;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEpEltInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEpEltInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong binding, jlong objectuuid, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEpEltInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong binding, jlong objectuuid, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtEpUnregister(JNIEnv* km_env, jclass km_clazz, jlong epbinding, jlong ifid, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpUnregister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)epbinding, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid) : -1;
#else
    (void)epbinding;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqComTimeout(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqComTimeout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)timeout) : -1;
#else
    (void)binding;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqDefaultProtectLevel(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong authnlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqDefaultProtectLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)authnlevel) : -1;
#else
    (void)authnsvc;
    (void)authnlevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqIfIds(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong ifidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqIfIds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)ifidvector) : -1;
#else
    (void)binding;
    (void)ifidvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqServerPrincNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint authnsvc, jlong serverprincname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)authnsvc, (void*)(uintptr_t)serverprincname) : -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqServerPrincNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint authnsvc, jlong serverprincname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)authnsvc, (void*)(uintptr_t)serverprincname) : -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtInqStats(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong statistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqStats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)statistics) : -1;
#else
    (void)binding;
    (void)statistics;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtIsServerListening(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtIsServerListening");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtSetAuthorizationFn(JNIEnv* km_env, jclass km_clazz, jlong authorizationfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetAuthorizationFn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authorizationfn) : -1;
#else
    (void)authorizationfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtSetCancelTimeout(JNIEnv* km_env, jclass km_clazz, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetCancelTimeout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)timeout) : -1;
#else
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtSetComTimeout(JNIEnv* km_env, jclass km_clazz, jlong binding, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetComTimeout");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)timeout) : -1;
#else
    (void)binding;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtSetServerStackSize(JNIEnv* km_env, jclass km_clazz, jint threadstacksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetServerStackSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)threadstacksize) : -1;
#else
    (void)threadstacksize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtStatsVectorFree(JNIEnv* km_env, jclass km_clazz, jlong statsvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStatsVectorFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statsvector) : -1;
#else
    (void)statsvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtStopServerListening(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStopServerListening");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcMgmtWaitServerListen(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtWaitServerListen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNetworkInqProtseqsA(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNetworkInqProtseqsW(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNetworkIsProtseqValidA(JNIEnv* km_env, jclass km_clazz, jlong protseq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq) : -1;
#else
    (void)protseq;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNetworkIsProtseqValidW(JNIEnv* km_env, jclass km_clazz, jlong protseq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq) : -1;
#else
    (void)protseq;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingExportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong bindingvec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvec, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingExportPnPA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingExportPnPW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingExportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong bindingvec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvec, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingImportBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)importcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingImportBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)importcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingImportDone(JNIEnv* km_env, jclass km_clazz, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)importcontext) : -1;
#else
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingImportNext(JNIEnv* km_env, jclass km_clazz, jlong importcontext, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)importcontext, (void*)(uintptr_t)binding) : -1;
#else
    (void)importcontext;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingInqEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingInqEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingLookupBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jint bindingmaxcount, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (uint32_t)bindingmaxcount, (void*)(uintptr_t)lookupcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingLookupBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jint bindingmaxcount, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (uint32_t)bindingmaxcount, (void*)(uintptr_t)lookupcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingLookupDone(JNIEnv* km_env, jclass km_clazz, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lookupcontext) : -1;
#else
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingLookupNext(JNIEnv* km_env, jclass km_clazz, jlong lookupcontext, jlong bindingvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lookupcontext, (void*)(uintptr_t)bindingvec) : -1;
#else
    (void)lookupcontext;
    (void)bindingvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingSelect(JNIEnv* km_env, jclass km_clazz, jlong bindingvec, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingSelect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindingvec, (void*)(uintptr_t)binding) : -1;
#else
    (void)bindingvec;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingUnexportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingUnexportPnPA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingUnexportPnPW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsBindingUnexportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryExpandNameA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong expandedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)expandedname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryExpandNameW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong expandedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)expandedname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryObjectInqBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryObjectInqBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryObjectInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsEntryObjectInqNext(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong objuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)objuuid) : -1;
#else
    (void)inquirycontext;
    (void)objuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupDeleteA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupDeleteW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrAddA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrAddW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrInqBeginA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrInqBeginW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)membername) : -1;
#else
    (void)inquirycontext;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)membername) : -1;
#else
    (void)inquirycontext;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrRemoveA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsGroupMbrRemoveW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtBindingUnexportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifid, jint versoption, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtBindingUnexportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifid, jint versoption, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryCreateA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryCreateW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryDeleteA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryDeleteW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryInqIfIdsA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtEntryInqIfIdsW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtHandleSetExpAge(JNIEnv* km_env, jclass km_clazz, jlong nshandle, jint expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtHandleSetExpAge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nshandle, (uint32_t)expirationage) : -1;
#else
    (void)nshandle;
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtInqExpAge(JNIEnv* km_env, jclass km_clazz, jlong expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtInqExpAge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)expirationage) : -1;
#else
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsMgmtSetExpAge(JNIEnv* km_env, jclass km_clazz, jint expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtSetExpAge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)expirationage) : -1;
#else
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileDeleteA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileDeleteW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltAddA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername, jint priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (uint32_t)priority, (void*)(uintptr_t)annotation) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltAddW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername, jint priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (uint32_t)priority, (void*)(uintptr_t)annotation) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltInqBeginA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jint inquirytype, jlong ifid, jint versoption, jint membernamesyntax, jlong membername, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltInqBeginW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jint inquirytype, jlong ifid, jint versoption, jint membernamesyntax, jlong membername, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqDone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong membername, jlong priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)membername, (void*)(uintptr_t)priority, (void*)(uintptr_t)annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong membername, jlong priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)membername, (void*)(uintptr_t)priority, (void*)(uintptr_t)annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltRemoveA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcNsProfileEltRemoveW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcObjectInqType(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong typeuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectInqType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)typeuuid) : -1;
#else
    (void)objuuid;
    (void)typeuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcObjectSetInqFn(JNIEnv* km_env, jclass km_clazz, jlong inquiryfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetInqFn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inquiryfn) : -1;
#else
    (void)inquiryfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcObjectSetType(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong typeuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)typeuuid) : -1;
#else
    (void)objuuid;
    (void)typeuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcProtseqVectorFreeA(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcProtseqVectorFreeW(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcRaiseException(JNIEnv* km_env, jclass km_clazz, jint exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRaiseException");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)exception);
#else
    (void)exception;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcRevertContainerImpersonation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertContainerImpersonation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcRevertToSelfEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelfEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerCompleteSecurityCallback(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerCompleteSecurityCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle, (int32_t)status) : -1;
#else
    (void)bindinghandle;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqBindingHandle(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqBindings(JNIEnv* km_env, jclass km_clazz, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindingvector) : -1;
#else
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqBindingsEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)bindingvector) : -1;
#else
    (void)securitydescriptor;
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqCallAttributesA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong rpccallattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)rpccallattributes) : -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqCallAttributesW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong rpccallattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)rpccallattributes) : -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqDefaultPrincNameA(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong princname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)princname) : -1;
#else
    (void)authnsvc;
    (void)princname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqDefaultPrincNameW(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong princname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)princname) : -1;
#else
    (void)authnsvc;
    (void)princname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInqIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqIf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupActivate(JNIEnv* km_env, jclass km_clazz, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupActivate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifgroup) : -1;
#else
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupClose(JNIEnv* km_env, jclass km_clazz, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifgroup) : -1;
#else
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupCreateA(JNIEnv* km_env, jclass km_clazz, jlong interfaces, jint numifs, jlong endpoints, jint numendpoints, jint idleperiod, jlong idlecallbackfn, jlong idlecallbackcontext, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfaces, (uint32_t)numifs, (void*)(uintptr_t)endpoints, (uint32_t)numendpoints, (uint32_t)idleperiod, (void*)(uintptr_t)idlecallbackfn, (void*)(uintptr_t)idlecallbackcontext, (void*)(uintptr_t)ifgroup) : -1;
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupCreateW(JNIEnv* km_env, jclass km_clazz, jlong interfaces, jint numifs, jlong endpoints, jint numendpoints, jint idleperiod, jlong idlecallbackfn, jlong idlecallbackcontext, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)interfaces, (uint32_t)numifs, (void*)(uintptr_t)endpoints, (uint32_t)numendpoints, (uint32_t)idleperiod, (void*)(uintptr_t)idlecallbackfn, (void*)(uintptr_t)idlecallbackcontext, (void*)(uintptr_t)ifgroup) : -1;
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupDeactivate(JNIEnv* km_env, jclass km_clazz, jlong ifgroup, jint forcedeactivation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupDeactivate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifgroup, (uint32_t)forcedeactivation) : -1;
#else
    (void)ifgroup;
    (void)forcedeactivation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerInterfaceGroupInqBindings(JNIEnv* km_env, jclass km_clazz, jlong ifgroup, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupInqBindings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifgroup, (void*)(uintptr_t)bindingvector) : -1;
#else
    (void)ifgroup;
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerListen(JNIEnv* km_env, jclass km_clazz, jint minimumcallthreads, jint maxcalls, jint dontwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerListen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)minimumcallthreads, (uint32_t)maxcalls, (uint32_t)dontwait) : -1;
#else
    (void)minimumcallthreads;
    (void)maxcalls;
    (void)dontwait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong serverprincname, jint authnsvc, jlong getkeyfn, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serverprincname, (uint32_t)authnsvc, (void*)(uintptr_t)getkeyfn, (void*)(uintptr_t)arg) : -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong serverprincname, jint authnsvc, jlong getkeyfn, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serverprincname, (uint32_t)authnsvc, (void*)(uintptr_t)getkeyfn, (void*)(uintptr_t)arg) : -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterIf2(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jint maxrpcsize, jlong ifcallbackfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (uint32_t)maxrpcsize, (void*)(uintptr_t)ifcallbackfn) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallbackfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterIf3(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jint maxrpcsize, jlong ifcallback, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (uint32_t)maxrpcsize, (void*)(uintptr_t)ifcallback, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallback;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerRegisterIfEx(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jlong ifcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIfEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (void*)(uintptr_t)ifcallback) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)ifcallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerSubscribeForNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jint notification, jint notificationtype, jlong notificationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerSubscribeForNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (int32_t)notification, (int32_t)notificationtype, (void*)(uintptr_t)notificationinfo) : -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationtype;
    (void)notificationinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerTestCancel(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerTestCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUnregisterIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jint waitforcallstocomplete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (uint32_t)waitforcallstocomplete) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)waitforcallstocomplete;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUnregisterIfEx(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jint rundowncontexthandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIfEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (int32_t)rundowncontexthandles) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)rundowncontexthandles;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUnsubscribeForNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jint notification, jlong notificationsqueued) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnsubscribeForNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binding, (int32_t)notification, (void*)(uintptr_t)notificationsqueued) : -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationsqueued;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseAllProtseqs(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseAllProtseqsEx(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseAllProtseqsIf(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseAllProtseqsIfEx(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIfEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqEpA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqEpExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqEpExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqEpW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqIfA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqIfExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqIfExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqIfW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerUseProtseqW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcServerYield(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerYield");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmAllocate(JNIEnv* km_env, jclass km_clazz, jlong size, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size, (void*)(uintptr_t)pstatus) : NULL;
#else
    (void)size;
    (void)pstatus;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmClientFree(JNIEnv* km_env, jclass km_clazz, jlong pnodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmClientFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pnodetofree) : -1;
#else
    (void)pnodetofree;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmDestroyClientContext(JNIEnv* km_env, jclass km_clazz, jlong contexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDestroyClientContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)contexthandle) : -1;
#else
    (void)contexthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmDisableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDisableAllocate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmEnableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmEnableAllocate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)nodetofree) : -1;
#else
    (void)nodetofree;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmGetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmGetThreadHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstatus) : NULL;
#else
    (void)pstatus;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmSetClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetClientAllocFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree) : -1;
#else
    (void)clientalloc;
    (void)clientfree;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmSetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetThreadHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)id) : -1;
#else
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSmSwapClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree, jlong oldclientalloc, jlong oldclientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSwapClientAllocFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree, (void*)(uintptr_t)oldclientalloc, (void*)(uintptr_t)oldclientfree) : -1;
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsContextLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong serverbindinghandle, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockExclusive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serverbindinghandle, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsContextLockShared(JNIEnv* km_env, jclass km_clazz, jlong serverbindinghandle, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockShared");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serverbindinghandle, (void*)(uintptr_t)usercontext) : -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsDestroyClientContext(JNIEnv* km_env, jclass km_clazz, jlong contexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDestroyClientContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)contexthandle);
#else
    (void)contexthandle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsDisableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDisableAllocate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsDontSerializeContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDontSerializeContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsEnableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsEnableAllocate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)nodetofree);
#else
    (void)nodetofree;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsGetContextBinding(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetContextBinding");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)contexthandle, (void*)(uintptr_t)binding) : -1;
#else
    (void)contexthandle;
    (void)binding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsGetThreadHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetThreadHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsSetClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetClientAllocFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree);
#else
    (void)clientalloc;
    (void)clientfree;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsSetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetThreadHandle");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)id);
#else
    (void)id;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcSsSwapClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree, jlong oldclientalloc, jlong oldclientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSwapClientAllocFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree, (void*)(uintptr_t)oldclientalloc, (void*)(uintptr_t)oldclientfree);
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringBindingComposeA(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong options, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)options, (void*)(uintptr_t)stringbinding) : -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringBindingComposeW(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong options, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)options, (void*)(uintptr_t)stringbinding) : -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringBindingParseA(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong networkoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)networkoptions) : -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringBindingParseW(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong networkoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)networkoptions) : -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringFreeA(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string) : -1;
#else
    (void)string;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcStringFreeW(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string) : -1;
#else
    (void)string;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcTestCancel(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcTestCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1RpcUserFree(JNIEnv* km_env, jclass km_clazz, jlong asynchandle, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcUserFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)asynchandle, (void*)(uintptr_t)pbuffer);
#else
    (void)asynchandle;
    (void)pbuffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidCompare(JNIEnv* km_env, jclass km_clazz, jlong uuid1, jlong uuid2, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCompare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid1, (void*)(uintptr_t)uuid2, (void*)(uintptr_t)status) : -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidCreate(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidCreateNil(JNIEnv* km_env, jclass km_clazz, jlong niluuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateNil");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)niluuid) : -1;
#else
    (void)niluuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidCreateSequential(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateSequential");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidEqual(JNIEnv* km_env, jclass km_clazz, jlong uuid1, jlong uuid2, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid1, (void*)(uintptr_t)uuid2, (void*)(uintptr_t)status) : -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidFromStringA(JNIEnv* km_env, jclass km_clazz, jlong stringuuid, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringuuid, (void*)(uintptr_t)uuid) : -1;
#else
    (void)stringuuid;
    (void)uuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidFromStringW(JNIEnv* km_env, jclass km_clazz, jlong stringuuid, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringuuid, (void*)(uintptr_t)uuid) : -1;
#else
    (void)stringuuid;
    (void)uuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidHash(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidHash");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)status) : 0;
#else
    (void)uuid;
    (void)status;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidIsNil(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidIsNil");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)status) : -1;
#else
    (void)uuid;
    (void)status;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidToStringA(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong stringuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)stringuuid) : -1;
#else
    (void)uuid;
    (void)stringuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1UuidToStringW(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong stringuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)stringuuid) : -1;
#else
    (void)uuid;
    (void)stringuuid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

