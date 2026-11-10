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

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lock, fwrite, lockstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    (void)fwrite;
    (void)lockstate;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(virtualaddress, length, tag);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, timercancelled);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, protocolpartycontext, callparameters, ndispartyhandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisafhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClCloseAddressFamily")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisafhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisafhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, ndispartyhandle, buffer, size);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndissaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisClDeregisterSap")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndissaphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndissaphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndispartyhandle, buffer, size);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle, callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, callparameters, protocolpartycontext, ndispartyhandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, callparameters);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisafhandle, protocolsapcontext, sap, ndissaphandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configurationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCloseConfiguration")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(configurationhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)configurationhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCloseFile")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, callparameters);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndispartyhandle, callmgrpartycontext, callparameters);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisafhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisafhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle, ndispartyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDeactivateVc")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndissaphandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndissaphandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCmDispatchCallConnected")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndisvchandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndissaphandle, ndisvchandle, callparameters);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndisvchandle, callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(closestatus, ndisvchandle, buffer, size);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(dropstatus, ndispartyhandle, buffer, size);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndispartyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndispartyhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle, ndispartyhandle, callmgrpartycontext, callparameters);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle, callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisafhandle, callmgrafcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisafhandle;
    (void)callmgrafcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndissaphandle, callmgrsapcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndissaphandle;
    (void)callmgrsapcontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, baseinstancename, vcinstancename);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisbindinghandle, ndisafhandle, protocolvccontext, ndisvchandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisCoDeleteVc")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, tapicallid);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, buffer, poolhandle, memorydescriptor, offset, length);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisDeregisterTdiCallBack")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(virtualaddress, length, memoryflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)virtualaddress;
    (void)length;
    (void)memoryflags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGeneratePartialCancelId")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pidlecount, pkernelanduser, pindex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pidlecount;
    (void)pkernelanduser;
    (void)pindex;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcpuusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetCurrentProcessorCpuUsage")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pcpuusage);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcpuusage;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisroutinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetRoutineAddress")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisroutinename);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)ndisroutinename;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetSharedDataAlignment")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisGetVersion")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(driverhandle, protocolhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)driverhandle;
    (void)protocolhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(driverhandle, deviceinstance);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisminiporthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMDeInitializeDeviceInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisminiporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisminiporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisbindinghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisIMGetBindingContext")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisbindinghandle);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)ndisbindinghandle;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(driverhandle, driverinstance, devicecontext);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeEvent")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisInitializeReadWriteLock")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(destination, source);
    } else {
        errno = ENOSYS;
    }
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, timerfunction, functioncontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timerfunction;
    (void)functioncontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportadapterhandle, length, cached, context);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, timercancelled);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)timercancelled;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCloseLog")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(loghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle, callparameters);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportadapterhandle, ndisafhandle, miniportvccontext, ndisvchandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmDeactivateVc")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisvchandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMCmDeleteVc")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndisvchandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndisvchandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportadapterhandle, addressfamily, cmcharacteristics, sizeofcmcharacteristics);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle, callparameters);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    (void)callparameters;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisvchandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)ndisvchandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportadapterhandle, size, loghandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMDeregisterDmaChannel")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportdmahandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportadapterhandle, initialport, numberofports, portoffset);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMFlushLog")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(loghandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)loghandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportadapterhandle, length, cached, virtualaddress, physicaladdress);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportadapterhandle, physicaldeviceobject, functionaldeviceobject, nextdeviceobject, allocatedresources, allocatedresourcestranslated);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMGetDmaAlignment")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportadapterhandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)miniportadapterhandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, miniportadapterhandle, timerfunction, functioncontext);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(virtualaddress, miniportadapterhandle, physicaladdress, length);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(padapterinstancename, miniporthandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniportdmahandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMReadDmaCounter")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportdmahandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)miniportdmahandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniportdmahandle, miniportadapterhandle, dmachannel, dma32bitaddresses, dmadescription, maximumlength);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(portoffset, miniportadapterhandle, initialport, numberofports);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* miniporthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMRemoveMiniport")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(miniporthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)miniporthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, millisecondperiod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)millisecondperiod;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t microsecondstosleep = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisMSleep")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(microsecondstosleep);
    } else {
        errno = ENOSYS;
    }
#else
    (void)microsecondstosleep;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(miniportadapterhandle, virtualaddress, length);
    } else {
        errno = ENOSYS;
    }
#else
    (void)miniportadapterhandle;
    (void)virtualaddress;
    (void)length;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(loghandle, logbuffer, logbuffersize);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, mappedbuffer, filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)mappedbuffer;
    (void)filehandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, configurationhandle, arg_2_index, keyname, keyhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)status;
    (void)configurationhandle;
    (void)arg_2_index;
    (void)keyname;
    (void)keyhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, configurationhandle, subkeyname, subkeyhandle);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, filehandle, filelength, filename, highestacceptableaddress);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(padapterinstancename, ndisbindinghandle);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(padapterinstancename, bindingcontext);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisprotocolhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisReEnumerateProtocolBindings")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndisprotocolhandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndisprotocolhandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, parametervalue, configurationhandle, keyword, parametertype);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, networkaddress, networkaddresslength, configurationhandle);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(registercallback, pnphandler);
    } else {
        errno = ENOSYS;
    }
#else
    (void)registercallback;
    (void)pnphandler;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(lock, lockstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lock;
    (void)lockstate;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisResetEvent")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSetEvent")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(event);
    } else {
        errno = ENOSYS;
    }
#else
    (void)event;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndistimer, millisecondsperiod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndistimer;
    (void)millisecondsperiod;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(timer, millisecondstodelay);
    } else {
        errno = ENOSYS;
    }
#else
    (void)timer;
    (void)millisecondstodelay;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndistimer, millisecondstodelay, functioncontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ndistimer;
    (void)millisecondstodelay;
    (void)functioncontext;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, ndisdmahandle, buffer, offset, length, writetodevice);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisSystemProcessorCount")));
    }
    int8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisUnmapFile")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(filehandle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filehandle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(ndisadapterhandle, length, virtualaddress, physicaladdress);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(event, mstowait);
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
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(status, configurationhandle, keyword, parametervalue);
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ndisadapterhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t errorcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t numberoferrorvalues = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t km_vac = km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0;
    int64_t km_va0 = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t km_va1 = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int64_t km_va2 = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    int64_t km_va3 = km_info.Length() > 7 ? km_napi_arg_i64(km_info[7]) : 0;
#ifdef _WIN32
    typedef void (*km_fn_t)(void*, uint32_t, uint32_t, ...);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ndis.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NdisWriteErrorLogEntry")));
    }
    if (km_fn_ptr != nullptr) {
        switch (km_vac) {
            case 0: km_fn_ptr(ndisadapterhandle, errorcode, numberoferrorvalues); break;
            case 1: km_fn_ptr(ndisadapterhandle, errorcode, numberoferrorvalues, static_cast<intptr_t>(km_va0)); break;
            case 2: km_fn_ptr(ndisadapterhandle, errorcode, numberoferrorvalues, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1)); break;
            case 3: km_fn_ptr(ndisadapterhandle, errorcode, numberoferrorvalues, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2)); break;
            default: km_fn_ptr(ndisadapterhandle, errorcode, numberoferrorvalues, static_cast<intptr_t>(km_va0), static_cast<intptr_t>(km_va1), static_cast<intptr_t>(km_va2), static_cast<intptr_t>(km_va3)); break;
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
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(loghandle, eventcode, uniqueeventvalue, numstrings, stringslist, datasize, data);
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
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_networkmanagement_ndis_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry_napi));
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
