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

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, callout, sd, id) : 0;
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDeleteById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, callout) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, callout) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutSubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmCalloutUnsubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* connection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, connection) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmConnectionUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subscriptionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmDynamicKeywordSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, callback, context, subscriptionhandle) : 0;
#else
    (void)flags;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subscriptionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmDynamicKeywordUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionhandle) : 0;
#else
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineClose0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineGetOption0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, option, value) : 0;
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t authnservice = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* authidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* session = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineOpen0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servername, authnservice, authidentity, session, enginehandle) : 0;
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t option = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineSetOption0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, option, newvalue) : 0;
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, filter, sd, id) : 0;
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDeleteById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, filter) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, filter) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterSubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFilterUnsubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmGetAppIdFromFileName0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, appid) : 0;
#else
    (void)filename;
    (void)appid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* mainmodepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tunnelpolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numfilterconditions = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* filterconditions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelAdd3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmIPsecTunnelDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t id = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* layer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, layer) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* layer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, layer) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmLayerSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventEnum5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscribe1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscribe2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscribe3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscribe4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventsGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmNetEventsSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, provider, sd) : 0;
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextAdd3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, providercontext, sd, id) : 0;
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDeleteById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextEnum3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetById3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, providercontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetByKey3")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, providercontext) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextSubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderContextUnsubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, provider) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderSubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmProviderUnsubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSessionEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sublayer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerAdd0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, sublayer, sd) : 0;
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerDeleteByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key) : 0;
#else
    (void)enginehandle;
    (void)key;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sublayer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerGetByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, sublayer) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* key = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerSubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, changehandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSubLayerUnsubscribeChanges0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, changehandle) : 0;
#else
    (void)enginehandle;
    (void)changehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sysports = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSystemPortsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, sysports) : 0;
#else
    (void)enginehandle;
    (void)sysports;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sysportshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSystemPortsSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, reserved, callback, context, sysportshandle) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)callback;
    (void)context;
    (void)sysportshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sysportshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmSystemPortsUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, sysportshandle) : 0;
#else
    (void)enginehandle;
    (void)sysportshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionAbort0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionBegin0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags) : 0;
#else
    (void)enginehandle;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionCommit0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle) : 0;
#else
    (void)enginehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* subscriptionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, subscriptionhandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscriptionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscriptionhandle) : 0;
#else
    (void)enginehandle;
    (void)subscriptionhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventsGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmvSwitchEventsSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* idpstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospGetStatistics0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, idpstatistics) : 0;
#else
    (void)enginehandle;
    (void)idpstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecDospStateEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ipsecstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecGetStatistics0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ipsecstatistics) : 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ipsecstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecGetStatistics1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ipsecstatistics) : 0;
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* keymanager = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* keymanagercallbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* keymgmthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecKeyManagerAddAndRegister0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, keymanager, keymanagercallbacks, keymgmthandle) : 0;
#else
    (void)enginehandle;
    (void)keymanager;
    (void)keymanagercallbacks;
    (void)keymgmthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecKeyManagerGetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, reserved, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecKeyManagerSetSecurityInfoByKey0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, reserved, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)reserved;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* keymgmthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecKeyManagerUnregisterAndDelete0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, keymgmthandle) : 0;
#else
    (void)enginehandle;
    (void)keymgmthandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecKeyManagersGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* inboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddInbound0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, inboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* inboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddInbound1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, inboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* outboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, outboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* outboundbundle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextAddOutbound1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, outboundbundle) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outboundtraffic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* inboundfilterid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreate0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, outboundtraffic, inboundfilterid, id) : 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outboundtraffic = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* virtualiftunnelinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundfilterid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* id = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreate1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id) : 0;
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextDeleteById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextEnum1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextExpire0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sacontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sacontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sacontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetById1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sacontext) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetSpi0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* inboundspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextGetSpi1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* getspi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t inboundspi = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextSetSpi0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, getspi, inboundspi) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subscription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextSubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, subscription, callback, context, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)subscription;
    (void)callback;
    (void)context;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextSubscriptionsGet0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, entries, numentries) : 0;
#else
    (void)enginehandle;
    (void)entries;
    (void)numentries;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextUnsubscribe0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, eventshandle) : 0;
#else
    (void)enginehandle;
    (void)eventshandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t flags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* newvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaContextUpdate0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, flags, newvalues) : 0;
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDbGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDbSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IPsecSaEnum1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ikeextstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextGetStatistics0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ikeextstatistics) : 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ikeextstatistics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextGetStatistics1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, ikeextstatistics) : 0;
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumtemplate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaCreateEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumtemplate, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDbGetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDbSetSecurityInfo0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl) : 0;
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDeleteById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id) : 0;
#else
    (void)enginehandle;
    (void)id;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaDestroyEnumHandle0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* enumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t numentriesrequested = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* numentriesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaEnum2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned) : 0;
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById0")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* salookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById1")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, salookupcontext, sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* salookupcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IkeextSaGetById2")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enginehandle, id, salookupcontext, sa) : 0;
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_windowsfilteringplatform_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_windowsfilteringplatform_napi, nullptr };
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
