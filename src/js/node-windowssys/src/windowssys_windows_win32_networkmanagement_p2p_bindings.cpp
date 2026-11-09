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

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtClose")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hdrt);
#else
    (void)hdrt;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtContinueSearch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext) : -1;
#else
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plocalcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreateDerivedKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plocalcert, pkey) : -1;
#else
    (void)plocalcert;
    (void)pkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prootcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* plocalcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppsecurityprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreateDerivedKeySecurityProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prootcert, plocalcert, ppsecurityprovider) : -1;
#else
    (void)prootcert;
    (void)plocalcert;
    (void)ppsecurityprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pwszaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppmodule = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreateDnsBootstrapResolver")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(port, pwszaddress, ppmodule) : -1;
#else
    (void)port;
    (void)pwszaddress;
    (void)ppmodule;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwscopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwlocalitythreshold = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phtransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreateIpv6UdpTransport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, dwscopeid, dwlocalitythreshold, pwport, phtransport) : -1;
#else
    (void)scope;
    (void)dwscopeid;
    (void)dwlocalitythreshold;
    (void)pwport;
    (void)phtransport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppsecurityprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreateNullSecurityProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppsecurityprovider) : -1;
#else
    (void)ppsecurityprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fpublish = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzcloudname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwzpublishingidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppresolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtCreatePnrpBootstrapResolver")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fpublish, pwzpeername, pwzcloudname, pwzpublishingidentity, ppresolver) : -1;
#else
    (void)fpublish;
    (void)pwzpeername;
    (void)pwzcloudname;
    (void)pwzpublishingidentity;
    (void)ppresolver;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecurityprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtDeleteDerivedKeySecurityProvider")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(psecurityprovider);
#else
    (void)psecurityprovider;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* presolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtDeleteDnsBootstrapResolver")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(presolver);
#else
    (void)presolver;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htransport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drttransport.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtDeleteIpv6UdpTransport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htransport) : -1;
#else
    (void)htransport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecurityprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtDeleteNullSecurityProvider")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(psecurityprovider);
#else
    (void)psecurityprovider;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* presolver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drtprov.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtDeletePnrpBootstrapResolver")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(presolver);
#else
    (void)presolver;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtEndSearch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext) : -1;
#else
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uleventdatalen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* peventdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetEventData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, uleventdatalen, peventdata) : -1;
#else
    (void)hdrt;
    (void)uleventdatalen;
    (void)peventdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puleventdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetEventDataSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, puleventdatalen) : -1;
#else
    (void)hdrt;
    (void)puleventdatalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulcbinstancenamesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwzdrtinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetInstanceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, ulcbinstancenamesize, pwzdrtinstancename) : -1;
#else
    (void)hdrt;
    (void)ulcbinstancenamesize;
    (void)pwzdrtinstancename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulcbinstancenamesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetInstanceNameSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, pulcbinstancenamesize) : -1;
#else
    (void)hdrt;
    (void)pulcbinstancenamesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulsearchpathsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psearchpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetSearchPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext, ulsearchpathsize, psearchpath) : -1;
#else
    (void)hsearchcontext;
    (void)ulsearchpathsize;
    (void)psearchpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulsearchpathsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetSearchPathSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext, pulsearchpathsize) : -1;
#else
    (void)hsearchcontext;
    (void)pulsearchpathsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulsearchresultsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psearchresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetSearchResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext, ulsearchresultsize, psearchresult) : -1;
#else
    (void)hsearchcontext;
    (void)ulsearchresultsize;
    (void)psearchresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulsearchresultsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtGetSearchResultSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsearchcontext, pulsearchresultsize) : -1;
#else
    (void)hsearchcontext;
    (void)pulsearchresultsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psettings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtOpen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psettings, hevent, pvcontext, phdrt) : -1;
#else
    (void)psettings;
    (void)hevent;
    (void)pvcontext;
    (void)phdrt;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvkeycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phkeyregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtRegisterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, pregistration, pvkeycontext, phkeyregistration) : -1;
#else
    (void)hdrt;
    (void)pregistration;
    (void)pvkeycontext;
    (void)phkeyregistration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdrt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t timeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* hsearchcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtStartSearch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdrt, pkey, pinfo, timeout, hevent, pvcontext, hsearchcontext) : -1;
