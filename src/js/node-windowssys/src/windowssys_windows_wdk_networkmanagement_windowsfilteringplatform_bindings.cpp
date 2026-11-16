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

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmBfeStateGet0")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(deviceobject, callback, context, changehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)callback;
    (void)context;
    (void)changehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* changehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpkclnt.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmBfeStateUnsubscribeChanges0")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(changehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)changehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, callout, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)callout;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, callout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)callout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, callout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)callout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, connection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)connection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmEngineClose0")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, option, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(servername, authnservice, authidentity, session, enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servername;
    (void)authnservice;
    (void)authidentity;
    (void)session;
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, option, newvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)option;
    (void)newvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, filter, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)filter;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, filter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)filter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmFreeMemory0")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(p);
    } else {
        errno = ENOSYS;
    }
#else
    (void)p;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags, mainmodepolicy, tunnelpolicy, numfilterconditions, filterconditions, keymodkey, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)mainmodepolicy;
    (void)tunnelpolicy;
    (void)numfilterconditions;
    (void)filterconditions;
    (void)keymodkey;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, layer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)layer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, layer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)layer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, provider, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)provider;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, providercontext, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, providercontext, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, providercontext, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, providercontext, sd, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)providercontext;
    (void)sd;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, providercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)providercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, provider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)provider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, sublayer, sd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)sublayer;
    (void)sd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, sublayer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)sublayer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, key, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)key;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionAbort0")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enginehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("fwpuclnt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FwpmTransactionCommit0")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, idpstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)idpstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, ipsecstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ipsecstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, inboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)inboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, outboundbundle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)outboundbundle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, outboundtraffic, inboundfilterid, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)outboundtraffic;
    (void)virtualiftunnelinfo;
    (void)inboundfilterid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, sacontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, sacontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sacontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, getspi, inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, getspi, inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, getspi, inboundspi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)getspi;
    (void)inboundspi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, flags, newvalues);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)flags;
    (void)newvalues;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, ikeextstatistics);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)ikeextstatistics;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumtemplate, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumtemplate;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, securityinfo, sidowner, sidgroup, dacl, sacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)securityinfo;
    (void)sidowner;
    (void)sidgroup;
    (void)dacl;
    (void)sacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, enumhandle, numentriesrequested, entries, numentriesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)enumhandle;
    (void)numentriesrequested;
    (void)entries;
    (void)numentriesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, salookupcontext, sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(enginehandle, id, salookupcontext, sa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)enginehandle;
    (void)id;
    (void)salookupcontext;
    (void)sa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_networkmanagement_windowsfilteringplatform_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1_napi));
    exports.Set("windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2", Napi::Function::New(env, windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2_napi));
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
