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

static Napi::Value windowssys_windows_win32_system_eventcollector_EcClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t object = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcDeleteSubscription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subscriptionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcDeleteSubscription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionname, flags) : -1;
#else
    (void)subscriptionname;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t subscriptionenum = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t subscriptionnamebuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subscriptionnamebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subscriptionnamebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcEnumNextSubscription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionenum, subscriptionnamebuffersize, subscriptionnamebuffer, subscriptionnamebufferused) : -1;
#else
    (void)subscriptionenum;
    (void)subscriptionnamebuffersize;
    (void)subscriptionnamebuffer;
    (void)subscriptionnamebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t arrayindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcGetObjectArrayProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* objectarraysize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcGetObjectArraySize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, objectarraysize) : -1;
#else
    (void)objectarray;
    (void)objectarraysize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t subscription = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t propertyvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertyvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* propertyvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcGetSubscriptionProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscription, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer, propertyvaluebufferused) : -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subscriptionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t statusinfoid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* eventsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t statusvaluebuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* statusvaluebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* statusvaluebufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcGetSubscriptionRunTimeStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionname, statusinfoid, eventsourcename, flags, statusvaluebuffersize, statusvaluebuffer, statusvaluebufferused) : -1;
#else
    (void)subscriptionname;
    (void)statusinfoid;
    (void)eventsourcename;
    (void)flags;
    (void)statusvaluebuffersize;
    (void)statusvaluebuffer;
    (void)statusvaluebufferused;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arrayindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcInsertObjectArrayElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, arrayindex) : -1;
#else
    (void)objectarray;
    (void)arrayindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcOpenSubscription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subscriptionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcOpenSubscription")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionname, accessmask, flags) : -1;
#else
    (void)subscriptionname;
    (void)accessmask;
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcOpenSubscriptionEnum")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags) : -1;
#else
    (void)flags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t arrayindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcRemoveObjectArrayElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, arrayindex) : -1;
#else
    (void)objectarray;
    (void)arrayindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcRetrySubscription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subscriptionname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eventsourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcRetrySubscription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscriptionname, eventsourcename, flags) : -1;
#else
    (void)subscriptionname;
    (void)eventsourcename;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcSaveSubscription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t subscription = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcSaveSubscription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscription, flags) : -1;
#else
    (void)subscription;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t objectarray = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t arrayindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* propertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcSetObjectArrayProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectarray, propertyid, arrayindex, flags, propertyvalue) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t subscription = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* propertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wecapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EcSetSubscriptionProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subscription, propertyid, flags, propertyvalue) : -1;
#else
    (void)subscription;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_eventcollector_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_eventcollector_EcClose", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcClose_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcDeleteSubscription", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcDeleteSubscription_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcOpenSubscription", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcOpenSubscription_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcRetrySubscription", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcRetrySubscription_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcSaveSubscription", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcSaveSubscription_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty_napi));
    exports.Set("windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty", Napi::Function::New(env, windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_eventcollector_napi, nullptr };
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
