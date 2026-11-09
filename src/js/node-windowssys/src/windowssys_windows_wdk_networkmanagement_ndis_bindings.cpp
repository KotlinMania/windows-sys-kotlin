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

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool fwrite = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* lockstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisAcquireReadWriteLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lock, fwrite, lockstate);
#else
    (void)lock;
    (void)fwrite;
    (void)lockstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisAllocateMemoryWithTag")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualaddress, length, tag) : -1;
#else
    (void)virtualaddress;
    (void)length;
    (void)tag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timercancelled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCancelTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, timercancelled);
#else
    (void)timer;
    (void)timercancelled;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protocolpartycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClAddParty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, protocolpartycontext, callparameters, ndispartyhandle) : -1;
#else
    (void)ndisvchandle;
    (void)protocolpartycontext;
    (void)callparameters;
    (void)ndispartyhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClCloseAddressFamily")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisafhandle) : -1;
#else
    (void)ndisafhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClCloseCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, ndispartyhandle, buffer, size) : -1;
#else
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClDeregisterSap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndissaphandle) : -1;
#else
    (void)ndissaphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClDropParty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndispartyhandle, buffer, size) : -1;
#else
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClIncomingCallComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle, callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* protocolpartycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClMakeCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, callparameters, protocolpartycontext, ndispartyhandle) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    (void)protocolpartycontext;
    (void)ndispartyhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClModifyCallQoS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protocolsapcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClRegisterSap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisafhandle, protocolsapcontext, sap, ndissaphandle) : -1;
#else
    (void)ndisafhandle;
    (void)protocolsapcontext;
    (void)sap;
    (void)ndissaphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCloseConfiguration")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(configurationhandle);
#else
    (void)configurationhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCloseFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filehandle);
#else
    (void)filehandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmActivateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callmgrpartycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmAddPartyComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndispartyhandle, callmgrpartycontext, callparameters);
#else
    (void)status;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmCloseAddressFamilyComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisafhandle);
#else
    (void)status;
    (void)ndisafhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmCloseCallComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle, ndispartyhandle);
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDeactivateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDeregisterSapComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndissaphandle);
#else
    (void)status;
    (void)ndissaphandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchCallConnected")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndisvchandle);
#else
    (void)ndisvchandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndissaphandle, ndisvchandle, callparameters) : -1;
#else
    (void)ndissaphandle;
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCallQoSChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndisvchandle, callparameters);
#else
    (void)ndisvchandle;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t closestatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchIncomingCloseCall")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(closestatus, ndisvchandle, buffer, size);
#else
    (void)closestatus;
    (void)ndisvchandle;
    (void)buffer;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t dropstatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchIncomingDropParty")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dropstatus, ndispartyhandle, buffer, size);
#else
    (void)dropstatus;
    (void)ndispartyhandle;
    (void)buffer;
    (void)size;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDropPartyComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndispartyhandle);
#else
    (void)status;
    (void)ndispartyhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ndispartyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callmgrpartycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmMakeCallComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle, ndispartyhandle, callmgrpartycontext, callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    (void)callmgrpartycontext;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmModifyCallQoSComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle, callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callmgrafcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmOpenAddressFamilyComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisafhandle, callmgrafcontext);
#else
    (void)status;
    (void)ndisafhandle;
    (void)callmgrafcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callmgrsapcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmRegisterSapComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndissaphandle, callmgrsapcontext);
#else
    (void)status;
    (void)ndissaphandle;
    (void)callmgrsapcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* vcinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCoAssignInstanceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, baseinstancename, vcinstancename) : -1;
#else
    (void)ndisvchandle;
    (void)baseinstancename;
    (void)vcinstancename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* protocolvccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCoCreateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisbindinghandle, ndisafhandle, protocolvccontext, ndisvchandle) : -1;
#else
    (void)ndisbindinghandle;
    (void)ndisafhandle;
    (void)protocolvccontext;
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCoDeleteVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tapicallid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCoGetTapiCallId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, tapicallid) : -1;
#else
    (void)ndisvchandle;
    (void)tapicallid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool writetodevice = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCompleteDmaTransfer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poolhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* memorydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCopyBuffer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, buffer, poolhandle, memorydescriptor, offset, length);
#else
    (void)status;
    (void)buffer;
    (void)poolhandle;
    (void)memorydescriptor;
    (void)offset;
    (void)length;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisDeregisterTdiCallBack")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t memoryflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisFreeMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(virtualaddress, length, memoryflags);
#else
    (void)virtualaddress;
    (void)length;
    (void)memoryflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGeneratePartialCancelId")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pidlecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkernelanduser = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCounts")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pidlecount, pkernelanduser, pindex);
#else
    (void)pidlecount;
    (void)pkernelanduser;
    (void)pindex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcpuusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCpuUsage")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pcpuusage);
