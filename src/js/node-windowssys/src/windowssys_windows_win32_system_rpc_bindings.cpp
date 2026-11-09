#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <napi.h>
#include <cstdint>
#include <cstddef>
#include <cstdlib>
#include <cstring>
#include <cerrno>
#include <string>
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

struct KmNapiRegistrarNode {
    void (*register_fn)(Napi::Env, Napi::Object);
    KmNapiRegistrarNode* next;
};
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
extern KmNapiRegistrarNode* km_napi_registrar_head;

namespace {

static int64_t km_napi_arg_i64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<int64_t>(std::strtoll(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return v.As<Napi::Number>().Int64Value();
    return 0;
}

static uint64_t km_napi_arg_u64(const Napi::Value& v) {
    if (v.IsNull() || v.IsUndefined()) return 0;
    if (v.IsString()) {
        std::string s = v.As<Napi::String>().Utf8Value();
        return static_cast<uint64_t>(std::strtoull(s.c_str(), nullptr, 10));
    }
    if (v.IsNumber()) return static_cast<uint64_t>(v.As<Napi::Number>().Int64Value());
    return 0;
}

static Napi::Value windowssys_windows_win32_system_rpc_DceErrorInqTextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t rpcstatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* errortext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DceErrorInqTextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpcstatus, errortext) : -1;
#else
    (void)rpcstatus;
    (void)errortext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_DceErrorInqTextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t rpcstatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* errortext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DceErrorInqTextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpcstatus, errortext) : -1;
#else
    (void)rpcstatus;
    (void)errortext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_this = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IUnknown_AddRef_Proxy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_this) : 0;
#else
    (void)arg_0_this;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_this = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IUnknown_QueryInterface_Proxy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_this, riid, ppvobject) : -1;
#else
    (void)arg_0_this;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_this = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IUnknown_Release_Proxy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_this) : 0;
#else
    (void)arg_0_this;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t exceptioncode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcAsyncAbortCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, exceptioncode) : -1;
#else
    (void)pasync;
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcAsyncSetHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message, pasync) : -1;
#else
    (void)message;
    (void)pasync;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcebinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingCopy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcebinding, destinationbinding) : -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* networkoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingCreateNP")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servername, servicename, networkoptions, binding) : -1;
#else
    (void)servername;
    (void)servicename;
    (void)networkoptions;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* asynchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingHandleToAsyncHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, asynchandle) : -1;
#else
    (void)binding;
    (void)asynchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tokenid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authenticationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* modifiedid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqClientTokenAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, tokenid, authenticationid, modifiedid) : -1;
#else
    (void)binding;
    (void)tokenid;
    (void)authenticationid;
    (void)modifiedid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dynamicendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, dynamicendpoint) : -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dynamicendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqDynamicEndpointW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, dynamicendpoint) : -1;
#else
    (void)binding;
    (void)dynamicendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqLocalClientPID")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, pid) : -1;
#else
    (void)binding;
    (void)pid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* marshalledtargetinfosize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* marshalledtargetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqMarshalledTargetInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, marshalledtargetinfosize, marshalledtargetinfo) : -1;
#else
    (void)binding;
    (void)marshalledtargetinfosize;
    (void)marshalledtargetinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securitycontexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, securitycontexthandle) : -1;
#else
    (void)binding;
    (void)securitycontexthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* keyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqSecurityContextKeyInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, keyinfo) : -1;
#else
    (void)binding;
    (void)keyinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqTransportType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, type) : -1;
#else
    (void)binding;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wireid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingInqWireIdForSnego")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, wireid) : -1;
#else
    (void)binding;
    (void)wireid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientlocalflag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingIsClientLocal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle, clientlocalflag) : -1;
#else
    (void)bindinghandle;
    (void)clientlocalflag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverlocalflag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingIsServerLocal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverlocalflag) : -1;
#else
    (void)binding;
    (void)serverlocalflag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t option = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t optionvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingSetPrivateOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbinding, option, optionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcBindingToStaticStringBindingW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcClearMutex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcClearMutex")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mutex);
#else
    (void)mutex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcDeleteMutex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcDeleteMutex")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mutex);
#else
    (void)mutex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcExceptionFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t exceptioncode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcExceptionFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(exceptioncode) : -1;
#else
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(object);
#else
    (void)object;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcFreeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcFreePipeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcGetBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcGetBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcGetBufferWithObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message, objectuuid) : -1;
#else
    (void)message;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcGetCurrentCallHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcGetDefaultSD")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppsecuritydescriptor) : -1;
#else
    (void)ppsecuritydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcGetExtendedError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcGetExtendedError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rpcifhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* transfersyntaxes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t transfersyntaxsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* transfersyntaxcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcIfInqTransferSyntaxes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpcifhandle, transfersyntaxes, transfersyntaxsize, transfersyntaxcount) : -1;
#else
    (void)rpcifhandle;
    (void)transfersyntaxes;
    (void)transfersyntaxsize;
    (void)transfersyntaxcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcMapWin32Status_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcMapWin32Status")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(status) : -1;
#else
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcMgmtEnableDedicatedThreadPool")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNegotiateTransferSyntax")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, entrynamesyntax, entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsBindingSetEntryNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, entrynamesyntax, entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsGetBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rpcinterfaceinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsInterfaceExported")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, rpcinterfaceinformation) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rpcinterfaceinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsInterfaceUnexported")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, rpcinterfaceinformation) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)rpcinterfaceinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsRaiseException_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t status = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsRaiseException")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(message, status);
#else
    (void)message;
    (void)status;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcNsSendReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcNsSendReceive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message, handle) : -1;
#else
    (void)message;
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* clientprocess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcOpenClientProcess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, desiredaccess, clientprocess) : -1;
#else
    (void)binding;
    (void)desiredaccess;
    (void)clientprocess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcPauseExecution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t milliseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcPauseExecution")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(milliseconds);
#else
    (void)milliseconds;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcReBindBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcReBindBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t newsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcReallocPipeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message, newsize) : -1;
#else
    (void)message;
    (void)newsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcReceive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message, size) : -1;