#else
    (void)hdrt;
    (void)pkey;
    (void)pinfo;
    (void)timeout;
    (void)hevent;
    (void)pvcontext;
    (void)hsearchcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtUnregisterKey")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hkeyregistration);
#else
    (void)hkeyregistration;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkeyregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pappdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("drt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrtUpdateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkeyregistration, pappdata) : -1;
#else
    (void)hkeyregistration;
    (void)pappdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzcontactdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppcontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabAddContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzcontactdata, ppcontact) : -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pccontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabAsyncInviteContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pccontact, pcendpoint, pcinvitation, hevent, phinvitation) : -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabAsyncInviteEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, pcinvitation, hevent, phinvitation) : -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)hevent;
    (void)phinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabCancelInvitation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinvitation) : -1;
#else
    (void)hinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabCloseHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinvitation) : -1;
#else
    (void)hinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabDeleteContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzpeername) : -1;
#else
    (void)pwzpeername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabDeleteEndpointData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pobjectid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabDeleteObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pobjectid) : -1;
#else
    (void)pobjectid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t registrationtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumApplicationRegistrationInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(registrationtype, phpeerenum) : -1;
#else
    (void)registrationtype;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumApplications")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, papplicationid, phpeerenum) : -1;
#else
    (void)pcendpoint;
    (void)papplicationid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumContacts")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pccontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumEndpoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pccontact, phpeerenum) : -1;
#else
    (void)pccontact;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pobjectid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumObjects")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, pobjectid, phpeerenum) : -1;
#else
    (void)pcendpoint;
    (void)pobjectid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabEnumPeopleNearMe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzcontactdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabExportContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzpeername, ppwzcontactdata) : -1;
#else
    (void)pwzpeername;
    (void)ppwzcontactdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pplaunchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetAppLaunchInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pplaunchinfo) : -1;
#else
    (void)pplaunchinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t registrationtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppapplication = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetApplicationRegistrationInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(papplicationid, registrationtype, ppapplication) : -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    (void)ppapplication;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppcontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzpeername, ppcontact) : -1;
#else
    (void)pwzpeername;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppwzendpointname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetEndpointName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppwzendpointname) : -1;
#else
    (void)ppwzendpointname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppeventdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetEventData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent, ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppinvitationresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetInvitationResponse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinvitation, ppinvitationresponse) : -1;
#else
    (void)hinvitation;
    (void)ppinvitationresponse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppresenceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetPresenceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, pppresenceinfo) : -1;
#else
    (void)pcendpoint;
    (void)pppresenceinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwsigninoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabGetSigninOptions")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwsigninoptions) : -1;
#else
    (void)pdwsigninoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pccontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabInviteContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pccontact, pcendpoint, pcinvitation, ppresponse) : -1;
#else
    (void)pccontact;
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabInviteEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, pcinvitation, ppresponse) : -1;
#else
    (void)pcendpoint;
    (void)pcinvitation;
    (void)ppresponse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzcontactdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppcontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabParseContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzcontactdata, ppcontact) : -1;
#else
    (void)pwzcontactdata;
    (void)ppcontact;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzcontactdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabQueryContactData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint, ppwzcontactdata) : -1;
#else
    (void)pcendpoint;
    (void)ppwzcontactdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabRefreshEndpointData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcapplication = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t registrationtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabRegisterApplication")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcapplication, registrationtype) : -1;
#else
    (void)pcapplication;
    (void)registrationtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ceventregistration = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* peventregistrations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabRegisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, ceventregistration, peventregistrations, phpeerevent) : -1;
#else
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzendpointname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSetEndpointName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzendpointname) : -1;
#else
    (void)pwzendpointname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSetObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcobject) : -1;
#else
    (void)pcobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcpresenceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSetPresenceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcpresenceinfo) : -1;
#else
    (void)pcpresenceinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabShutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsigninoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSignin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndparent, dwsigninoptions) : -1;
#else
    (void)hwndparent;
    (void)dwsigninoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwsigninoptions = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSignout")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwsigninoptions) : -1;
#else
    (void)dwsigninoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversionrequested = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversionrequested) : -1;
#else
    (void)wversionrequested;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabSubscribeEndpointData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* papplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t registrationtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabUnregisterApplication")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(papplicationid, registrationtype) : -1;
#else
    (void)papplicationid;
    (void)registrationtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabUnregisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabUnsubscribeEndpointData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcendpoint) : -1;
#else
    (void)pcendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontact = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCollabUpdateContact")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontact) : -1;