#else
    (void)pcpuusage;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisroutinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetRoutineAddress")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisroutinename) : NULL;
#else
    (void)ndisroutinename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetSharedDataAlignment")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* protocolhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMAssociateMiniport")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(driverhandle, protocolhandle);
#else
    (void)driverhandle;
    (void)protocolhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMCancelInitializeDeviceInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverhandle, deviceinstance) : -1;
#else
    (void)driverhandle;
    (void)deviceinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisminiporthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMDeInitializeDeviceInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisminiporthandle) : -1;
#else
    (void)ndisminiporthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMGetBindingContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisbindinghandle) : NULL;
#else
    (void)ndisbindinghandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* driverinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* devicecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMInitializeDeviceInstanceEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverhandle, driverinstance, devicecontext) : -1;
#else
    (void)driverhandle;
    (void)driverinstance;
    (void)devicecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeEvent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(event);
#else
    (void)event;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeReadWriteLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lock);
#else
    (void)lock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destination = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeString")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(destination, source);
#else
    (void)destination;
    (void)source;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timerfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* functioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, timerfunction, functioncontext);
#else
    (void)timer;
    (void)timerfunction;
    (void)functioncontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool cached = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* physicaladdress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMAllocateSharedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool cached = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMAllocateSharedMemoryAsync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportadapterhandle, length, cached, context) : -1;
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timercancelled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCancelTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, timercancelled);
#else
    (void)timer;
    (void)timercancelled;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCloseLog")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(loghandle);
#else
    (void)loghandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmActivateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle, callparameters) : -1;
#else
    (void)ndisvchandle;
    (void)callparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* miniportvccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmCreateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportadapterhandle, ndisafhandle, miniportvccontext, ndisvchandle) : -1;
#else
    (void)miniportadapterhandle;
    (void)ndisafhandle;
    (void)miniportvccontext;
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmDeactivateVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmDeleteVc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ndisvchandle) : -1;
#else
    (void)ndisvchandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* addressfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cmcharacteristics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t sizeofcmcharacteristics = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmRegisterAddressFamily")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportadapterhandle, addressfamily, cmcharacteristics, sizeofcmcharacteristics) : -1;
#else
    (void)miniportadapterhandle;
    (void)addressfamily;
    (void)cmcharacteristics;
    (void)sizeofcmcharacteristics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCoActivateVcComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle, callparameters);
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCoDeactivateVcComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisvchandle);
#else
    (void)status;
    (void)ndisvchandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCreateLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportadapterhandle, size, loghandle) : -1;
#else
    (void)miniportadapterhandle;
    (void)size;
    (void)loghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMDeregisterDmaChannel")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportdmahandle);
#else
    (void)miniportdmahandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t initialport = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t numberofports = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* portoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMDeregisterIoPortRange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportadapterhandle, initialport, numberofports, portoffset);
#else
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    (void)portoffset;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMFlushLog")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(loghandle);
#else
    (void)loghandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool cached = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t physicaladdress = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMFreeSharedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
#else
    (void)miniportadapterhandle;
    (void)length;
    (void)cached;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* physicaldeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* functionaldeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nextdeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* allocatedresources = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* allocatedresourcestranslated = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMGetDeviceProperty")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportadapterhandle, physicaldeviceobject, functionaldeviceobject, nextdeviceobject, allocatedresources, allocatedresourcestranslated);
#else
    (void)miniportadapterhandle;
    (void)physicaldeviceobject;
    (void)functionaldeviceobject;
    (void)nextdeviceobject;
    (void)allocatedresources;
    (void)allocatedresourcestranslated;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMGetDmaAlignment")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportadapterhandle) : 0;
#else
    (void)miniportadapterhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timerfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* functioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMInitializeTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, miniportadapterhandle, timerfunction, functioncontext);
#else
    (void)timer;
    (void)miniportadapterhandle;
    (void)timerfunction;
    (void)functioncontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t physicaladdress = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMMapIoSpace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualaddress, miniportadapterhandle, physicaladdress, length) : -1;
#else
    (void)virtualaddress;
    (void)miniportadapterhandle;
    (void)physicaladdress;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* padapterinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniporthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMQueryAdapterInstanceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(padapterinstancename, miniporthandle) : -1;
#else
    (void)padapterinstancename;
    (void)miniporthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMReadDmaCounter")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportdmahandle) : 0;
#else
    (void)miniportdmahandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dmachannel = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool dma32bitaddresses = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* dmadescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t maximumlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMRegisterDmaChannel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniportdmahandle, miniportadapterhandle, dmachannel, dma32bitaddresses, dmadescription, maximumlength) : -1;