#else
    (void)message;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t rpcstatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* calloutstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dllname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcRecordCalloutFailure")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(rpcstatus, calloutstate, dllname);
#else
    (void)rpcstatus;
    (void)calloutstate;
    (void)dllname;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcRequestMutex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcRequestMutex")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mutex);
#else
    (void)mutex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcSend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcSend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcSendReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* message = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcSendReceive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(message) : -1;
#else
    (void)message;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerCheckClientRestriction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerDisableExceptionFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* associationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerGetAssociationID")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, associationid) : -1;
#else
    (void)binding;
    (void)associationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerInqAddressChangeFn")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addressformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerInqLocalConnAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, buffer, buffersize, addressformat) : -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* addressformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerInqRemoteConnAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, buffer, buffersize, addressformat) : -1;
#else
    (void)binding;
    (void)buffer;
    (void)buffersize;
    (void)addressformat;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerInqTransportType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(type) : -1;
#else
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pforwardfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerRegisterForwardFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pforwardfunction) : -1;
#else
    (void)pforwardfunction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paddresschangefn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerSetAddressChangeFn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(paddresschangefn) : -1;
#else
    (void)paddresschangefn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerStartService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerStartService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, endpoint, ifspec) : -1;
#else
    (void)protseq;
    (void)endpoint;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, hevent) : -1;
#else
    (void)binding;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subscriptionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerSubscribeForDisconnectNotification2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, hevent, subscriptionid) : -1;
#else
    (void)binding;
    (void)hevent;
    (void)subscriptionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkaddress, protseq, maxcalls, securitydescriptor, policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerUseProtseq2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkaddress, protseq, maxcalls, securitydescriptor, policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkaddress, protseq, maxcalls, endpoint, securitydescriptor, policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcServerUseProtseqEp2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(networkaddress, protseq, maxcalls, endpoint, securitydescriptor, policy) : -1;
#else
    (void)networkaddress;
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcSessionStrictContextHandle")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcSsDontSerializeContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t actualtype = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t idltype = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t marshaldirection = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcSystemHandleTypeSpecificWork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, actualtype, idltype, marshaldirection) : -1;
#else
    (void)handle;
    (void)actualtype;
    (void)idltype;
    (void)marshaldirection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_RpcTurnOnEEInfoPropagation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_I_UuidCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "I_UuidCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesBufferHandleReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t handlestyle = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t operation = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pencodedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesBufferHandleReset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, handlestyle, operation, pbuffer, buffersize, pencodedsize) : -1;
#else
    (void)handle;
    (void)handlestyle;
    (void)operation;
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesDecodeBufferHandleCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffer, buffersize, phandle) : -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* userstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* readfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesDecodeIncrementalHandleCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(userstate, readfn, phandle) : -1;
#else
    (void)userstate;
    (void)readfn;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pencodedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesEncodeDynBufferHandleCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer, pencodedsize, phandle) : -1;
#else
    (void)pbuffer;
    (void)pencodedsize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pencodedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesEncodeFixedBufferHandleCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuffer, buffersize, pencodedsize, phandle) : -1;
#else
    (void)pbuffer;
    (void)buffersize;
    (void)pencodedsize;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* userstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* allocfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* writefn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesEncodeIncrementalHandleCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(userstate, allocfn, writefn, phandle) : -1;
#else
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesHandleFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesHandleFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesIncrementalHandleReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* userstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* allocfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* writefn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* readfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t operation = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesIncrementalHandleReset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, userstate, allocfn, writefn, readfn, operation) : -1;
#else
    (void)handle;
    (void)userstate;
    (void)allocfn;
    (void)writefn;
    (void)readfn;
    (void)operation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_MesInqProcEncodingId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinterfaceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprocnum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MesInqProcEncodingId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, pinterfaceid, pprocnum) : -1;
#else
    (void)handle;
    (void)pinterfaceid;
    (void)pprocnum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRCContextBinding_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ccontext = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRCContextBinding")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ccontext) : NULL;
#else
    (void)ccontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRCContextMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t ccontext = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRCContextMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ccontext, pbuff);
#else
    (void)ccontext;
    (void)pbuff;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRCContextUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t datarepresentation = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRCContextUnmarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pccontext, hbinding, pbuff, datarepresentation);
#else
    (void)pccontext;
    (void)hbinding;
    (void)pbuff;
    (void)datarepresentation;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* userrundownin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ccontext, pbuff, userrundownin);
#else
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextMarshall2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* userrundownin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ctxguard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextMarshall2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bindinghandle, ccontext, pbuff, userrundownin, ctxguard, flags);
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
    (void)ctxguard;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextMarshallEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* userrundownin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextMarshallEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bindinghandle, ccontext, pbuff, userrundownin);
#else
    (void)bindinghandle;
    (void)ccontext;
    (void)pbuff;
    (void)userrundownin;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t datarepresentation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbuff, datarepresentation) : NULL;
#else
    (void)pbuff;
    (void)datarepresentation;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t datarepresentation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ctxguard = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextUnmarshall2")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle, pbuff, datarepresentation, ctxguard, flags) : NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    (void)ctxguard;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t datarepresentation = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NDRSContextUnmarshallEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle, pbuff, datarepresentation) : NULL;
#else
    (void)bindinghandle;
    (void)pbuff;
    (void)datarepresentation;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Ndr64AsyncServerCall64")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Ndr64AsyncServerCallAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pthis = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchannel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstubphase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Ndr64DcomAsyncStubCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t len = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, len) : NULL;
#else
    (void)pstubmsg;
    (void)len;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrAsyncServerCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrAsyncServerCall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrByteCountPointerBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrByteCountPointerFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrByteCountPointerFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrByteCountPointerMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrByteCountPointerUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrClearOutParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* argaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrClearOutParameters")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pformat, argaddr);
#else
    (void)pstubmsg;
    (void)pformat;
    (void)argaddr;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrClientContextMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t contexthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t fcheck = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrClientContextMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, contexthandle, fcheck);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)fcheck;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bindhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrClientContextUnmarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pcontexthandle, bindhandle);