#else
    (void)pcontact;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzclassifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerCreatePeerName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzclassifier, ppwzpeername) : -1;
#else
    (void)pwzidentity;
    (void)pwzclassifier;
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientAddContentInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientAddData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, cbnumberofbytes, pbuffer, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbmaxnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwtimeoutinmilliseconds = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientBlockRead")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer, dwtimeoutinmilliseconds, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientCancelAsyncOperation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, poverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientCloseContent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientCompleteContentInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcontenttag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientFlushContent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int32_t peerdistclientinfoclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientGetInformationByHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize, lpinformation) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)peerdistclientinfoclass;
    (void)dwbuffersize;
    (void)lpinformation;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pcontenttag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* phcontenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientOpenContent")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey, phcontenthandle) : 0;
#else
    (void)hpeerdist;
    (void)pcontenttag;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontenthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontenthandle = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbmaxnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwtimeoutinmilliseconds = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistClientStreamRead")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontenthandle, cbmaxnumberofbytes, pbuffer, dwtimeoutinmilliseconds, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontenthandle;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)dwtimeoutinmilliseconds;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpnumberofbytestransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bwait = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistGetOverlappedResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpoverlapped, lpnumberofbytestransferred, bwait) : -1;
#else
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ppeerdiststatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistGetStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ppeerdiststatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistGetStatusEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppeerdiststatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcompletionport, ulcompletionkey, lpoverlapped, ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppeerdiststatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistRegisterForStatusChangeNotificationEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcompletionport, ulcompletionkey, lpoverlapped, ppeerdiststatus) : 0;
#else
    (void)hpeerdist;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)lpoverlapped;
    (void)ppeerdiststatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cbcontentidentifier = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcontentidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerCancelAsyncOperation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, poverlapped) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontentinfo = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerCloseContentInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontentinfo) : 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hstream = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerCloseStreamHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hstream) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cbcontentidentifier = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcontentidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t ullcontentoffset = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t cbcontentlength = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0;
    void* phcontentinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, ullcontentoffset, cbcontentlength, hcompletionport, ulcompletionkey, phcontentinfo) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cbcontentidentifier = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcontentidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t ullcontentoffset = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint64_t cbcontentlength = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* pretrievaloptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    void* phcontentinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerOpenContentInformationEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, ullcontentoffset, cbcontentlength, pretrievaloptions, hcompletionport, ulcompletionkey, phcontentinfo) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)ullcontentoffset;
    (void)cbcontentlength;
    (void)pretrievaloptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phcontentinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hstream = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerPublishAddToStream")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hstream, cbnumberofbytes, pbuffer, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)cbnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hstream = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerPublishCompleteStream")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hstream, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hstream;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cbcontentidentifier = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcontentidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t cbcontentlength = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* ppublishoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* hcompletionport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint64_t ulcompletionkey = km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0;
    void* phstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerPublishStream")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier, cbcontentlength, ppublishoptions, hcompletionport, ulcompletionkey, phstream) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    (void)cbcontentlength;
    (void)ppublishoptions;
    (void)hcompletionport;
    (void)ulcompletionkey;
    (void)phstream;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hcontentinfo = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t cbmaxnumberofbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerRetrieveContentInformation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, hcontentinfo, cbmaxnumberofbytes, pbuffer, lpoverlapped) : 0;
#else
    (void)hpeerdist;
    (void)hcontentinfo;
    (void)cbmaxnumberofbytes;
    (void)pbuffer;
    (void)lpoverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t cbcontentidentifier = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcontentidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistServerUnpublish")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist, cbcontentidentifier, pcontentidentifier) : 0;
#else
    (void)hpeerdist;
    (void)cbcontentidentifier;
    (void)pcontentidentifier;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistShutdown")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist) : 0;
#else
    (void)hpeerdist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwversionrequested = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phpeerdist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwsupportedversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistStartup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwversionrequested, phpeerdist, pdwsupportedversion) : 0;
#else
    (void)dwversionrequested;
    (void)phpeerdist;
    (void)pdwsupportedversion;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hpeerdist = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("peerdist.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerDistUnregisterForStatusChangeNotification")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerdist) : 0;
#else
    (void)hpeerdist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerEndEnumeration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum) : -1;
#else
    (void)hpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerEnumGroups")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, phpeerenum) : -1;