#else
    (void)miniportdmahandle;
    (void)miniportadapterhandle;
    (void)dmachannel;
    (void)dma32bitaddresses;
    (void)dmadescription;
    (void)maximumlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t initialport = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t numberofports = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMRegisterIoPortRange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portoffset, miniportadapterhandle, initialport, numberofports) : -1;
#else
    (void)portoffset;
    (void)miniportadapterhandle;
    (void)initialport;
    (void)numberofports;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniporthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMRemoveMiniport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(miniporthandle) : -1;
#else
    (void)miniporthandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t millisecondperiod = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMSetPeriodicTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, millisecondperiod);
#else
    (void)timer;
    (void)millisecondperiod;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t microsecondstosleep = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMSleep")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(microsecondstosleep);
#else
    (void)microsecondstosleep;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMUnmapIoSpace")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(miniportadapterhandle, virtualaddress, length);
#else
    (void)miniportadapterhandle;
    (void)virtualaddress;
    (void)length;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t logbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMWriteLogData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loghandle, logbuffer, logbuffersize) : -1;
#else
    (void)loghandle;
    (void)logbuffer;
    (void)logbuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mappedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMapFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, mappedbuffer, filehandle);
#else
    (void)status;
    (void)mappedbuffer;
    (void)filehandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* keyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* keyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByIndex")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, configurationhandle, arg_2_index, keyname, keyhandle);
#else
    (void)status;
    (void)configurationhandle;
    (void)arg_2_index;
    (void)keyname;
    (void)keyhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subkeyhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisOpenConfigurationKeyByName")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, configurationhandle, subkeyname, subkeyhandle);
#else
    (void)status;
    (void)configurationhandle;
    (void)subkeyname;
    (void)subkeyhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t highestacceptableaddress = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisOpenFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, filehandle, filelength, filename, highestacceptableaddress);
#else
    (void)status;
    (void)filehandle;
    (void)filelength;
    (void)filename;
    (void)highestacceptableaddress;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* padapterinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisQueryAdapterInstanceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(padapterinstancename, ndisbindinghandle) : -1;
#else
    (void)padapterinstancename;
    (void)ndisbindinghandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* padapterinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bindingcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisQueryBindInstanceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(padapterinstancename, bindingcontext) : -1;
#else
    (void)padapterinstancename;
    (void)bindingcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisprotocolhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisReEnumerateProtocolBindings")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndisprotocolhandle);
#else
    (void)ndisprotocolhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* keyword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t parametertype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisReadConfiguration")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, parametervalue, configurationhandle, keyword, parametertype);
#else
    (void)status;
    (void)parametervalue;
    (void)configurationhandle;
    (void)keyword;
    (void)parametertype;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* networkaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* networkaddresslength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisReadNetworkAddress")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, networkaddress, networkaddresslength, configurationhandle);
#else
    (void)status;
    (void)networkaddress;
    (void)networkaddresslength;
    (void)configurationhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* registercallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pnphandler = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisRegisterTdiCallBack")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(registercallback, pnphandler);
#else
    (void)registercallback;
    (void)pnphandler;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lockstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisReleaseReadWriteLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lock, lockstate);
#else
    (void)lock;
    (void)lockstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisResetEvent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(event);
#else
    (void)event;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetEvent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(event);
#else
    (void)event;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndistimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t millisecondsperiod = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetPeriodicTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndistimer, millisecondsperiod);
#else
    (void)ndistimer;
    (void)millisecondsperiod;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t millisecondstodelay = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetTimer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(timer, millisecondstodelay);
#else
    (void)timer;
    (void)millisecondstodelay;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndistimer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t millisecondstodelay = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* functioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetTimerEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndistimer, millisecondstodelay, functioncontext);
#else
    (void)ndistimer;
    (void)millisecondstodelay;
    (void)functioncontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ndisdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool writetodevice = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetupDmaTransfer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
#else
    (void)status;
    (void)ndisdmahandle;
    (void)buffer;
    (void)offset;
    (void)length;
    (void)writetodevice;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSystemProcessorCount")));
    }
    int8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisUnmapFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filehandle);
#else
    (void)filehandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* virtualaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t physicaladdress = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisUpdateSharedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ndisadapterhandle, length, virtualaddress, physicaladdress);
#else
    (void)ndisadapterhandle;
    (void)length;
    (void)virtualaddress;
    (void)physicaladdress;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t mstowait = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisWaitEvent")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(event, mstowait) : false;
#else
    (void)event;
    (void)mstowait;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* status = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* keyword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisWriteConfiguration")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(status, configurationhandle, keyword, parametervalue);
#else
    (void)status;
    (void)configurationhandle;
    (void)keyword;
    (void)parametervalue;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eventcode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uniqueeventvalue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t numstrings = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t datasize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisWriteEventLogEntry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loghandle, eventcode, uniqueeventvalue, numstrings, stringslist, datasize, data) : -1;
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_networkmanagement_ndis_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_wdk_networkmanagement_ndis_napi, nullptr };
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