#else
    (void)pstubmsg;
    (void)pcontexthandle;
    (void)bindhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrClientInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t procnum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrClientInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, procnum);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrClientInitializeNew_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t procnum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrClientInitializeNew")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, procnum);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)procnum;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexArrayBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexArrayFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexArrayFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexArrayMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexArrayMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexArrayUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexStructBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexStructFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexStructFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexStructMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexStructMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexStructMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrComplexStructUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantArrayBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantArrayFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantArrayFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantArrayMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantArrayMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantArrayUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStringBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStringMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStringMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStringMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStringUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStructBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStructFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStructFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStructMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStructMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStructMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantStructUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingArrayBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingArrayFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingArrayMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingArrayUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingStructBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingStructFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingStructMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingStructMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConformantVaryingStructUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrContextHandleInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrContextHandleInitialize")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrContextHandleSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrContextHandleSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConvert_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConvert")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pformat);
#else
    (void)pstubmsg;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrConvert2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t numberparams = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrConvert2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pformat, numberparams);
#else
    (void)pstubmsg;
    (void)pformat;
    (void)numberparams;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrCorrelationFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrCorrelationFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg);
#else
    (void)pstubmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrCorrelationInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cachesize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrCorrelationInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, cachesize, flags);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)cachesize;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrCorrelationPass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrCorrelationPass")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg);
#else
    (void)pstubmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstub = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pserverif = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrCreateServerInterfaceFromStub")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstub, pserverif) : -1;
#else
    (void)pstub;
    (void)pserverif;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pthis = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchannel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstubphase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrDcomAsyncStubCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrEncapsulatedUnionBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrEncapsulatedUnionFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrEncapsulatedUnionMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrEncapsulatedUnionUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFixedArrayBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFixedArrayFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFixedArrayFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFixedArrayMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFixedArrayMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFixedArrayUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFreeBuffer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg);
#else
    (void)pstubmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pxlattables = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFullPointerXlatFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pxlattables);
#else
    (void)pxlattables;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t numberofpointers = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t xlatside = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrFullPointerXlatInit")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numberofpointers, xlatside) : NULL;
#else
    (void)numberofpointers;
    (void)xlatside;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrGetBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrGetBuffer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, bufferlength, handle) : NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrGetDcomProtocolVersion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pversion) : -1;
#else
    (void)pstubmsg;
    (void)pversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t informationlevel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pmarshalinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrGetUserMarshalInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pflags, informationlevel, pmarshalinfo) : -1;
#else
    (void)pflags;
    (void)informationlevel;
    (void)pmarshalinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrInterfacePointerBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrInterfacePointerFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrInterfacePointerFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrInterfacePointerMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrInterfacePointerMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrInterfacePointerUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcommstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfaultstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t status = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMapCommAndFaultStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pcommstatus, pfaultstatus, status) : -1;
#else
    (void)pstubmsg;
    (void)pcommstatus;
    (void)pfaultstatus;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : 0;
#else
    (void)param0;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeAlignSizeAll")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, pproxyinfo) : 0;
#else
    (void)handle;
    (void)pproxyinfo;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t size = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecode")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pobject, size);
#else
    (void)handle;
    (void)pobject;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t size = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeDecodeAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pproxyinfo, pobject, size);
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t size = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncode")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pstubdesc, pobject, size);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pobject;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t size = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesSimpleTypeEncodeAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pproxyinfo, pobject, size);
#else
    (void)handle;
    (void)pproxyinfo;
    (void)pobject;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeAlignSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, pstubdesc, pformatstring, pobject) : 0;
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeAlignSize2")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject) : 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arrtypeoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ntypeindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeAlignSize3")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject) : 0;
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeDecode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeDecode")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pstubdesc, pformatstring, pobject);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeDecode2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeDecode2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeDecode3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arrtypeoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ntypeindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeDecode3")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeEncode")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, pstubdesc, pformatstring, pobject);
#else
    (void)handle;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeEncode2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeEncode2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeEncode3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arrtypeoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ntypeindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeEncode3")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeFree2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pformatstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeFree2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pstubdesc, pformatstring, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pstubdesc;
    (void)pformatstring;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrMesTypeFree3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppicklinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproxyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arrtypeoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t ntypeindex = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrMesTypeFree3")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex, pobject);
#else
    (void)handle;
    (void)ppicklinginfo;
    (void)pproxyinfo;
    (void)arrtypeoffset;
    (void)ntypeindex;
    (void)pobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonConformantStringBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonConformantStringMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonConformantStringMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonConformantStringUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNonEncapsulatedUnionUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNsGetBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNsGetBuffer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, bufferlength, handle) : NULL;
#else
    (void)pstubmsg;
    (void)bufferlength;
    (void)handle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrNsSendReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbufferend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pautohandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrNsSendReceive")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pbufferend, pautohandle) : NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    (void)pautohandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrOleAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrOleAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrOleFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrOleFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(nodetofree);
#else
    (void)nodetofree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPartialIgnoreClientBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory);
#else
    (void)pstubmsg;
    (void)pmemory;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPartialIgnoreClientMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory);
#else
    (void)pstubmsg;
    (void)pmemory;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPartialIgnoreServerInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, ppmemory, pformat);
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPartialIgnoreServerUnmarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, ppmemory);
#else
    (void)pstubmsg;
    (void)ppmemory;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPointerBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPointerBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPointerFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPointerFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPointerMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPointerMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPointerMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPointerMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrPointerUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrPointerUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRangeUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRangeUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSmClientAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSmClientFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSmClientFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(nodetofree);
#else
    (void)nodetofree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSmSetClientToOsf")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pmessage);
#else
    (void)pmessage;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSsDefaultAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSsDefaultFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(nodetofree);
#else
    (void)nodetofree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSsDisableAllocate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pmessage);
#else
    (void)pmessage;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrRpcSsEnableAllocate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pmessage);
#else
    (void)pmessage;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSendReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbufferend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSendReceive")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pbufferend) : NULL;
