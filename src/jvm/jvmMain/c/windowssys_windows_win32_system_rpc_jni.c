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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1dceErrorInqTextA(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong errortext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)errortext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rpcstatus;
    (void)errortext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1dceErrorInqTextW(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong errortext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DceErrorInqTextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)errortext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rpcstatus;
    (void)errortext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iunknownAddRefProxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_AddRef_Proxy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_this);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg_0_this;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iunknownQueryInterfaceProxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_QueryInterface_Proxy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_this, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_this;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iunknownReleaseProxy(JNIEnv* km_env, jclass km_clazz, jlong arg_0_this) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_Release_Proxy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_this);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)arg_0_this;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcAllocate(JNIEnv* km_env, jclass km_clazz, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcAsyncAbortCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncAbortCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)exceptioncode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)exceptioncode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcAsyncSetHandle(JNIEnv* km_env, jclass km_clazz, jlong message, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcAsyncSetHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)pasync);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)pasync;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingCopy(JNIEnv* km_env, jclass km_clazz, jlong sourcebinding, jlong destinationbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCopy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcebinding, (void*)(uintptr_t)destinationbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcebinding;
    (void)destinationbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingCreateNp(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong servicename, jlong networkoptions, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingCreateNP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)servicename, (void*)(uintptr_t)networkoptions, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)servicename;
    (void)networkoptions;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingHandleToAsyncHandle(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong asynchandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingHandleToAsyncHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)asynchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)asynchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqClientTokenAttributes(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong tokenid, jlong authenticationid, jlong modifiedid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqClientTokenAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)tokenid, (void*)(uintptr_t)authenticationid, (void*)(uintptr_t)modifiedid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)tokenid;
    (void)authenticationid;
    (void)modifiedid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqDynamicEndpointA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong dynamicendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)dynamicendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)dynamicendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqDynamicEndpointW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong dynamicendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)dynamicendpoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)dynamicendpoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqLocalClientPid(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong pid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqLocalClientPID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)pid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)pid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqMarshalledTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong marshalledtargetinfosize, jlong marshalledtargetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqMarshalledTargetInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)marshalledtargetinfosize, (void*)(uintptr_t)marshalledtargetinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)marshalledtargetinfosize;
    (void)marshalledtargetinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong securitycontexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)securitycontexthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)securitycontexthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqSecurityContextKeyInfo(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong keyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContextKeyInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)keyinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)keyinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqTransportType(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqTransportType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingInqWireIdForSnego(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong wireid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingInqWireIdForSnego");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)wireid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)wireid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingIsClientLocal(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong clientlocalflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsClientLocal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)clientlocalflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    (void)clientlocalflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingIsServerLocal(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverlocalflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingIsServerLocal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverlocalflag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverlocalflag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingSetPrivateOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingSetPrivateOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (uint64_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcBindingToStaticStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcBindingToStaticStringBindingW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcClearMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcClearMutex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mutex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcDeleteMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcDeleteMutex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mutex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcExceptionFilter(JNIEnv* km_env, jclass km_clazz, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcExceptionFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)exceptioncode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)exceptioncode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcFree(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
    }
#else
    (void)object;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcFreePipeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcFreePipeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcGetBufferWithObject(JNIEnv* km_env, jclass km_clazz, jlong message, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetBufferWithObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)objectuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)objectuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcGetCurrentCallHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetCurrentCallHandle");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcGetDefaultSd(JNIEnv* km_env, jclass km_clazz, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetDefaultSD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcGetExtendedError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcGetExtendedError");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcIfInqTransferSyntaxes(JNIEnv* km_env, jclass km_clazz, jlong rpcifhandle, jlong transfersyntaxes, jint transfersyntaxsize, jlong transfersyntaxcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcIfInqTransferSyntaxes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rpcifhandle, (void*)(uintptr_t)transfersyntaxes, (uint32_t)transfersyntaxsize, (void*)(uintptr_t)transfersyntaxcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rpcifhandle;
    (void)transfersyntaxes;
    (void)transfersyntaxsize;
    (void)transfersyntaxcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcMapWin32Status(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMapWin32Status");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcMgmtEnableDedicatedThreadPool(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcMgmtEnableDedicatedThreadPool");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNegotiateTransferSyntax(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNegotiateTransferSyntax");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsBindingSetEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsBindingSetEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsGetBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsInterfaceExported(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong rpcinterfaceinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceExported");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)rpcinterfaceinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsInterfaceUnexported(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong rpcinterfaceinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsInterfaceUnexported");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)rpcinterfaceinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsRaiseException(JNIEnv* km_env, jclass km_clazz, jlong message, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsRaiseException");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)message, (int32_t)status);
    } else {
        errno = ENOSYS;
    }
#else
    (void)message;
    (void)status;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcNsSendReceive(JNIEnv* km_env, jclass km_clazz, jlong message, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcNsSendReceive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcOpenClientProcess(JNIEnv* km_env, jclass km_clazz, jlong binding, jint desiredaccess, jlong clientprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcOpenClientProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)desiredaccess, (void*)(uintptr_t)clientprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)desiredaccess;
    (void)clientprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcPauseExecution(JNIEnv* km_env, jclass km_clazz, jint milliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcPauseExecution");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)milliseconds);
    } else {
        errno = ENOSYS;
    }
