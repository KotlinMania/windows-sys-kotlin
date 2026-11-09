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

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t cbsize = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDAllocateLinkedMemory")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pparent, cbsize) : NULL;
#else
    (void)pparent;
    (void)cbsize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDAttachLinkedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pparent, pchild);
#else
    (void)pparent;
    (void)pchild;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppdevicehost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceHost")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszlocalid, pcontext, ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pconfigparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwconfigparamcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppdevicehost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceHost2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszlocalid, pcontext, pconfigparams, dwconfigparamcount, ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pphostaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwhostaddresscount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppdevicehost = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceHostAdvanced")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszlocalid, pcontext, pphostaddresses, dwhostaddresscount, ppdevicehost) : -1;
#else
    (void)pszlocalid;
    (void)pcontext;
    (void)pphostaddresses;
    (void)dwhostaddresscount;
    (void)ppdevicehost;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppdeviceproxy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceProxy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceid, pszlocalid, pcontext, ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pconfigparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwconfigparamcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppdeviceproxy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceProxy2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceid, pszlocalid, pcontext, pconfigparams, dwconfigparamcount, ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pszlocalid;
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszdeviceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdeviceaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszlocalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppdeviceproxy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDeviceProxyAdvanced")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszdeviceid, pdeviceaddress, pszlocalid, pcontext, ppdeviceproxy) : -1;
#else
    (void)pszdeviceid;
    (void)pdeviceaddress;
    (void)pszlocalid;
    (void)pcontext;
    (void)ppdeviceproxy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontext, ppprovider) : -1;
#else
    (void)pcontext;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pconfigparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwconfigparamcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDiscoveryProvider2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontext, pconfigparams, dwconfigparamcount, ppprovider) : -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppublisher = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontext, pppublisher) : -1;
#else
    (void)pcontext;
    (void)pppublisher;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pconfigparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwconfigparamcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pppublisher = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateDiscoveryPublisher2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcontext, pconfigparams, dwconfigparamcount, pppublisher) : -1;
#else
    (void)pcontext;
    (void)pconfigparams;
    (void)dwconfigparamcount;
    (void)pppublisher;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateHttpAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppaddress) : -1;
#else
    (void)ppaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pptxparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateHttpMessageParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pptxparams) : -1;
#else
    (void)pptxparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppattachment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateOutboundAttachment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppattachment) : -1;
#else
    (void)ppattachment;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateUdpAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppaddress) : -1;
#else
    (void)ppaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pptxparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDCreateUdpMessageParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pptxparams) : -1;
#else
    (void)pptxparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDDetachLinkedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvoid);
#else
    (void)pvoid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDFreeLinkedMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvoid);
#else
    (void)pvoid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszsubcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszreason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDGenerateFault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszcode, pszsubcode, pszreason, pszdetail, pcontext, ppfault) : -1;
#else
    (void)pszcode;
    (void)pszsubcode;
    (void)pszreason;
    (void)pszdetail;
    (void)pcontext;
    (void)ppfault;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psubcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* preasons = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszdetail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppfault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDGenerateFaultEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcode, psubcode, preasons, pszdetail, ppfault) : -1;
#else
    (void)pcode;
    (void)psubcode;
    (void)preasons;
    (void)pszdetail;
    (void)ppfault;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwoption = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cboutbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDGetConfigurationOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwoption, pvoid, cboutbuffer) : -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cboutbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwoption = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDSetConfigurationOption")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwoption, pvoid, cbinbuffer) : -1;
#else
    (void)dwoption;
    (void)pvoid;
    (void)cbinbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cchsource = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchdestout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDUriDecode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(source, cchsource, destout, cchdestout) : -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cchsource = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* destout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchdestout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDUriEncode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(source, cchsource, destout, cchdestout) : -1;
#else
    (void)source;
    (void)cchsource;
    (void)destout;
    (void)cchdestout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLAddChild")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pparent, pchild) : -1;
#else
    (void)pparent;
    (void)pchild;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfirst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psecond = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLAddSibling")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfirst, psecond) : -1;
#else
    (void)pfirst;
    (void)psecond;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pelementname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppany = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLBuildAnyForSingleElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pelementname, psztext, ppany) : -1;
#else
    (void)pelementname;
    (void)psztext;
    (void)ppany;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pany = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLCleanupElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pany) : -1;
#else
    (void)pany;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLCreateContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppcontext) : -1;
#else
    (void)ppcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psznamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLGetNameFromBuiltinNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psznamespace, pszname, ppname) : -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)ppname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psznamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pany = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wsdapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WSDXMLGetValueFromAny")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psznamespace, pszname, pany, ppszvalue) : -1;
#else
    (void)psznamespace;
    (void)pszname;
    (void)pany;
    (void)ppszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_webservicesondevices_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDAllocateLinkedMemory_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDAttachLinkedMemory_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHost2_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceHostAdvanced_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxy2_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDeviceProxyAdvanced_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryProvider2_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateDiscoveryPublisher2_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpAddress_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateHttpMessageParameters_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateOutboundAttachment_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpAddress_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDCreateUdpMessageParameters_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDDetachLinkedMemory_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDFreeLinkedMemory_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFault_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDGenerateFaultEx_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDGetConfigurationOption_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDSetConfigurationOption_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDUriDecode_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDUriEncode_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddChild_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLAddSibling_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLBuildAnyForSingleElement_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLCleanupElement_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLCreateContext_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetNameFromBuiltinNamespace_napi));
    exports.Set("windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny", Napi::Function::New(env, windowssys_windows_win32_devices_webservicesondevices_WSDXMLGetValueFromAny_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_webservicesondevices_napi, nullptr };
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