#else
    (void)pstubmsg;
    (void)pbufferend;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerCall2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerCall2")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerCallAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerCallAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerCallNdr64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerCallNdr64")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg);
#else
    (void)prpcmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerContextMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rundownroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerContextMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, contexthandle, rundownroutine);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rundownroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerContextNewMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, contexthandle, rundownroutine, pformat);
#else
    (void)pstubmsg;
    (void)contexthandle;
    (void)rundownroutine;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerContextNewUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerContextUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg) : NULL;
#else
    (void)pstubmsg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerInitialize")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor) : NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerInitializeMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg, pstubmsg);
#else
    (void)prpcmsg;
    (void)pstubmsg;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerInitializeNew_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerInitializeNew")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor) : NULL;
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerInitializePartial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t requestedbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerInitializePartial")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prpcmsg, pstubmsg, pstubdescriptor, requestedbuffersize);
#else
    (void)prpcmsg;
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)requestedbuffersize;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstubdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrServerInitializeUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pstubdescriptor, prpcmsg) : NULL;
#else
    (void)pstubmsg;
    (void)pstubdescriptor;
    (void)prpcmsg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleStructBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleStructFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleStructFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleStructMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleStructMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleStructUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t formatchar = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleTypeMarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, formatchar);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t formatchar = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrSimpleTypeUnmarshall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, formatchar);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)formatchar;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrStubCall2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pthis = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchannel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstubphase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrStubCall2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrStubCall3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pthis = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchannel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prpcmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwstubphase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrStubCall3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pthis, pchannel, prpcmsg, pdwstubphase) : -1;
#else
    (void)pthis;
    (void)pchannel;
    (void)prpcmsg;
    (void)pdwstubphase;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t formatchar = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalSimpleTypeConvert")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pflags, pbuffer, formatchar) : NULL;
#else
    (void)pflags;
    (void)pbuffer;
    (void)formatchar;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrUserMarshalUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrVaryingArrayBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrVaryingArrayFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrVaryingArrayFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrVaryingArrayMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrVaryingArrayMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrVaryingArrayUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrXmitOrRepAsBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrXmitOrRepAsFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pstubmsg, pmemory, pformat);
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrXmitOrRepAsMarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pmemory, pformat) : NULL;
#else
    (void)pstubmsg;
    (void)pmemory;
    (void)pformat;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrXmitOrRepAsMemorySize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, pformat) : 0;
#else
    (void)pstubmsg;
    (void)pformat;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstubmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t fmustalloc = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdrXmitOrRepAsUnmarshall")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstubmsg, ppmemory, pformat, fmustalloc) : NULL;
#else
    (void)pstubmsg;
    (void)ppmemory;
    (void)pformat;
    (void)fmustalloc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncAbortCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t exceptioncode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncAbortCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, exceptioncode) : -1;
#else
    (void)pasync;
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncCancelCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fabort = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncCancelCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, fabort) : -1;
#else
    (void)pasync;
    (void)fabort;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncCompleteCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, reply) : -1;
#else
    (void)pasync;
    (void)reply;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncGetCallStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync) : -1;
#else
    (void)pasync;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncInitializeHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, size) : -1;
#else
    (void)pasync;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcAsyncRegisterInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync) : -1;
#else
    (void)pasync;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingBind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingBind")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pasync, binding, ifspec) : -1;
#else
    (void)pasync;
    (void)binding;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcebinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingCopy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcebinding, destinationbinding) : -1;
#else
    (void)sourcebinding;
    (void)destinationbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingCreateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_template = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* security = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingCreateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_template, security, options, binding) : -1;
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingCreateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_template = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* security = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingCreateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_template, security, options, binding) : -1;
#else
    (void)arg_0_template;
    (void)security;
    (void)options;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingFromStringBindingA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringbinding, binding) : -1;
#else
    (void)stringbinding;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingFromStringBindingW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringbinding, binding) : -1;
#else
    (void)stringbinding;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* privs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthClientA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* privs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* privs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthClientExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* privs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthClientW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc) : -1;
#else
    (void)clientbinding;
    (void)privs;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t rpcqosversion = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* securityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion, securityqos) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t rpcqosversion = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* securityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion, securityqos) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* authnsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* authzsvc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqAuthInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* maxcalls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqMaxCalls")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, maxcalls) : -1;
#else
    (void)binding;
    (void)maxcalls;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, objectuuid) : -1;
#else
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingInqOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t option = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* poptionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingInqOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbinding, option, poptionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)poptionvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingReset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingServerFromClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingServerFromClient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, serverbinding) : -1;
#else
    (void)clientbinding;
    (void)serverbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t authnlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t authzsvc = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t authnlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t authzsvc = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* securityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, securityqos) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t authnlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t authzsvc = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* securityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, securityqos) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t authnlevel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t authzsvc = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetAuthInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc) : -1;
#else
    (void)binding;
    (void)serverprincname;
    (void)authnlevel;
    (void)authnsvc;
    (void)authidentity;
    (void)authzsvc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, objectuuid) : -1;
#else
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingSetOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t option = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t optionvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingSetOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbinding, option, optionvalue) : -1;
#else
    (void)hbinding;
    (void)option;
    (void)optionvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingToStringBindingA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingToStringBindingW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, stringbinding) : -1;
#else
    (void)binding;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingUnbind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingUnbind")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcBindingVectorFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcBindingVectorFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindingvector) : -1;
#else
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcCancelThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcCancelThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : -1;
#else
    (void)thread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcCancelThreadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t timeout = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcCancelThreadEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, timeout) : -1;
#else
    (void)thread;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, flags, pbuffer) : -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcCertGeneratePrincipalNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, flags, pbuffer) : -1;
#else
    (void)context;
    (void)flags;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpRegisterA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uuidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpRegisterA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, bindingvector, uuidvector, annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uuidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, bindingvector, uuidvector, annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uuidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpRegisterNoReplaceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, bindingvector, uuidvector, annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpRegisterW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uuidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpRegisterW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, bindingvector, uuidvector, annotation) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpResolveBinding_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpResolveBinding")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, ifspec) : -1;
