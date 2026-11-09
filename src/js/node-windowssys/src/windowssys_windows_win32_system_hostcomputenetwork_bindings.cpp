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

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCloseEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(endpoint) : -1;
#else
    (void)endpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCloseGuestNetworkService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guestnetworkservice) : -1;
#else
    (void)guestnetworkservice;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCloseLoadBalancer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadbalancer) : -1;
#else
    (void)loadbalancer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_namespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCloseNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_namespace) : -1;
#else
    (void)arg_0_namespace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCloseNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(network) : -1;
#else
    (void)network;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCreateEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(network, id, settings, endpoint, errorrecord) : -1;
#else
    (void)network;
    (void)id;
    (void)settings;
    (void)endpoint;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCreateGuestNetworkService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, settings, guestnetworkservice, errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)guestnetworkservice;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCreateLoadBalancer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, settings, loadbalancer, errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* arg_2_namespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCreateNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, settings, arg_2_namespace, errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)arg_2_namespace;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnCreateNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, settings, network, errorrecord) : -1;
#else
    (void)id;
    (void)settings;
    (void)network;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnDeleteEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnDeleteGuestNetworkService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnDeleteLoadBalancer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnDeleteNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnDeleteNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, errorrecord) : -1;
#else
    (void)id;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* endpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnEnumerateEndpoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(query, endpoints, errorrecord) : -1;
#else
    (void)query;
    (void)endpoints;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* returncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* portentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnEnumerateGuestNetworkPortReservations")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(returncount, portentries) : -1;
#else
    (void)returncount;
    (void)portentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnEnumerateLoadBalancers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(query, loadbalancer, errorrecord) : -1;
#else
    (void)query;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* namespaces = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnEnumerateNamespaces")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(query, namespaces, errorrecord) : -1;
#else
    (void)query;
    (void)namespaces;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* networks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnEnumerateNetworks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(query, networks, errorrecord) : -1;
#else
    (void)query;
    (void)networks;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnFreeGuestNetworkPortReservations")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(portentries);
#else
    (void)portentries;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnModifyEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(endpoint, settings, errorrecord) : -1;
#else
    (void)endpoint;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnModifyGuestNetworkService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guestnetworkservice, settings, errorrecord) : -1;
#else
    (void)guestnetworkservice;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnModifyLoadBalancer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadbalancer, settings, errorrecord) : -1;
#else
    (void)loadbalancer;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_namespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnModifyNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_namespace, settings, errorrecord) : -1;
#else
    (void)arg_0_namespace;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnModifyNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(network, settings, errorrecord) : -1;
#else
    (void)network;
    (void)settings;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnOpenEndpoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, endpoint, errorrecord) : -1;
#else
    (void)id;
    (void)endpoint;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnOpenLoadBalancer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, loadbalancer, errorrecord) : -1;
#else
    (void)id;
    (void)loadbalancer;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* arg_1_namespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnOpenNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, arg_1_namespace, errorrecord) : -1;
#else
    (void)id;
    (void)arg_1_namespace;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnOpenNetwork")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(id, network, errorrecord) : -1;
#else
    (void)id;
    (void)network;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* addresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryEndpointAddresses")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(endpoint, query, addresses, errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)addresses;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryEndpointProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(endpoint, query, properties, errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* endpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryEndpointStats")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(endpoint, query, stats, errorrecord) : -1;
#else
    (void)endpoint;
    (void)query;
    (void)stats;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loadbalancer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryLoadBalancerProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loadbalancer, query, properties, errorrecord) : -1;
#else
    (void)loadbalancer;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_namespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryNamespaceProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_namespace, query, properties, errorrecord) : -1;
#else
    (void)arg_0_namespace;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* network = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* properties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* errorrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnQueryNetworkProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(network, query, properties, errorrecord) : -1;
#else
    (void)network;
    (void)query;
    (void)properties;
    (void)errorrecord;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnRegisterGuestNetworkServiceCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guestnetworkservice, callback, context, callbackhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)callback;
    (void)context;
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnRegisterServiceCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callback, context, callbackhandle) : -1;
#else
    (void)callback;
    (void)context;
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* portreservationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnReleaseGuestNetworkServicePortReservationHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(portreservationhandle) : -1;
#else
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t protocol = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t access = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t port = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* portreservationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guestnetworkservice, protocol, access, port, portreservationhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)protocol;
    (void)access;
    (void)port;
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guestnetworkservice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t portcount = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* portrangereservation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* portreservationhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePortRange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guestnetworkservice, portcount, portrangereservation, portreservationhandle) : -1;
#else
    (void)guestnetworkservice;
    (void)portcount;
    (void)portrangereservation;
    (void)portreservationhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnUnregisterGuestNetworkServiceCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackhandle) : -1;
#else
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HcnUnregisterServiceCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackhandle) : -1;
#else
    (void)callbackhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_hostcomputenetwork_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback_napi));
    exports.Set("windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback", Napi::Function::New(env, windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_hostcomputenetwork_napi, nullptr };
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