#else
    (void)pwzidentity;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerEnumIdentities")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phpeerenum) : -1;
#else
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerFreeData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerFreeData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvdata);
#else
    (void)pvdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGetItemCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum, pcount) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pppvitems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGetNextItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum, pcount, pppvitems) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphAddRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, precord, precordid) : -1;
#else
    (void)hgraph;
    (void)precord;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph) : -1;
#else
    (void)hgraph;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullconnectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphCloseDirectConnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, ullconnectionid) : -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphConnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzpeerid, paddress, pullconnectionid) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pgraphproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psecurityinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pgraphproperties, pwzdatabasename, psecurityinterface, phgraph) : -1;
#else
    (void)pgraphproperties;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)phgraph;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzgraphid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphDelete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzgraphid, pwzpeerid, pwzdatabasename) : -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flocal = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphDeleteRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, precordid, flocal) : -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)flocal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphEndEnumeration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum) : -1;
#else
    (void)hpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphEnumConnections")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, dwflags, phpeerenum) : -1;
#else
    (void)hgraph;
    (void)dwflags;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphEnumNodes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzpeerid, phpeerenum) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphEnumRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, precordtype, pwzpeerid, phpeerenum) : -1;
#else
    (void)hgraph;
    (void)precordtype;
    (void)pwzpeerid;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphExportDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzfilepath) : -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphFreeData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvdata);
#else
    (void)pvdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppeventdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetEventData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent, ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetItemCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum, pcount) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pppvitems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetNextItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerenum, pcount, pppvitems) : -1;
#else
    (void)hpeerenum;
    (void)pcount;
    (void)pppvitems;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullnodeid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ppnodeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetNodeInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, ullnodeid, ppnodeinfo) : -1;
#else
    (void)hgraph;
    (void)ullnodeid;
    (void)ppnodeinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppgraphproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, ppgraphproperties) : -1;
#else
    (void)hgraph;
    (void)ppgraphproperties;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, precordid, pprecord) : -1;
#else
    (void)hgraph;
    (void)precordid;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphGetStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pdwstatus) : -1;
#else
    (void)hgraph;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphImportDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzfilepath) : -1;
#else
    (void)hgraph;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwscope = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwscopeid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t wport = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphListen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, dwscope, dwscopeid, wport) : -1;
#else
    (void)hgraph;
    (void)dwscope;
    (void)dwscopeid;
    (void)wport;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzgraphid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psecurityinterface = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t crecordtypesyncprecedence = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* precordtypesyncprecedence = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* phgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphOpen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzgraphid, pwzpeerid, pwzdatabasename, psecurityinterface, crecordtypesyncprecedence, precordtypesyncprecedence, phgraph) : -1;
#else
    (void)pwzgraphid;
    (void)pwzpeerid;
    (void)pwzdatabasename;
    (void)psecurityinterface;
    (void)crecordtypesyncprecedence;
    (void)precordtypesyncprecedence;
    (void)phgraph;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpeerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphOpenDirectConnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzpeerid, paddress, pullconnectionid) : -1;
#else
    (void)hgraph;
    (void)pwzpeerid;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pftpeertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pftuniversaltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphPeerTimeToUniversalTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pftpeertime, pftuniversaltime) : -1;
#else
    (void)hgraph;
    (void)pftpeertime;
    (void)pftuniversaltime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ceventregistrations = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* peventregistrations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphRegisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, hevent, ceventregistrations, peventregistrations, phpeerevent) : -1;
#else
    (void)hgraph;
    (void)hevent;
    (void)ceventregistrations;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphSearchRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzcriteria, phpeerenum) : -1;
#else
    (void)hgraph;
    (void)pwzcriteria;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullconnectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphSendData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, ullconnectionid, ptype, cbdata, pvdata) : -1;
#else
    (void)hgraph;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphSetNodeAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pwzattributes) : -1;
#else
    (void)hgraph;
    (void)pwzattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fpresent = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphSetPresence")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, fpresent) : -1;
#else
    (void)hgraph;
    (void)fpresent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgraphproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphSetProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pgraphproperties) : -1;
#else
    (void)hgraph;
    (void)pgraphproperties;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphShutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversionrequested = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pversiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversionrequested, pversiondata) : -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pftuniversaltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pftpeertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphUniversalTimeToPeerTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, pftuniversaltime, pftpeertime) : -1;