#else
    (void)binding;
    (void)ifspec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcEpUnregister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uuidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcEpUnregister")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, bindingvector, uuidvector) : -1;
#else
    (void)ifspec;
    (void)bindingvector;
    (void)uuidvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorAddRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* errorinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorAddRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(errorinfo) : -1;
#else
    (void)errorinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorClearInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorClearInformation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorEndEnumeration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t copystrings = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* errorinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorGetNextRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle, copystrings, errorinfo) : -1;
#else
    (void)enumhandle;
    (void)copystrings;
    (void)errorinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* records = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorGetNumberOfRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle, records) : -1;
#else
    (void)enumhandle;
    (void)records;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* errorblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t blobsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorLoadErrorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(errorblob, blobsize, enumhandle) : -1;
#else
    (void)errorblob;
    (void)blobsize;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorResetEnumeration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* blobsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorSaveErrorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle, errorblob, blobsize) : -1;
#else
    (void)enumhandle;
    (void)errorblob;
    (void)blobsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcErrorStartEnumeration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enumhandle) : -1;
#else
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcExceptionFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t exceptioncode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcExceptionFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(exceptioncode) : -1;
#else
    (void)exceptioncode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pauthzclientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcFreeAuthorizationContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pauthzclientcontext) : -1;
#else
    (void)pauthzclientcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcIfIdVectorFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcIfIdVectorFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifidvector) : -1;
#else
    (void)ifidvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcIfInqId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rpcifhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rpcifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcIfInqId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rpcifhandle, rpcifid) : -1;
#else
    (void)rpcifhandle;
    (void)rpcifid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcImpersonateClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcImpersonateClient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcImpersonateClient2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcImpersonateClient2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcImpersonateClientContainer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEnableIdleCleanup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* epbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t inquirytype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t versoption = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEpEltInqBegin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(epbinding, inquirytype, ifid, versoption, objectuuid, inquirycontext) : -1;
#else
    (void)epbinding;
    (void)inquirytype;
    (void)ifid;
    (void)versoption;
    (void)objectuuid;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEpEltInqDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, ifid, binding, objectuuid, annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEpEltInqNextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, ifid, binding, objectuuid, annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* epbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtEpUnregister")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(epbinding, ifid, binding, objectuuid) : -1;
#else
    (void)epbinding;
    (void)ifid;
    (void)binding;
    (void)objectuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqComTimeout")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, timeout) : -1;
#else
    (void)binding;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* authnlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqDefaultProtectLevel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authnsvc, authnlevel) : -1;
#else
    (void)authnsvc;
    (void)authnlevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifidvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqIfIds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, ifidvector) : -1;
#else
    (void)binding;
    (void)ifidvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, authnsvc, serverprincname) : -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqServerPrincNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, authnsvc, serverprincname) : -1;
#else
    (void)binding;
    (void)authnsvc;
    (void)serverprincname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtInqStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* statistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtInqStats")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, statistics) : -1;
#else
    (void)binding;
    (void)statistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtIsServerListening")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* authorizationfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtSetAuthorizationFn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authorizationfn) : -1;
#else
    (void)authorizationfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t timeout = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtSetCancelTimeout")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timeout) : -1;
#else
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtSetComTimeout")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, timeout) : -1;
#else
    (void)binding;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t threadstacksize = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtSetServerStackSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadstacksize) : -1;
#else
    (void)threadstacksize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statsvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtStatsVectorFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statsvector) : -1;
#else
    (void)statsvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtStopServerListening")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcMgmtWaitServerListen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseqvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseqvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNetworkInqProtseqsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq) : -1;
#else
    (void)protseq;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNetworkIsProtseqValidW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq) : -1;
#else
    (void)protseq;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingExportA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* bindingvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingExportA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, bindingvec, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingExportPnPA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingExportPnPW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingExportW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* bindingvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingExportW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, bindingvec, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)bindingvec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* importcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingImportBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, importcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* importcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingImportBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, importcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingImportDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* importcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingImportDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(importcontext) : -1;
#else
    (void)importcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingImportNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* importcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingImportNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(importcontext, binding) : -1;
#else
    (void)importcontext;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, entrynamesyntax, entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingInqEntryNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, entrynamesyntax, entryname) : -1;
#else
    (void)binding;
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bindingmaxcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, bindingmaxcount, lookupcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bindingmaxcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingLookupBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objuuid, bindingmaxcount, lookupcontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objuuid;
    (void)bindingmaxcount;
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingLookupDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lookupcontext) : -1;
#else
    (void)lookupcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingLookupNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lookupcontext, bindingvec) : -1;
#else
    (void)lookupcontext;
    (void)bindingvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingSelect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindingvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingSelect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindingvec, binding) : -1;
#else
    (void)bindingvec;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingUnexportA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingUnexportPnPW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectvector) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsBindingUnexportW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifspec, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifspec;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* expandedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryExpandNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, expandedname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* expandedname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryExpandNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, expandedname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)expandedname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, inquirycontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryObjectInqBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, inquirycontext) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryObjectInqDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsEntryObjectInqNext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, objuuid) : -1;
#else
    (void)inquirycontext;
    (void)objuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupDeleteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupDeleteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrAddA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrAddW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, inquirycontext) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrInqBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, inquirycontext) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrInqDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, membername) : -1;
#else
    (void)inquirycontext;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrInqNextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, membername) : -1;
#else
    (void)inquirycontext;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t groupnamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* groupname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsGroupMbrRemoveW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(groupnamesyntax, groupname, membernamesyntax, membername) : -1;
#else
    (void)groupnamesyntax;
    (void)groupname;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t versoption = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifid, versoption, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t versoption = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objectuuidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtBindingUnexportW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifid, versoption, objectuuidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifid;
    (void)versoption;
    (void)objectuuidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryCreateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryDeleteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t entrynamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* entryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifidvec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtEntryInqIfIdsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(entrynamesyntax, entryname, ifidvec) : -1;