#else
    (void)milliseconds;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcReBindBuffer(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReBindBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcReallocPipeBuffer(JNIEnv* km_env, jclass km_clazz, jlong message, jint newsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReallocPipeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (uint32_t)newsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)newsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcReceive(JNIEnv* km_env, jclass km_clazz, jlong message, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcReceive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcRecordCalloutFailure(JNIEnv* km_env, jclass km_clazz, jint rpcstatus, jlong calloutstate, jlong dllname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRecordCalloutFailure");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)rpcstatus, (void*)(uintptr_t)calloutstate, (void*)(uintptr_t)dllname);
    } else {
        errno = ENOSYS;
    }
#else
    (void)rpcstatus;
    (void)calloutstate;
    (void)dllname;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcRequestMutex(JNIEnv* km_env, jclass km_clazz, jlong mutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcRequestMutex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mutex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mutex;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcSend(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSend");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcSendReceive(JNIEnv* km_env, jclass km_clazz, jlong message) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSendReceive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)message);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)message;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerCheckClientRestriction(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerCheckClientRestriction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerDisableExceptionFilter(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerDisableExceptionFilter");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerGetAssociationId(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong associationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerGetAssociationID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)associationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)associationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerInqAddressChangeFn(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqAddressChangeFn");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerInqLocalConnAddress(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong buffer, jlong buffersize, jlong addressformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqLocalConnAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)addressformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerInqRemoteConnAddress(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong buffer, jlong buffersize, jlong addressformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqRemoteConnAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)addressformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerInqTransportType(JNIEnv* km_env, jclass km_clazz, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerInqTransportType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerRegisterForwardFunction(JNIEnv* km_env, jclass km_clazz, jlong pforwardfunction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerRegisterForwardFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pforwardfunction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pforwardfunction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerSetAddressChangeFn(JNIEnv* km_env, jclass km_clazz, jlong paddresschangefn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSetAddressChangeFn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)paddresschangefn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)paddresschangefn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerStartService(JNIEnv* km_env, jclass km_clazz, jlong protseq, jlong endpoint, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerStartService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)ifspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)endpoint;
    (void)ifspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerSubscribeForDisconnectNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerSubscribeForDisconnectNotification2(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong hevent, jlong subscriptionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)hevent, (void*)(uintptr_t)subscriptionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)hevent;
    (void)subscriptionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerUseProtseq2A(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerUseProtseq2W(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerUseProtseqEp2A(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcServerUseProtseqEp2W(JNIEnv* km_env, jclass km_clazz, jlong networkaddress, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)networkaddress, (void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcSessionStrictContextHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSessionStrictContextHandle");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcSsDontSerializeContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSsDontSerializeContext");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcSystemHandleTypeSpecificWork(JNIEnv* km_env, jclass km_clazz, jlong handle, jbyte actualtype, jbyte idltype, jint marshaldirection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcSystemHandleTypeSpecificWork");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint8_t)actualtype, (uint8_t)idltype, (int32_t)marshaldirection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)actualtype;
    (void)idltype;
    (void)marshaldirection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iRpcTurnOnEeinfoPropagation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_RpcTurnOnEEInfoPropagation");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1iUuidCreate(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "I_UuidCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesBufferHandleReset(JNIEnv* km_env, jclass km_clazz, jlong handle, jint handlestyle, jint operation, jlong pbuffer, jint buffersize, jlong pencodedsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesBufferHandleReset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)handlestyle, (int32_t)operation, (void*)(uintptr_t)pbuffer, (uint32_t)buffersize, (void*)(uintptr_t)pencodedsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)handlestyle;
    (void)operation;
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesDecodeBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint buffersize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeBufferHandleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)phandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    (void)buffersize;
    (void)phandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesDecodeIncrementalHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong userstate, jlong readfn, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesDecodeIncrementalHandleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)userstate, (void*)(uintptr_t)readfn, (void*)(uintptr_t)phandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)userstate;
    (void)readfn;
    (void)phandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesEncodeDynBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jlong pencodedsize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeDynBufferHandleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pencodedsize, (void*)(uintptr_t)phandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbuffer;
    (void)pencodedsize;
    (void)phandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesEncodeFixedBufferHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jint buffersize, jlong pencodedsize, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeFixedBufferHandleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuffer, (uint32_t)buffersize, (void*)(uintptr_t)pencodedsize, (void*)(uintptr_t)phandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    (void)phandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesEncodeIncrementalHandleCreate(JNIEnv* km_env, jclass km_clazz, jlong userstate, jlong allocfn, jlong writefn, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesEncodeIncrementalHandleCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)userstate, (void*)(uintptr_t)allocfn, (void*)(uintptr_t)writefn, (void*)(uintptr_t)phandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)phandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesHandleFree(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesHandleFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesIncrementalHandleReset(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong userstate, jlong allocfn, jlong writefn, jlong readfn, jint operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesIncrementalHandleReset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)userstate, (void*)(uintptr_t)allocfn, (void*)(uintptr_t)writefn, (void*)(uintptr_t)readfn, (int32_t)operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)readfn;
    (void)operation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1mesInqProcEncodingId(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pinterfaceid, jlong pprocnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MesInqProcEncodingId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pinterfaceid, (void*)(uintptr_t)pprocnum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)pinterfaceid;
    (void)pprocnum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRCContextBinding(JNIEnv* km_env, jclass km_clazz, jlong ccontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextBinding");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ccontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ccontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRCContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong ccontext, jlong pbuff) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ccontext, (void*)(uintptr_t)pbuff);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ccontext;
    (void)pbuff;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRCContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pccontext, jlong hbinding, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRCContextUnmarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pccontext, (void*)(uintptr_t)hbinding, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pccontext;
    (void)hbinding;
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong ccontext, jlong pbuff, jlong userrundownin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextMarshall2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong ccontext, jlong pbuff, jlong userrundownin, jlong ctxguard, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshall2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin, (void*)(uintptr_t)ctxguard, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    (void)ctxguard;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextMarshallEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong ccontext, jlong pbuff, jlong userrundownin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextMarshallEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)ccontext, (void*)(uintptr_t)pbuff, (void*)(uintptr_t)userrundownin);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbuff, (uint32_t)datarepresentation);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextUnmarshall2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong pbuff, jint datarepresentation, jlong ctxguard, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshall2");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation, (void*)(uintptr_t)ctxguard, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    (void)ctxguard;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1nDRSContextUnmarshallEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jlong pbuff, jint datarepresentation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NDRSContextUnmarshallEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle, (void*)(uintptr_t)pbuff, (uint32_t)datarepresentation);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndr64AsyncServerCall64(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCall64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndr64AsyncServerCallAll(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64AsyncServerCallAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndr64DcomAsyncStubCall(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Ndr64DcomAsyncStubCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrAllocate(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong len) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint64_t)len);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)len;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrAsyncServerCall(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrAsyncServerCall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrByteCountPointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrByteCountPointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrByteCountPointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrByteCountPointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrByteCountPointerUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrClearOutParameters(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat, jlong argaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClearOutParameters");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat, (void*)(uintptr_t)argaddr);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    (void)argaddr;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrClientContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jint fcheck) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (int64_t)contexthandle, (int32_t)fcheck);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)fcheck;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrClientContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pcontexthandle, jlong bindhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientContextUnmarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pcontexthandle, (void*)(uintptr_t)bindhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pcontexthandle;
    (void)bindhandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrClientInitialize(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint procnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)procnum);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrClientInitializeNew(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint procnum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrClientInitializeNew");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)procnum);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexArrayUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrComplexStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrComplexStructUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantArrayUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStringBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStringMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStringMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStringUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStringUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantStructUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingArrayUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConformantVaryingStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConformantVaryingStructUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrContextHandleInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleInitialize");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrContextHandleSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrContextHandleSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConvert(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrConvert2(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat, jint numberparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrConvert2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat, (int32_t)numberparams);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    (void)numberparams;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrCorrelationFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrCorrelationInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jint cachesize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint32_t)cachesize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)cachesize;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrCorrelationPass(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCorrelationPass");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrCreateServerInterfaceFromStub(JNIEnv* km_env, jclass km_clazz, jlong pstub, jlong pserverif) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrCreateServerInterfaceFromStub");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstub, (void*)(uintptr_t)pserverif);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstub;
    (void)pserverif;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrDcomAsyncStubCall(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrDcomAsyncStubCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrEncapsulatedUnionBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrEncapsulatedUnionFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrEncapsulatedUnionMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrEncapsulatedUnionMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrEncapsulatedUnionUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrEncapsulatedUnionUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFixedArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFixedArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFixedArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFixedArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFixedArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFixedArrayUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFreeBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFullPointerXlatFree(JNIEnv* km_env, jclass km_clazz, jlong pxlattables) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pxlattables);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pxlattables;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrFullPointerXlatInit(JNIEnv* km_env, jclass km_clazz, jint numberofpointers, jint xlatside) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrFullPointerXlatInit");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)numberofpointers, (int32_t)xlatside);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)numberofpointers;
    (void)xlatside;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jint bufferlength, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetBuffer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint32_t)bufferlength, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrGetDcomProtocolVersion(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetDcomProtocolVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstubmsg;
    (void)pversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrGetUserMarshalInfo(JNIEnv* km_env, jclass km_clazz, jlong pflags, jint informationlevel, jlong pmarshalinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrGetUserMarshalInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflags, (uint32_t)informationlevel, (void*)(uintptr_t)pmarshalinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pflags;
    (void)informationlevel;
    (void)pmarshalinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrInterfacePointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrInterfacePointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrInterfacePointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrInterfacePointerMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrInterfacePointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrInterfacePointerUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMapCommAndFaultStatus(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pcommstatus, jlong pfaultstatus, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMapCommAndFaultStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pcommstatus, (void*)(uintptr_t)pfaultstatus, (int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstubmsg;
    (void)pcommstatus;
    (void)pfaultstatus;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesProcEncodeDecode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesProcEncodeDecode");
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring); break;
            case 1: km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (intptr_t)km_va0); break;
            case 2: km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeAlignSize(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSize");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeAlignSizeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSizeAll");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)pproxyinfo;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeDecode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pobject, (int16_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeDecodeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecodeAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)pobject, (int16_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeEncode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pobject, (int16_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pstubdesc;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesSimpleTypeEncodeAll(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pproxyinfo, jlong pobject, jshort size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncodeAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)pobject, (int16_t)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeAlignSize(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeAlignSize2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize2");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeAlignSize3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeAlignSize3");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeDecode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeDecode2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeDecode3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeDecode3");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeEncode(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeEncode2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeEncode3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeEncode3");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeFree2(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pstubdesc, jlong pformatstring, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pstubdesc, (void*)(uintptr_t)pformatstring, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrMesTypeFree3(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong ppicklinginfo, jlong pproxyinfo, jlong arrtypeoffset, jint ntypeindex, jlong pobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrMesTypeFree3");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)ppicklinginfo, (void*)(uintptr_t)pproxyinfo, (void*)(uintptr_t)arrtypeoffset, (uint32_t)ntypeindex, (void*)(uintptr_t)pobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonConformantStringBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonConformantStringMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonConformantStringMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonConformantStringUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonConformantStringUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonEncapsulatedUnionBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonEncapsulatedUnionFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonEncapsulatedUnionMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonEncapsulatedUnionMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNonEncapsulatedUnionUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNsGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jint bufferlength, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsGetBuffer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (uint32_t)bufferlength, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrNsSendReceive(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pbufferend, jlong pautohandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrNsSendReceive");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pbufferend, (void*)(uintptr_t)pautohandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pbufferend;
    (void)pautohandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrOleAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrOleFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrOleFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nodetofree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPartialIgnoreClientBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPartialIgnoreClientMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreClientMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPartialIgnoreServerInitialize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPartialIgnoreServerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPartialIgnoreServerUnmarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPointerBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPointerFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPointerMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPointerMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrPointerUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrPointerUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRangeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRangeUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSmClientAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSmClientFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmClientFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nodetofree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSmSetClientToOsf(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSmSetClientToOsf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmessage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSsDefaultAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSsDefaultFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDefaultFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nodetofree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSsDisableAllocate(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsDisableAllocate");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmessage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrRpcSsEnableAllocate(JNIEnv* km_env, jclass km_clazz, jlong pmessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrRpcSsEnableAllocate");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pmessage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pmessage;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSendReceive(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pbufferend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSendReceive");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pbufferend);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pbufferend;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerCall2(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCall2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerCallAll(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerCallNdr64(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerCallNdr64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerContextMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jlong rundownroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)contexthandle, (void*)(uintptr_t)rundownroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerContextNewMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong contexthandle, jlong rundownroutine, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)contexthandle, (void*)(uintptr_t)rundownroutine, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerContextNewUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextNewUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerContextUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerContextUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerInitialize(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitialize");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerInitializeMarshall(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerInitializeNew(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeNew");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerInitializePartial(JNIEnv* km_env, jclass km_clazz, jlong prpcmsg, jlong pstubmsg, jlong pstubdescriptor, jint requestedbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializePartial");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (uint32_t)requestedbuffersize);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)requestedbuffersize;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrServerInitializeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pstubdescriptor, jlong prpcmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrServerInitializeUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pstubdescriptor, (void*)(uintptr_t)prpcmsg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)prpcmsg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleStructBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleStructFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleStructMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleStructMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleStructUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleStructUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleTypeMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeMarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint8_t)formatchar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrSimpleTypeUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrSimpleTypeUnmarshall");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (uint8_t)formatchar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrStubCall2(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrStubCall3(JNIEnv* km_env, jclass km_clazz, jlong pthis, jlong pchannel, jlong prpcmsg, jlong pdwstubphase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrStubCall3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pthis, (void*)(uintptr_t)pchannel, (void*)(uintptr_t)prpcmsg, (void*)(uintptr_t)pdwstubphase);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalSimpleTypeConvert(JNIEnv* km_env, jclass km_clazz, jlong pflags, jlong pbuffer, jbyte formatchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalSimpleTypeConvert");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflags, (void*)(uintptr_t)pbuffer, (uint8_t)formatchar);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pflags;
    (void)pbuffer;
    (void)formatchar;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrUserMarshalUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrUserMarshalUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrVaryingArrayBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrVaryingArrayFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrVaryingArrayMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrVaryingArrayMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrVaryingArrayUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrVaryingArrayUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrXmitOrRepAsBufferSize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsBufferSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrXmitOrRepAsFree(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrXmitOrRepAsMarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pmemory, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pmemory, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrXmitOrRepAsMemorySize(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong pformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsMemorySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)pformat);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pstubmsg;
    (void)pformat;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1ndrXmitOrRepAsUnmarshall(JNIEnv* km_env, jclass km_clazz, jlong pstubmsg, jlong ppmemory, jlong pformat, jbyte fmustalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NdrXmitOrRepAsUnmarshall");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstubmsg, (void*)(uintptr_t)ppmemory, (void*)(uintptr_t)pformat, (uint8_t)fmustalloc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncAbortCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncAbortCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)exceptioncode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)exceptioncode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncCancelCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint fabort) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCancelCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (int32_t)fabort);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)fabort;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncCompleteCall(JNIEnv* km_env, jclass km_clazz, jlong pasync, jlong reply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncCompleteCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (void*)(uintptr_t)reply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)reply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncGetCallStatus(JNIEnv* km_env, jclass km_clazz, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncGetCallStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncInitializeHandle(JNIEnv* km_env, jclass km_clazz, jlong pasync, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncInitializeHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcAsyncRegisterInfo(JNIEnv* km_env, jclass km_clazz, jlong pasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcAsyncRegisterInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingBind(JNIEnv* km_env, jclass km_clazz, jlong pasync, jlong binding, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingBind");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pasync, (void*)(uintptr_t)binding, (void*)(uintptr_t)ifspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pasync;
    (void)binding;
    (void)ifspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingCopy(JNIEnv* km_env, jclass km_clazz, jlong sourcebinding, jlong destinationbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCopy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcebinding, (void*)(uintptr_t)destinationbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcebinding;
    (void)destinationbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingCreateA(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jlong security, jlong options, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_template, (void*)(uintptr_t)security, (void*)(uintptr_t)options, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingCreateW(JNIEnv* km_env, jclass km_clazz, jlong arg_0_template, jlong security, jlong options, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingCreateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg_0_template, (void*)(uintptr_t)security, (void*)(uintptr_t)options, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingFree(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingFromStringBindingA(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringbinding;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingFromStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingFromStringBindingW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringbinding;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthClientA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthClientExA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthClientExW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthClientW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong privs, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthClientW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)privs, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthInfoExA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc, jint rpcqosversion, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc, (uint32_t)rpcqosversion, (void*)(uintptr_t)securityqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthInfoExW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc, jint rpcqosversion, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc, (uint32_t)rpcqosversion, (void*)(uintptr_t)securityqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)rpcqosversion;
    (void)securityqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jlong authnlevel, jlong authnsvc, jlong authidentity, jlong authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (void*)(uintptr_t)authnlevel, (void*)(uintptr_t)authnsvc, (void*)(uintptr_t)authidentity, (void*)(uintptr_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqMaxCalls(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong maxcalls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqMaxCalls");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)maxcalls);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)maxcalls;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqObject(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingInqOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong poptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingInqOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (void*)(uintptr_t)poptionvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbinding;
    (void)option;
    (void)poptionvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingReset(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingReset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingServerFromClient(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong serverbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingServerFromClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)serverbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)serverbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetAuthInfoExA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc, (void*)(uintptr_t)securityqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetAuthInfoExW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc, jlong securityqos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc, (void*)(uintptr_t)securityqos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    (void)securityqos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong serverprincname, jint authnlevel, jint authnsvc, jlong authidentity, jint authzsvc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)serverprincname, (uint32_t)authnlevel, (uint32_t)authnsvc, (void*)(uintptr_t)authidentity, (uint32_t)authzsvc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetObject(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingSetOption(JNIEnv* km_env, jclass km_clazz, jlong hbinding, jint option, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingSetOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbinding, (uint32_t)option, (uint64_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingToStringBindingA(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingToStringBindingW(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingToStringBindingW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)stringbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)stringbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingUnbind(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingUnbind");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcBindingVectorFree(JNIEnv* km_env, jclass km_clazz, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcBindingVectorFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindingvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindingvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcCancelThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcCancelThreadEx(JNIEnv* km_env, jclass km_clazz, jlong thread, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCancelThreadEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (int32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcCertGeneratePrincipalNameA(JNIEnv* km_env, jclass km_clazz, jlong context, jint flags, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)flags, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcCertGeneratePrincipalNameW(JNIEnv* km_env, jclass km_clazz, jlong context, jint flags, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (uint32_t)flags, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpRegisterA(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpRegisterNoReplaceA(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpRegisterNoReplaceW(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpRegisterW(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpRegisterW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpResolveBinding(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong ifspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpResolveBinding");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)ifspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)ifspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcEpUnregister(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong bindingvector, jlong uuidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcEpUnregister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvector, (void*)(uintptr_t)uuidvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorAddRecord(JNIEnv* km_env, jclass km_clazz, jlong errorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorAddRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)errorinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)errorinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorClearInformation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorClearInformation");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorEndEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorEndEnumeration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorGetNextRecord(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jint copystrings, jlong errorinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNextRecord");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle, (int32_t)copystrings, (void*)(uintptr_t)errorinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    (void)copystrings;
    (void)errorinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorGetNumberOfRecords(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jlong records) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorGetNumberOfRecords");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle, (void*)(uintptr_t)records);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    (void)records;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorLoadErrorInfo(JNIEnv* km_env, jclass km_clazz, jlong errorblob, jlong blobsize, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorLoadErrorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)errorblob, (uint64_t)blobsize, (void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)errorblob;
    (void)blobsize;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorResetEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorResetEnumeration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorSaveErrorInfo(JNIEnv* km_env, jclass km_clazz, jlong enumhandle, jlong errorblob, jlong blobsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorSaveErrorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle, (void*)(uintptr_t)errorblob, (void*)(uintptr_t)blobsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    (void)errorblob;
    (void)blobsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcErrorStartEnumeration(JNIEnv* km_env, jclass km_clazz, jlong enumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcErrorStartEnumeration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcExceptionFilter(JNIEnv* km_env, jclass km_clazz, jint exceptioncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcExceptionFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)exceptioncode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)exceptioncode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcFreeAuthorizationContext(JNIEnv* km_env, jclass km_clazz, jlong pauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcFreeAuthorizationContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauthzclientcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pauthzclientcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcIfIdVectorFree(JNIEnv* km_env, jclass km_clazz, jlong ifidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfIdVectorFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifidvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifidvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcIfInqId(JNIEnv* km_env, jclass km_clazz, jlong rpcifhandle, jlong rpcifid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcIfInqId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rpcifhandle, (void*)(uintptr_t)rpcifid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rpcifhandle;
    (void)rpcifid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcImpersonateClient2(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClient2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcImpersonateClientContainer(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcImpersonateClientContainer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEnableIdleCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEnableIdleCleanup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEpEltInqBegin(JNIEnv* km_env, jclass km_clazz, jlong epbinding, jint inquirytype, jlong ifid, jint versoption, jlong objectuuid, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqBegin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)epbinding, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)epbinding;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)objectuuid;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEpEltInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEpEltInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong binding, jlong objectuuid, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEpEltInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong binding, jlong objectuuid, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtEpUnregister(JNIEnv* km_env, jclass km_clazz, jlong epbinding, jlong ifid, jlong binding, jlong objectuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtEpUnregister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)epbinding, (void*)(uintptr_t)ifid, (void*)(uintptr_t)binding, (void*)(uintptr_t)objectuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)epbinding;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqComTimeout(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqComTimeout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqDefaultProtectLevel(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong authnlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqDefaultProtectLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)authnlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authnsvc;
    (void)authnlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqIfIds(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong ifidvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqIfIds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)ifidvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)ifidvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqServerPrincNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint authnsvc, jlong serverprincname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)authnsvc, (void*)(uintptr_t)serverprincname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqServerPrincNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint authnsvc, jlong serverprincname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)authnsvc, (void*)(uintptr_t)serverprincname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtInqStats(JNIEnv* km_env, jclass km_clazz, jlong binding, jlong statistics) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtInqStats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (void*)(uintptr_t)statistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)statistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtIsServerListening(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtIsServerListening");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtSetAuthorizationFn(JNIEnv* km_env, jclass km_clazz, jlong authorizationfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetAuthorizationFn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authorizationfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authorizationfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtSetCancelTimeout(JNIEnv* km_env, jclass km_clazz, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetCancelTimeout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtSetComTimeout(JNIEnv* km_env, jclass km_clazz, jlong binding, jint timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetComTimeout");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtSetServerStackSize(JNIEnv* km_env, jclass km_clazz, jint threadstacksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtSetServerStackSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)threadstacksize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadstacksize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtStatsVectorFree(JNIEnv* km_env, jclass km_clazz, jlong statsvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStatsVectorFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)statsvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statsvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtStopServerListening(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtStopServerListening");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcMgmtWaitServerListen(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcMgmtWaitServerListen");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNetworkInqProtseqsA(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseqvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseqvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNetworkInqProtseqsW(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseqvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseqvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNetworkIsProtseqValidA(JNIEnv* km_env, jclass km_clazz, jlong protseq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNetworkIsProtseqValidW(JNIEnv* km_env, jclass km_clazz, jlong protseq) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingExportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong bindingvec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvec, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingExportPnPA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingExportPnPW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportPnPW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingExportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong bindingvec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingExportW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)bindingvec, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingImportBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)importcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingImportBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)importcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingImportDone(JNIEnv* km_env, jclass km_clazz, jlong importcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)importcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)importcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingImportNext(JNIEnv* km_env, jclass km_clazz, jlong importcontext, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingImportNext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)importcontext, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)importcontext;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingInqEntryNameA(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingInqEntryNameW(JNIEnv* km_env, jclass km_clazz, jlong binding, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingLookupBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jint bindingmaxcount, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (uint32_t)bindingmaxcount, (void*)(uintptr_t)lookupcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingLookupBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objuuid, jint bindingmaxcount, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objuuid, (uint32_t)bindingmaxcount, (void*)(uintptr_t)lookupcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingLookupDone(JNIEnv* km_env, jclass km_clazz, jlong lookupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lookupcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lookupcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingLookupNext(JNIEnv* km_env, jclass km_clazz, jlong lookupcontext, jlong bindingvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingLookupNext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lookupcontext, (void*)(uintptr_t)bindingvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lookupcontext;
    (void)bindingvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingSelect(JNIEnv* km_env, jclass km_clazz, jlong bindingvec, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingSelect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindingvec, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindingvec;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingUnexportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingUnexportPnPA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingUnexportPnPW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsBindingUnexportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifspec, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsBindingUnexportW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryExpandNameA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong expandedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)expandedname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryExpandNameW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong expandedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryExpandNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)expandedname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryObjectInqBeginA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryObjectInqBeginW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryObjectInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsEntryObjectInqNext(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong objuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsEntryObjectInqNext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)objuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)objuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupDeleteA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupDeleteW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupDeleteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrAddA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrAddW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrAddW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrInqBeginA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrInqBeginW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrRemoveA(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsGroupMbrRemoveW(JNIEnv* km_env, jclass km_clazz, jint groupnamesyntax, jlong groupname, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)groupnamesyntax, (void*)(uintptr_t)groupname, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtBindingUnexportA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifid, jint versoption, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtBindingUnexportW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifid, jint versoption, jlong objectuuidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifid, (uint32_t)versoption, (void*)(uintptr_t)objectuuidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryCreateA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryCreateW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryDeleteA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryDeleteW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryInqIfIdsA(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtEntryInqIfIdsW(JNIEnv* km_env, jclass km_clazz, jint entrynamesyntax, jlong entryname, jlong ifidvec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)entrynamesyntax, (void*)(uintptr_t)entryname, (void*)(uintptr_t)ifidvec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtHandleSetExpAge(JNIEnv* km_env, jclass km_clazz, jlong nshandle, jint expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtHandleSetExpAge");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nshandle, (uint32_t)expirationage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nshandle;
    (void)expirationage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtInqExpAge(JNIEnv* km_env, jclass km_clazz, jlong expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtInqExpAge");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)expirationage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)expirationage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsMgmtSetExpAge(JNIEnv* km_env, jclass km_clazz, jint expirationage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsMgmtSetExpAge");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)expirationage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)expirationage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileDeleteA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileDeleteW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileDeleteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltAddA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername, jint priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (uint32_t)priority, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltAddW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername, jint priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltAddW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (uint32_t)priority, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltInqBeginA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jint inquirytype, jlong ifid, jint versoption, jint membernamesyntax, jlong membername, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltInqBeginW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jint inquirytype, jlong ifid, jint versoption, jint membernamesyntax, jlong membername, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (uint32_t)inquirytype, (void*)(uintptr_t)ifid, (uint32_t)versoption, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername, (void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)membernamesyntax;
    (void)membername;
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltInqDone(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqDone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltInqNextA(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong membername, jlong priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)membername, (void*)(uintptr_t)priority, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltInqNextW(JNIEnv* km_env, jclass km_clazz, jlong inquirycontext, jlong ifid, jlong membername, jlong priority, jlong annotation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquirycontext, (void*)(uintptr_t)ifid, (void*)(uintptr_t)membername, (void*)(uintptr_t)priority, (void*)(uintptr_t)annotation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltRemoveA(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcNsProfileEltRemoveW(JNIEnv* km_env, jclass km_clazz, jint profilenamesyntax, jlong profilename, jlong ifid, jint membernamesyntax, jlong membername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)profilenamesyntax, (void*)(uintptr_t)profilename, (void*)(uintptr_t)ifid, (uint32_t)membernamesyntax, (void*)(uintptr_t)membername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcObjectInqType(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong typeuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectInqType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)typeuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objuuid;
    (void)typeuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcObjectSetInqFn(JNIEnv* km_env, jclass km_clazz, jlong inquiryfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetInqFn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inquiryfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inquiryfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcObjectSetType(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong typeuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcObjectSetType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)typeuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objuuid;
    (void)typeuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcProtseqVectorFreeA(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseqvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseqvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcProtseqVectorFreeW(JNIEnv* km_env, jclass km_clazz, jlong protseqvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcProtseqVectorFreeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseqvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseqvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcRaiseException(JNIEnv* km_env, jclass km_clazz, jint exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRaiseException");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)exception);
    } else {
        errno = ENOSYS;
    }
#else
    (void)exception;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcRevertContainerImpersonation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertContainerImpersonation");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelf");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcRevertToSelfEx(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcRevertToSelfEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerCompleteSecurityCallback(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerCompleteSecurityCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle, (int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqBindingHandle(JNIEnv* km_env, jclass km_clazz, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqBindings(JNIEnv* km_env, jclass km_clazz, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindingvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindingvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqBindingsEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqBindingsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)bindingvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)bindingvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqCallAttributesA(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong rpccallattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)rpccallattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)rpccallattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqCallAttributesW(JNIEnv* km_env, jclass km_clazz, jlong clientbinding, jlong rpccallattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqCallAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientbinding, (void*)(uintptr_t)rpccallattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientbinding;
    (void)rpccallattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqDefaultPrincNameA(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong princname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)princname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authnsvc;
    (void)princname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqDefaultPrincNameW(JNIEnv* km_env, jclass km_clazz, jint authnsvc, jlong princname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)authnsvc, (void*)(uintptr_t)princname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authnsvc;
    (void)princname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInqIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInqIf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupActivate(JNIEnv* km_env, jclass km_clazz, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupActivate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupClose(JNIEnv* km_env, jclass km_clazz, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupCreateA(JNIEnv* km_env, jclass km_clazz, jlong interfaces, jint numifs, jlong endpoints, jint numendpoints, jint idleperiod, jlong idlecallbackfn, jlong idlecallbackcontext, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaces, (uint32_t)numifs, (void*)(uintptr_t)endpoints, (uint32_t)numendpoints, (uint32_t)idleperiod, (void*)(uintptr_t)idlecallbackfn, (void*)(uintptr_t)idlecallbackcontext, (void*)(uintptr_t)ifgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupCreateW(JNIEnv* km_env, jclass km_clazz, jlong interfaces, jint numifs, jlong endpoints, jint numendpoints, jint idleperiod, jlong idlecallbackfn, jlong idlecallbackcontext, jlong ifgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)interfaces, (uint32_t)numifs, (void*)(uintptr_t)endpoints, (uint32_t)numendpoints, (uint32_t)idleperiod, (void*)(uintptr_t)idlecallbackfn, (void*)(uintptr_t)idlecallbackcontext, (void*)(uintptr_t)ifgroup);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)interfaces;
    (void)numifs;
    (void)endpoints;
    (void)numendpoints;
    (void)idleperiod;
    (void)idlecallbackfn;
    (void)idlecallbackcontext;
    (void)ifgroup;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupDeactivate(JNIEnv* km_env, jclass km_clazz, jlong ifgroup, jint forcedeactivation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupDeactivate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifgroup, (uint32_t)forcedeactivation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifgroup;
    (void)forcedeactivation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerInterfaceGroupInqBindings(JNIEnv* km_env, jclass km_clazz, jlong ifgroup, jlong bindingvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerInterfaceGroupInqBindings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifgroup, (void*)(uintptr_t)bindingvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifgroup;
    (void)bindingvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerListen(JNIEnv* km_env, jclass km_clazz, jint minimumcallthreads, jint maxcalls, jint dontwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerListen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)minimumcallthreads, (uint32_t)maxcalls, (uint32_t)dontwait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)minimumcallthreads;
    (void)maxcalls;
    (void)dontwait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterAuthInfoA(JNIEnv* km_env, jclass km_clazz, jlong serverprincname, jint authnsvc, jlong getkeyfn, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serverprincname, (uint32_t)authnsvc, (void*)(uintptr_t)getkeyfn, (void*)(uintptr_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterAuthInfoW(JNIEnv* km_env, jclass km_clazz, jlong serverprincname, jint authnsvc, jlong getkeyfn, jlong arg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serverprincname, (uint32_t)authnsvc, (void*)(uintptr_t)getkeyfn, (void*)(uintptr_t)arg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterIf2(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jint maxrpcsize, jlong ifcallbackfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (uint32_t)maxrpcsize, (void*)(uintptr_t)ifcallbackfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallbackfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterIf3(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jint maxrpcsize, jlong ifcallback, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIf3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (uint32_t)maxrpcsize, (void*)(uintptr_t)ifcallback, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)maxrpcsize;
    (void)ifcallback;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerRegisterIfEx(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jlong mgrepv, jint flags, jint maxcalls, jlong ifcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerRegisterIfEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (void*)(uintptr_t)mgrepv, (uint32_t)flags, (uint32_t)maxcalls, (void*)(uintptr_t)ifcallback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)ifcallback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerSubscribeForNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jint notification, jint notificationtype, jlong notificationinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerSubscribeForNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (int32_t)notification, (int32_t)notificationtype, (void*)(uintptr_t)notificationinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)notification;
    (void)notificationtype;
    (void)notificationinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerTestCancel(JNIEnv* km_env, jclass km_clazz, jlong bindinghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerTestCancel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bindinghandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bindinghandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUnregisterIf(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jint waitforcallstocomplete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (uint32_t)waitforcallstocomplete);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)waitforcallstocomplete;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUnregisterIfEx(JNIEnv* km_env, jclass km_clazz, jlong ifspec, jlong mgrtypeuuid, jint rundowncontexthandles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnregisterIfEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ifspec, (void*)(uintptr_t)mgrtypeuuid, (int32_t)rundowncontexthandles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)rundowncontexthandles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUnsubscribeForNotification(JNIEnv* km_env, jclass km_clazz, jlong binding, jint notification, jlong notificationsqueued) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUnsubscribeForNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)binding, (int32_t)notification, (void*)(uintptr_t)notificationsqueued);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)binding;
    (void)notification;
    (void)notificationsqueued;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseAllProtseqs(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseAllProtseqsEx(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseAllProtseqsIf(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseAllProtseqsIfEx(JNIEnv* km_env, jclass km_clazz, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIfEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqEpA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqEpExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqEpExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqEpW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong endpoint, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqEpW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqIfA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqIfExA(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqIfExW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqIfW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong ifspec, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqIfW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)ifspec, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerUseProtseqW(JNIEnv* km_env, jclass km_clazz, jlong protseq, jint maxcalls, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerUseProtseqW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)protseq, (uint32_t)maxcalls, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcServerYield(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcServerYield");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmAllocate(JNIEnv* km_env, jclass km_clazz, jlong size, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size, (void*)(uintptr_t)pstatus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    (void)pstatus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmClientFree(JNIEnv* km_env, jclass km_clazz, jlong pnodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmClientFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pnodetofree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pnodetofree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmDestroyClientContext(JNIEnv* km_env, jclass km_clazz, jlong contexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDestroyClientContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contexthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contexthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmDisableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmDisableAllocate");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmEnableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmEnableAllocate");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)nodetofree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nodetofree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmGetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmGetThreadHandle");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstatus);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pstatus;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmSetClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetClientAllocFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientalloc;
    (void)clientfree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmSetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSetThreadHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSmSwapClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree, jlong oldclientalloc, jlong oldclientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSmSwapClientAllocFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree, (void*)(uintptr_t)oldclientalloc, (void*)(uintptr_t)oldclientfree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsAllocate(JNIEnv* km_env, jclass km_clazz, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsAllocate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsContextLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong serverbindinghandle, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockExclusive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serverbindinghandle, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serverbindinghandle;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsContextLockShared(JNIEnv* km_env, jclass km_clazz, jlong serverbindinghandle, jlong usercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsContextLockShared");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serverbindinghandle, (void*)(uintptr_t)usercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serverbindinghandle;
    (void)usercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsDestroyClientContext(JNIEnv* km_env, jclass km_clazz, jlong contexthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDestroyClientContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)contexthandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)contexthandle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsDisableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDisableAllocate");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsDontSerializeContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsDontSerializeContext");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsEnableAllocate(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsEnableAllocate");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsFree(JNIEnv* km_env, jclass km_clazz, jlong nodetofree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nodetofree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nodetofree;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsGetContextBinding(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jlong binding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetContextBinding");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contexthandle, (void*)(uintptr_t)binding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contexthandle;
    (void)binding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsGetThreadHandle(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsGetThreadHandle");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsSetClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetClientAllocFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)clientalloc;
    (void)clientfree;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsSetThreadHandle(JNIEnv* km_env, jclass km_clazz, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSetThreadHandle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
    }
#else
    (void)id;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcSsSwapClientAllocFree(JNIEnv* km_env, jclass km_clazz, jlong clientalloc, jlong clientfree, jlong oldclientalloc, jlong oldclientfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcSsSwapClientAllocFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)clientalloc, (void*)(uintptr_t)clientfree, (void*)(uintptr_t)oldclientalloc, (void*)(uintptr_t)oldclientfree);
    } else {
        errno = ENOSYS;
    }
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringBindingComposeA(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong options, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)options, (void*)(uintptr_t)stringbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringBindingComposeW(JNIEnv* km_env, jclass km_clazz, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong options, jlong stringbinding) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingComposeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)options, (void*)(uintptr_t)stringbinding);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringBindingParseA(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong networkoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)networkoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringBindingParseW(JNIEnv* km_env, jclass km_clazz, jlong stringbinding, jlong objuuid, jlong protseq, jlong networkaddr, jlong endpoint, jlong networkoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringBindingParseW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringbinding, (void*)(uintptr_t)objuuid, (void*)(uintptr_t)protseq, (void*)(uintptr_t)networkaddr, (void*)(uintptr_t)endpoint, (void*)(uintptr_t)networkoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringFreeA(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcStringFreeW(JNIEnv* km_env, jclass km_clazz, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcStringFreeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcTestCancel(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcTestCancel");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1rpcUserFree(JNIEnv* km_env, jclass km_clazz, jlong asynchandle, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RpcUserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)asynchandle, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)asynchandle;
    (void)pbuffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidCompare(JNIEnv* km_env, jclass km_clazz, jlong uuid1, jlong uuid2, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCompare");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid1, (void*)(uintptr_t)uuid2, (void*)(uintptr_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidCreate(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidCreateNil(JNIEnv* km_env, jclass km_clazz, jlong niluuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateNil");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)niluuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)niluuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidCreateSequential(JNIEnv* km_env, jclass km_clazz, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidCreateSequential");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidEqual(JNIEnv* km_env, jclass km_clazz, jlong uuid1, jlong uuid2, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidEqual");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid1, (void*)(uintptr_t)uuid2, (void*)(uintptr_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidFromStringA(JNIEnv* km_env, jclass km_clazz, jlong stringuuid, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringuuid, (void*)(uintptr_t)uuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringuuid;
    (void)uuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidFromStringW(JNIEnv* km_env, jclass km_clazz, jlong stringuuid, jlong uuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidFromStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringuuid, (void*)(uintptr_t)uuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringuuid;
    (void)uuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidHash(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidHash");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)status);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)uuid;
    (void)status;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidIsNil(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidIsNil");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)status);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    (void)status;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidToStringA(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong stringuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)stringuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    (void)stringuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_rpc_WindowsWin32SystemRpcJniBridge_windowssys_1windows_1win32_1system_1rpc_1uuidToStringW(JNIEnv* km_env, jclass km_clazz, jlong uuid, jlong stringuuid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UuidToStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uuid, (void*)(uintptr_t)stringuuid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uuid;
    (void)stringuuid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