#else
    (void)hgraph;
    (void)pftuniversaltime;
    (void)pftpeertime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphUnregisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphUpdateRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, precord) : -1;
#else
    (void)hgraph;
    (void)precord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgraph = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t crecordids = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* precordids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2pgraph.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGraphValidateDeferredRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgraph, crecordids, precordids) : -1;
#else
    (void)hgraph;
    (void)crecordids;
    (void)precordids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupAddRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, precord, precordid) : -1;
#else
    (void)hgroup;
    (void)precord;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullconnectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupCloseDirectConnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, ullconnectionid) : -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupConnect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t caddresses = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* paddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupConnectByAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, caddresses, paddresses) : -1;
#else
    (void)hgroup;
    (void)caddresses;
    (void)paddresses;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pproperties, phgroup) : -1;
#else
    (void)pproperties;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzidentityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pftexpiration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t croles = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* proles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupCreateInvitation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzidentityinfo, pftexpiration, croles, proles, ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)pwzidentityinfo;
    (void)pftexpiration;
    (void)croles;
    (void)proles;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupCreatePasswordInvitation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzgrouppeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupDelete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzgrouppeername) : -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupDeleteRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, precordid) : -1;
#else
    (void)hgroup;
    (void)precordid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupEnumConnections")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwflags, phpeerenum) : -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupEnumMembers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, dwflags, pwzidentity, phpeerenum) : -1;
#else
    (void)hgroup;
    (void)dwflags;
    (void)pwzidentity;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupEnumRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, precordtype, phpeerenum) : -1;
#else
    (void)hgroup;
    (void)precordtype;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwzxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupExportConfig")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzpassword, ppwzxml) : -1;
#else
    (void)hgroup;
    (void)pwzpassword;
    (void)ppwzxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupExportDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzfilepath) : -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppeventdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupGetEventData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent, ppeventdata) : -1;
#else
    (void)hpeerevent;
    (void)ppeventdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupGetProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, ppproperties) : -1;
#else
    (void)hgroup;
    (void)ppproperties;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precordid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupGetRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, precordid, pprecord) : -1;
#else
    (void)hgroup;
    (void)precordid;
    (void)pprecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupGetStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pdwstatus) : -1;
#else
    (void)hgroup;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t foverwrite = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppwzgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupImportConfig")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzxml, pwzpassword, foverwrite, ppwzidentity, ppwzgroup) : -1;
#else
    (void)pwzxml;
    (void)pwzpassword;
    (void)foverwrite;
    (void)ppwzidentity;
    (void)ppwzgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupImportDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzfilepath) : -1;
#else
    (void)hgroup;
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzsubjectidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcredentialinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupIssueCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzsubjectidentity, pcredentialinfo, dwflags, ppwzinvitation) : -1;
#else
    (void)hgroup;
    (void)pwzsubjectidentity;
    (void)pcredentialinfo;
    (void)dwflags;
    (void)ppwzinvitation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzcloud = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzinvitation, pwzcloud, phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzgrouppeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzcloud = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupOpen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzgrouppeername, pwzcloud, phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzgrouppeername;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pullconnectionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupOpenDirectConnection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzidentity, paddress, pullconnectionid) : -1;
#else
    (void)hgroup;
    (void)pwzidentity;
    (void)paddress;
    (void)pullconnectionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppinvitationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupParseInvitation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzinvitation, ppinvitationinfo) : -1;
#else
    (void)pwzinvitation;
    (void)ppinvitationinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzinvitation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwzpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwzcloud = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupPasswordJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzinvitation, pwzpassword, pwzcloud, phgroup) : -1;
#else
    (void)pwzidentity;
    (void)pwzinvitation;
    (void)pwzpassword;
    (void)pwzcloud;
    (void)phgroup;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pftpeertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pftuniversaltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupPeerTimeToUniversalTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pftpeertime, pftuniversaltime) : -1;
#else
    (void)hgroup;
    (void)pftpeertime;
    (void)pftuniversaltime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ceventregistration = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* peventregistrations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupRegisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hevent, ceventregistration, peventregistrations, phpeerevent) : -1;
#else
    (void)hgroup;
    (void)hevent;
    (void)ceventregistration;
    (void)peventregistrations;
    (void)phpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hpeereventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupResumePasswordAuthentication")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, hpeereventhandle) : -1;
#else
    (void)hgroup;
    (void)hpeereventhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phpeerenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupSearchRecords")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pwzcriteria, phpeerenum) : -1;
