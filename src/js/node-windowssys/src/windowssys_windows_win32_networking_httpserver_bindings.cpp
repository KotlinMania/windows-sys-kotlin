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

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* urlprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* datachunk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cachepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpAddFragmentToCache")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, urlprefix, datachunk, cachepolicy, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)datachunk;
    (void)cachepolicy;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpAddUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fullyqualifiedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpAddUrl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, fullyqualifiedurl, reserved) : 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t urlgroupid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pfullyqualifiedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t urlcontext = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpAddUrlToUrlGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(urlgroupid, pfullyqualifiedurl, urlcontext, reserved) : 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)urlcontext;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCancelHttpRequest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCloseRequestQueue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle) : 0;
#else
    (void)requestqueuehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCloseServerSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t serversessionid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCloseServerSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serversessionid) : 0;
#else
    (void)serversessionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t urlgroupid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCloseUrlGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(urlgroupid) : 0;
#else
    (void)urlgroupid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCreateHttpHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, reserved) : 0;
#else
    (void)requestqueuehandle;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t serversessionid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* purlgroupid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpCreateUrlGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serversessionid, purlgroupid, reserved) : 0;
#else
    (void)serversessionid;
    (void)purlgroupid;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpDeclarePush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t verb = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* query = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* headers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpDeclarePush")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, verb, path, query, headers) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)verb;
    (void)path;
    (void)query;
    (void)headers;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* delegatequeuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t requestid = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t delegateurlgroupid = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t propertyinfosetsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* propertyinfoset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpDelegateRequestEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, delegatequeuehandle, requestid, delegateurlgroupid, propertyinfosetsize, propertyinfoset) : 0;
#else
    (void)requestqueuehandle;
    (void)delegatequeuehandle;
    (void)requestid;
    (void)delegateurlgroupid;
    (void)propertyinfosetsize;
    (void)propertyinfoset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t configid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pconfiginformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t configinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpDeleteServiceConfiguration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servicehandle, configid, pconfiginformation, configinformationlength, poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fullyqualifiedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* urlgroupid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpFindUrlGroupId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fullyqualifiedurl, requestqueuehandle, urlgroupid) : 0;
#else
    (void)fullyqualifiedurl;
    (void)requestqueuehandle;
    (void)urlgroupid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* urlprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpFlushResponseCache")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, urlprefix, flags, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)flags;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t featureid = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpIsFeatureSupported")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(featureid) : -1;
#else
    (void)featureid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpPrepareUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* url = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* preparedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpPrepareUrl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved, flags, url, preparedurl) : 0;
#else
    (void)reserved;
    (void)flags;
    (void)url;
    (void)preparedurl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpQueryRequestQueueProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, property, propertyinformation, propertyinformationlength, reserved1, returnlength, reserved2) : 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)returnlength;
    (void)reserved2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t serversessionid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpQueryServerSessionProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serversessionid, property, propertyinformation, propertyinformationlength, returnlength) : 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t configid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t inputlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t outputlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* preturnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpQueryServiceConfiguration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servicehandle, configid, pinput, inputlength, poutput, outputlength, preturnlength, poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pinput;
    (void)inputlength;
    (void)poutput;
    (void)outputlength;
    (void)preturnlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t urlgroupid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpQueryUrlGroupProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(urlgroupid, property, propertyinformation, propertyinformationlength, returnlength) : 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* urlprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byterange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpReadFragmentFromCache")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, urlprefix, byterange, buffer, bufferlength, bytesread, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)byterange;
    (void)buffer;
    (void)bufferlength;
    (void)bytesread;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t connectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sslclientcertinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t sslclientcertinfosize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreceived = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpReceiveClientCertificate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, connectionid, flags, sslclientcertinfo, sslclientcertinfosize, bytesreceived, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)flags;
    (void)sslclientcertinfo;
    (void)sslclientcertinfosize;
    (void)bytesreceived;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requestbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t requestbufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpReceiveHttpRequest")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, flags, requestbuffer, requestbufferlength, bytesreturned, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)requestbuffer;
    (void)requestbufferlength;
    (void)bytesreturned;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* entitybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t entitybufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bytesreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpReceiveRequestEntityBody")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, flags, entitybuffer, entitybufferlength, bytesreturned, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)entitybuffer;
    (void)entitybufferlength;
    (void)bytesreturned;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpRemoveUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fullyqualifiedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpRemoveUrl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, fullyqualifiedurl) : 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t urlgroupid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pfullyqualifiedurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpRemoveUrlFromUrlGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(urlgroupid, pfullyqualifiedurl, flags) : 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* httpresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* cachepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* bytessent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* logdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSendHttpResponse")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, flags, httpresponse, cachepolicy, bytessent, reserved1, reserved2, overlapped, logdata) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)httpresponse;
    (void)cachepolicy;
    (void)bytessent;
    (void)reserved1;
    (void)reserved2;
    (void)overlapped;
    (void)logdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t requestid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t entitychunkcount = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* entitychunks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* bytessent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* reserved1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* logdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint16_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSendResponseEntityBody")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, requestid, flags, entitychunkcount, entitychunks, bytessent, reserved1, reserved2, overlapped, logdata) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)entitychunkcount;
    (void)entitychunks;
    (void)bytessent;
    (void)reserved1;
    (void)reserved2;
    (void)overlapped;
    (void)logdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t id = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* input = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t inputpropertysize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSetRequestProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, id, propertyid, input, inputpropertysize, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)id;
    (void)propertyid;
    (void)input;
    (void)inputpropertysize;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* reserved2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSetRequestQueueProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, property, propertyinformation, propertyinformationlength, reserved1, reserved2) : 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)reserved2;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t serversessionid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSetServerSessionProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serversessionid, property, propertyinformation, propertyinformationlength) : 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t configid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pconfiginformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t configinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* poverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSetServiceConfiguration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servicehandle, configid, pconfiginformation, configinformationlength, poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t urlgroupid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int32_t property = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* propertyinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t propertyinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpSetUrlGroupProperty")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(urlgroupid, property, propertyinformation, propertyinformationlength) : 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpShutdownRequestQueue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle) : 0;
#else
    (void)requestqueuehandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpTerminate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* preserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpTerminate")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, preserved) : 0;
#else
    (void)flags;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t configid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t configinfolength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpUpdateServiceConfiguration")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, configid, configinfo, configinfolength, overlapped) : 0;
#else
    (void)handle;
    (void)configid;
    (void)configinfo;
    (void)configinfolength;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpWaitForDemandStart")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t connectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpWaitForDisconnect")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, connectionid, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requestqueuehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t connectionid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HttpWaitForDisconnectEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requestqueuehandle, connectionid, reserved, overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)reserved;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networking_httpserver_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpAddUrl", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpAddUrl_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCloseServerSession", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCloseServerSession_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpDeclarePush", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpDeclarePush_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpPrepareUrl", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpPrepareUrl_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpRemoveUrl", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpRemoveUrl_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpTerminate", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpTerminate_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect_napi));
    exports.Set("windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx", Napi::Function::New(env, windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networking_httpserver_napi, nullptr };
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