#else
    (void)entrynamesyntax;
    (void)entryname;
    (void)ifidvec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t expirationage = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtHandleSetExpAge")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nshandle, expirationage) : -1;
#else
    (void)nshandle;
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* expirationage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtInqExpAge")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(expirationage) : -1;
#else
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t expirationage = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsMgmtSetExpAge")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(expirationage) : -1;
#else
    (void)expirationage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileDeleteA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileDeleteW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t priority = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltAddA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername, priority, annotation) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t priority = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltAddW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername, priority, annotation) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inquirytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t versoption = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, inquirytype, ifid, versoption, membernamesyntax, membername, inquirycontext) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t inquirytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t versoption = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltInqBeginW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, inquirytype, ifid, versoption, membernamesyntax, membername, inquirycontext) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltInqDone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext) : -1;
#else
    (void)inquirycontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* priority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, ifid, membername, priority, annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquirycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* priority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* annotation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltInqNextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquirycontext, ifid, membername, priority, annotation) : -1;
#else
    (void)inquirycontext;
    (void)ifid;
    (void)membername;
    (void)priority;
    (void)annotation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t profilenamesyntax = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* profilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ifid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t membernamesyntax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* membername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcns4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcNsProfileEltRemoveW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(profilenamesyntax, profilename, ifid, membernamesyntax, membername) : -1;
#else
    (void)profilenamesyntax;
    (void)profilename;
    (void)ifid;
    (void)membernamesyntax;
    (void)membername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcObjectInqType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* typeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcObjectInqType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objuuid, typeuuid) : -1;
#else
    (void)objuuid;
    (void)typeuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcObjectSetInqFn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inquiryfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcObjectSetInqFn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inquiryfn) : -1;
#else
    (void)inquiryfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcObjectSetType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* typeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcObjectSetType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objuuid, typeuuid) : -1;
#else
    (void)objuuid;
    (void)typeuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseqvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcProtseqVectorFreeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseqvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcProtseqVectorFreeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseqvector) : -1;
#else
    (void)protseqvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcRaiseException_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t exception = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcRaiseException")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(exception);
#else
    (void)exception;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcRevertContainerImpersonation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcRevertToSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcRevertToSelf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcRevertToSelfEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcRevertToSelfEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t status = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerCompleteSecurityCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle, status) : -1;
#else
    (void)bindinghandle;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqBindingHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding) : -1;
#else
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqBindings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqBindings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindingvector) : -1;
#else
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqBindingsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, bindingvector) : -1;
#else
    (void)securitydescriptor;
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rpccallattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqCallAttributesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, rpccallattributes) : -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rpccallattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqCallAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientbinding, rpccallattributes) : -1;
#else
    (void)clientbinding;
    (void)rpccallattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* princname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authnsvc, princname) : -1;
#else
    (void)authnsvc;
    (void)princname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* princname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqDefaultPrincNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(authnsvc, princname) : -1;
#else
    (void)authnsvc;
    (void)princname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInqIf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mgrepv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInqIf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, mgrepv) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupActivate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifgroup) : -1;
#else
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifgroup) : -1;
#else
    (void)ifgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t numifs = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t numendpoints = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t idleperiod = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* idlecallbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* idlecallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaces, numifs, endpoints, numendpoints, idleperiod, idlecallbackfn, idlecallbackcontext, ifgroup) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t numifs = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t numendpoints = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t idleperiod = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* idlecallbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* idlecallbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupCreateW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfaces, numifs, endpoints, numendpoints, idleperiod, idlecallbackfn, idlecallbackcontext, ifgroup) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t forcedeactivation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupDeactivate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifgroup, forcedeactivation) : -1;
#else
    (void)ifgroup;
    (void)forcedeactivation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerInterfaceGroupInqBindings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifgroup, bindingvector) : -1;
#else
    (void)ifgroup;
    (void)bindingvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerListen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t minimumcallthreads = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dontwait = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerListen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(minimumcallthreads, maxcalls, dontwait) : -1;
#else
    (void)minimumcallthreads;
    (void)maxcalls;
    (void)dontwait;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* getkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serverprincname, authnsvc, getkeyfn, arg) : -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serverprincname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnsvc = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* getkeyfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterAuthInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serverprincname, authnsvc, getkeyfn, arg) : -1;
#else
    (void)serverprincname;
    (void)authnsvc;
    (void)getkeyfn;
    (void)arg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterIf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mgrepv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterIf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, mgrepv) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterIf2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mgrepv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t maxrpcsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* ifcallbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterIf2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, maxrpcsize, ifcallbackfn) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterIf3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mgrepv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t maxrpcsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* ifcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterIf3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, maxrpcsize, ifcallback, securitydescriptor) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mgrepv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ifcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerRegisterIfEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, mgrepv, flags, maxcalls, ifcallback) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)mgrepv;
    (void)flags;
    (void)maxcalls;
    (void)ifcallback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t notification = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t notificationtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* notificationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerSubscribeForNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, notification, notificationtype, notificationinfo) : -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationtype;
    (void)notificationinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerTestCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerTestCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bindinghandle) : -1;
#else
    (void)bindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUnregisterIf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t waitforcallstocomplete = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUnregisterIf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, waitforcallstocomplete) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)waitforcallstocomplete;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mgrtypeuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t rundowncontexthandles = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUnregisterIfEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ifspec, mgrtypeuuid, rundowncontexthandles) : -1;
#else
    (void)ifspec;
    (void)mgrtypeuuid;
    (void)rundowncontexthandles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t notification = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* notificationsqueued = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUnsubscribeForNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(binding, notification, notificationsqueued) : -1;
#else
    (void)binding;
    (void)notification;
    (void)notificationsqueued;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseAllProtseqs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(maxcalls, securitydescriptor) : -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(maxcalls, securitydescriptor, policy) : -1;
