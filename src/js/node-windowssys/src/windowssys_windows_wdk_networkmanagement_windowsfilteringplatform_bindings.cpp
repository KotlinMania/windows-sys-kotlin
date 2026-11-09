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

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmBfeStateGet0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmBfeStateSubscribeChanges0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, callback, context, changehandle) : -1;
#else
    (void)deviceobject;
    (void)callback;
    (void)context;
    (void)changehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmBfeStateUnsubscribeChanges0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(changehandle) : -1;
#else
    (void)changehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, callout, sd, id) : -1;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, callout) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, callout) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* connection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, connection) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineClose0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineGetOption0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, option, value) : -1;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnservice = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* session = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineOpen0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servername, authnservice, authidentity, session, enginehandle) : -1;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineSetOption0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, option, newvalue) : -1;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, filter, sd, id) : -1;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDeleteById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, filter) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, filter) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFreeMemory0")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(p);
#else
    (void)p;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* mainmodepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tunnelpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numfilterconditions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* filterconditions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* mainmodepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tunnelpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numfilterconditions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* filterconditions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* keymodkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* mainmodepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tunnelpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numfilterconditions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* filterconditions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* keymodkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* mainmodepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tunnelpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numfilterconditions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* filterconditions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* keymodkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t id = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* layer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, layer) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, layer) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum4")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum5")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, provider, sd) : -1;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : -1;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, provider) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sublayer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerAdd0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, sublayer, sd) : -1;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : -1;
#else
    (void)enginehandle;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sublayer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, sublayer) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionAbort0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionBegin0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags) : -1;
#else
    (void)enginehandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionCommit0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : -1;
#else
    (void)enginehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* idpstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospGetStatistics0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, idpstatistics) : -1;
#else
    (void)enginehandle;
    (void)idpstatistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentries) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ipsecstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecGetStatistics0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ipsecstatistics) : -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ipsecstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecGetStatistics1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ipsecstatistics) : -1;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* inboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, inboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* inboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, inboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* outboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, outboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* outboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, outboundbundle) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outboundtraffic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inboundfilterid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreate0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, outboundtraffic, inboundfilterid, id) : -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outboundtraffic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* virtualiftunnelinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundfilterid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreate1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id) : -1;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextEnum1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextExpire0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sacontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sacontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sacontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetById1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sacontext) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t inboundspi = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t flags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* newvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextUpdate0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, newvalues) : -1;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaEnum1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ikeextstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextGetStatistics0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ikeextstatistics) : -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ikeextstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextGetStatistics1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ikeextstatistics) : -1;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : -1;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDeleteById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : -1;
#else
    (void)enginehandle;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : -1;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* salookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, salookupcontext, sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* salookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, salookupcontext, sa) : -1;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_networkmanagement_windowsfilteringplatform_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1_napi));
    exports.Set("windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2", Napi::Function::New(env, windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_wdk_networkmanagement_windowsfilteringplatform_napi, nullptr };
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