#else
    (void)hgroup;
    (void)pwzcriteria;
    (void)phpeerenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ullconnectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupSendData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, ullconnectionid, ptype, cbdata, pvdata) : -1;
#else
    (void)hgroup;
    (void)ullconnectionid;
    (void)ptype;
    (void)cbdata;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupSetProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pproperties) : -1;
#else
    (void)hgroup;
    (void)pproperties;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupShutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversionrequested = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pversiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversionrequested, pversiondata) : -1;
#else
    (void)wversionrequested;
    (void)pversiondata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pftuniversaltime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pftpeertime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupUniversalTimeToPeerTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, pftuniversaltime, pftpeertime) : -1;
#else
    (void)hgroup;
    (void)pftuniversaltime;
    (void)pftpeertime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hpeerevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupUnregisterEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hpeerevent) : -1;
#else
    (void)hpeerevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* precord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerGroupUpdateRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hgroup, precord) : -1;
#else
    (void)hgroup;
    (void)precord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzhostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerHostNameToPeerName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzhostname, ppwzpeername) : -1;
#else
    (void)pwzhostname;
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzclassifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfriendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t hcryptprov = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* ppwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityCreate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzclassifier, pwzfriendlyname, hcryptprov, ppwzidentity) : -1;
#else
    (void)pwzclassifier;
    (void)pwzfriendlyname;
    (void)hcryptprov;
    (void)ppwzidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityDelete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity) : -1;
#else
    (void)pwzidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwzexportxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityExport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzpassword, ppwzexportxml) : -1;
#else
    (void)pwzidentity;
    (void)pwzpassword;
    (void)ppwzexportxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcryptprov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityGetCryptKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, phcryptprov) : -1;
#else
    (void)pwzidentity;
    (void)phcryptprov;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityGetDefault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppwzpeername) : -1;
#else
    (void)ppwzpeername;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzfriendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityGetFriendlyName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, ppwzfriendlyname) : -1;
#else
    (void)pwzidentity;
    (void)ppwzfriendlyname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzidentityxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityGetXML")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, ppwzidentityxml) : -1;
#else
    (void)pwzidentity;
    (void)ppwzidentityxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzimportxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentityImport")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzimportxml, pwzpassword, ppwzidentity) : -1;
#else
    (void)pwzimportxml;
    (void)pwzpassword;
    (void)ppwzidentity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwzfriendlyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerIdentitySetFriendlyName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzidentity, pwzfriendlyname) : -1;
#else
    (void)pwzidentity;
    (void)pwzfriendlyname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwzhostname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerNameToPeerHostName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwzpeername, ppwzhostname) : -1;
#else
    (void)pwzpeername;
    (void)ppwzhostname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolve = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpEndResolve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolve) : -1;
#else
    (void)hresolve;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcnumclouds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppcloudinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpGetCloudInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcnumclouds, ppcloudinfo) : -1;
#else
    (void)pcnumclouds;
    (void)ppcloudinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hresolve = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppendpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpGetEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hresolve, ppendpoint) : -1;
#else
    (void)hresolve;
    (void)ppendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pregistrationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpRegister")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcwzpeername, pregistrationinfo, phregistration) : -1;
#else
    (void)pcwzpeername;
    (void)pregistrationinfo;
    (void)phregistration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcwzcloudname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcendpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppendpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpResolve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcwzpeername, pcwzcloudname, pcendpoints, ppendpoints) : -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)pcendpoints;
    (void)ppendpoints;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpShutdown")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcwzpeername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcwzcloudname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cmaxendpoints = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phresolve = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpStartResolve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcwzpeername, pcwzcloudname, cmaxendpoints, hevent, phresolve) : -1;
#else
    (void)pcwzpeername;
    (void)pcwzcloudname;
    (void)cmaxendpoints;
    (void)hevent;
    (void)phresolve;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t wversionrequested = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wversionrequested) : -1;
#else
    (void)wversionrequested;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpUnregister")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregistration) : -1;
#else
    (void)hregistration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hregistration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pregistrationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("p2p.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PeerPnrpUpdateRegistration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hregistration, pregistrationinfo) : -1;
#else
    (void)hregistration;
    (void)pregistrationinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_p2p_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtClose", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtClose_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtOpen", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtOpen_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerFreeData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerFreeData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_p2p_napi, nullptr };
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