#else
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(maxcalls, ifspec, securitydescriptor) : -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseAllProtseqsIfEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(maxcalls, ifspec, securitydescriptor, policy) : -1;
#else
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqEpA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqEpExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqEpW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, endpoint, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)endpoint;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqIfA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqIfExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor, policy) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ifspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqIfW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, ifspec, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)ifspec;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerUseProtseqW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxcalls = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerUseProtseqW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protseq, maxcalls, securitydescriptor) : -1;
#else
    (void)protseq;
    (void)maxcalls;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcServerYield_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcServerYield")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size, pstatus) : NULL;
#else
    (void)size;
    (void)pstatus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmClientFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pnodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmClientFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pnodetofree) : -1;
#else
    (void)pnodetofree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmDestroyClientContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contexthandle) : -1;
#else
    (void)contexthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmDisableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmDisableAllocate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmEnableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmEnableAllocate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nodetofree) : -1;
#else
    (void)nodetofree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmGetThreadHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstatus) : NULL;
#else
    (void)pstatus;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmSetClientAllocFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientalloc, clientfree) : -1;
#else
    (void)clientalloc;
    (void)clientfree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmSetThreadHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id) : -1;
#else
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldclientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldclientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSmSwapClientAllocFree")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientalloc, clientfree, oldclientalloc, oldclientfree) : -1;
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serverbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsContextLockExclusive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serverbindinghandle, usercontext) : -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsContextLockShared_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serverbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsContextLockShared")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serverbindinghandle, usercontext) : -1;
#else
    (void)serverbindinghandle;
    (void)usercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsDestroyClientContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(contexthandle);
#else
    (void)contexthandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsDisableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsDisableAllocate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsDontSerializeContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsEnableAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsEnableAllocate")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nodetofree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(nodetofree);
#else
    (void)nodetofree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsGetContextBinding_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* contexthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* binding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsGetContextBinding")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(contexthandle, binding) : -1;
#else
    (void)contexthandle;
    (void)binding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsGetThreadHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsSetClientAllocFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(clientalloc, clientfree);
#else
    (void)clientalloc;
    (void)clientfree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsSetThreadHandle")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(id);
#else
    (void)id;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* oldclientalloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oldclientfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcSsSwapClientAllocFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(clientalloc, clientfree, oldclientalloc, oldclientfree);
#else
    (void)clientalloc;
    (void)clientfree;
    (void)oldclientalloc;
    (void)oldclientfree;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringBindingComposeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* networkaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringBindingComposeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objuuid, protseq, networkaddr, endpoint, options, stringbinding) : -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringBindingComposeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* networkaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringBindingComposeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objuuid, protseq, networkaddr, endpoint, options, stringbinding) : -1;
#else
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)options;
    (void)stringbinding;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringBindingParseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* networkaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* networkoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringBindingParseA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions) : -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringBindingParseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringbinding = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* protseq = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* networkaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* networkoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringBindingParseW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions) : -1;
#else
    (void)stringbinding;
    (void)objuuid;
    (void)protseq;
    (void)networkaddr;
    (void)endpoint;
    (void)networkoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringFreeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringFreeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string) : -1;
#else
    (void)string;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcStringFreeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcStringFreeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string) : -1;
#else
    (void)string;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcTestCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcTestCancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_RpcUserFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RpcUserFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(asynchandle, pbuffer);
#else
    (void)asynchandle;
    (void)pbuffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidCompare_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uuid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidCompare")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid1, uuid2, status) : -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidCreateNil_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* niluuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidCreateNil")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(niluuid) : -1;
#else
    (void)niluuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidCreateSequential_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidCreateSequential")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid) : -1;
#else
    (void)uuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uuid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidEqual")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid1, uuid2, status) : -1;
#else
    (void)uuid1;
    (void)uuid2;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidFromStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidFromStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringuuid, uuid) : -1;
#else
    (void)stringuuid;
    (void)uuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidFromStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stringuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidFromStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stringuuid, uuid) : -1;
#else
    (void)stringuuid;
    (void)uuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidHash")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid, status) : 0;
#else
    (void)uuid;
    (void)status;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidIsNil_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidIsNil")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid, status) : -1;
#else
    (void)uuid;
    (void)status;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidToStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid, stringuuid) : -1;
#else
    (void)uuid;
    (void)stringuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_rpc_UuidToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stringuuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("rpcrt4.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UuidToStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uuid, stringuuid) : -1;
#else
    (void)uuid;
    (void)stringuuid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_rpc_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_rpc_DceErrorInqTextA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_DceErrorInqTextA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_DceErrorInqTextW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_DceErrorInqTextW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy", Napi::Function::New(env, windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy_napi));
    exports.Set("windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy", Napi::Function::New(env, windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy_napi));
    exports.Set("windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy", Napi::Function::New(env, windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingCopy", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingCopy_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcClearMutex", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcClearMutex_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcDeleteMutex", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcDeleteMutex_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcExceptionFilter", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcExceptionFilter_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcGetBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcGetBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcGetExtendedError", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcGetExtendedError_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcMapWin32Status", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcMapWin32Status_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsRaiseException", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsRaiseException_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcNsSendReceive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcNsSendReceive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcPauseExecution", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcPauseExecution_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcReBindBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcReBindBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcReceive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcReceive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcRequestMutex", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcRequestMutex_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcSend", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcSend_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcSendReceive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcSendReceive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerStartService", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerStartService_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation_napi));
    exports.Set("windowssys_windows_win32_system_rpc_I_UuidCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_I_UuidCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesBufferHandleReset", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesBufferHandleReset_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesHandleFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesHandleFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesIncrementalHandleReset", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesIncrementalHandleReset_napi));
    exports.Set("windowssys_windows_win32_system_rpc_MesInqProcEncodingId", Napi::Function::New(env, windowssys_windows_win32_system_rpc_MesInqProcEncodingId_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRCContextBinding", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRCContextBinding_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRCContextMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRCContextMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRCContextUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRCContextUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextMarshall2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextMarshall2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextMarshallEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextMarshallEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64", Napi::Function::New(env, windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64_napi));
    exports.Set("windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll", Napi::Function::New(env, windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll_napi));
    exports.Set("windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrAsyncServerCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrAsyncServerCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrByteCountPointerFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrByteCountPointerFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrClearOutParameters", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrClearOutParameters_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrClientContextMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrClientContextMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrClientInitialize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrClientInitialize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrClientInitializeNew", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrClientInitializeNew_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexArrayFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexArrayFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexStructFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexStructFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexStructMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexStructMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantArrayFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantArrayFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStringMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStringMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStructFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStructFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStructMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStructMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrContextHandleInitialize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrContextHandleInitialize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrContextHandleSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrContextHandleSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConvert", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConvert_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrConvert2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrConvert2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrCorrelationFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrCorrelationFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrCorrelationInitialize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrCorrelationInitialize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrCorrelationPass", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrCorrelationPass_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFixedArrayFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFixedArrayFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrGetBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrGetBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrInterfacePointerFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrInterfacePointerFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeDecode", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeDecode_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeDecode2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeDecode2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeDecode3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeDecode3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeEncode", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeEncode_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeEncode2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeEncode2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeEncode3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeEncode3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeFree2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeFree2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrMesTypeFree3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrMesTypeFree3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNsGetBuffer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNsGetBuffer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrNsSendReceive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrNsSendReceive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrOleAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrOleAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrOleFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrOleFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPointerBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPointerBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPointerFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPointerFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPointerMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPointerMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPointerMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPointerMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrPointerUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrPointerUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRangeUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRangeUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSmClientFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSmClientFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSendReceive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSendReceive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerCall2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerCall2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerCallAll", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerCallAll_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerCallNdr64", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerCallNdr64_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerContextMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerContextMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerInitialize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerInitialize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerInitializeNew", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerInitializeNew_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerInitializePartial", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerInitializePartial_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleStructFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleStructFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrStubCall2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrStubCall2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrStubCall3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrStubCall3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrVaryingArrayFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrVaryingArrayFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncAbortCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncAbortCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncCancelCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncCancelCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingBind", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingBind_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingCopy", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingCopy_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingCreateA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingCreateA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingCreateW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingCreateW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqObject", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqObject_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingInqOption", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingInqOption_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingReset", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingReset_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingServerFromClient", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingServerFromClient_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetObject", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetObject_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingSetOption", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingSetOption_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingUnbind", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingUnbind_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcBindingVectorFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcBindingVectorFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcCancelThread", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcCancelThread_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcCancelThreadEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcCancelThreadEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpRegisterA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpRegisterA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpRegisterW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpRegisterW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpResolveBinding", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpResolveBinding_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcEpUnregister", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcEpUnregister_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorAddRecord", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorAddRecord_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorClearInformation", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorClearInformation_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcExceptionFilter", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcExceptionFilter_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcIfIdVectorFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcIfIdVectorFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcIfInqId", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcIfInqId_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcImpersonateClient", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcImpersonateClient_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcImpersonateClient2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcImpersonateClient2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtInqStats", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtInqStats_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingExportA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingExportA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingExportW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingExportW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingImportDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingImportDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingImportNext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingImportNext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingSelect", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingSelect_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcObjectInqType", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcObjectInqType_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcObjectSetInqFn", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcObjectSetInqFn_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcObjectSetType", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcObjectSetType_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcRaiseException", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcRaiseException_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcRevertToSelf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcRevertToSelf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcRevertToSelfEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcRevertToSelfEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqBindings", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqBindings_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInqIf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInqIf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerListen", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerListen_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterIf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterIf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterIf2", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterIf2_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterIf3", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterIf3_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerTestCancel", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerTestCancel_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUnregisterIf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUnregisterIf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerUseProtseqW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerUseProtseqW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcServerYield", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcServerYield_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmClientFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmClientFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmDisableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmDisableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmEnableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmEnableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsContextLockShared", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsContextLockShared_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsDisableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsDisableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsEnableAllocate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsEnableAllocate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsGetContextBinding", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsGetContextBinding_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringBindingComposeA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringBindingComposeA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringBindingComposeW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringBindingComposeW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringBindingParseA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringBindingParseA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringBindingParseW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringBindingParseW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringFreeA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringFreeA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcStringFreeW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcStringFreeW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcTestCancel", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcTestCancel_napi));
    exports.Set("windowssys_windows_win32_system_rpc_RpcUserFree", Napi::Function::New(env, windowssys_windows_win32_system_rpc_RpcUserFree_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidCompare", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidCompare_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidCreate", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidCreate_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidCreateNil", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidCreateNil_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidCreateSequential", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidCreateSequential_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidEqual", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidEqual_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidFromStringA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidFromStringA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidFromStringW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidFromStringW_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidHash", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidHash_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidIsNil", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidIsNil_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidToStringA", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidToStringA_napi));
    exports.Set("windowssys_windows_win32_system_rpc_UuidToStringW", Napi::Function::New(env, windowssys_windows_win32_system_rpc_UuidToStringW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_rpc_napi, nullptr };
struct KmNapiAutoRegister {
    KmNapiAutoRegister() {
        registrar_node.next = km_napi_registrar_head;
        km_napi_registrar_head = &registrar_node;
    }
};
static KmNapiAutoRegister auto_register_instance;

} // namespace

#ifdef KM_NAPI_STANDALONE_MODULE
#if defined(__GNUC__) || defined(__clang__)
__attribute__((visibility("hidden")))
#endif
KmNapiRegistrarNode* km_napi_registrar_head = nullptr;
static Napi::Object KmNapiStandaloneInit(Napi::Env env, Napi::Object exports) {
    for (KmNapiRegistrarNode* cur = km_napi_registrar_head; cur != nullptr; cur = cur->next) {
        cur->register_fn(env, exports);
    }
    return exports;
}
NODE_API_MODULE(NODE_GYP_MODULE_NAME, KmNapiStandaloneInit)
#endif
