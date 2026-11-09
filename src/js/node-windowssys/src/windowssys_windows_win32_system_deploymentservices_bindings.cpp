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

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hclientrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t action = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeAsyncRecvDone")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclientrequest, action) : 0;
#else
    (void)hclientrequest;
    (void)action;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preplypacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t umaxreplypacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pureplypacketlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint8_t boption = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint8_t boptionlen = static_cast<uint8_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpAppendOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preplypacket, umaxreplypacketlen, pureplypacketlen, boption, boptionlen, pvalue) : 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)boption;
    (void)boptionlen;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preplypacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t umaxreplypacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pureplypacketlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t ubufferlen = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpAppendOptionRaw")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preplypacket, umaxreplypacketlen, pureplypacketlen, ubufferlen, pbuffer) : 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)ubufferlen;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uinstance = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t boption = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboptionlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppoptionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpGetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, uinstance, boption, pboptionlen, ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)boption;
    (void)pboptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t boption = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t uinstance = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboptionlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppoptionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpGetVendorOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, boption, uinstance, pboptionlen, ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)boption;
    (void)uinstance;
    (void)pboptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* precvpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t urecvpacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* preplypacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t umaxreplypacketlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pureplypacketlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(precvpacket, urecvpacketlen, preplypacket, umaxreplypacketlen, pureplypacketlen) : 0;
#else
    (void)precvpacket;
    (void)urecvpacketlen;
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t brequestpacket = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbpxeoptionpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpIsValid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, brequestpacket, pbpxeoptionpresent) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbreply = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbreplyused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t woptiontype = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint16_t cboption = static_cast<uint16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* poption = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6AppendOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preply, cbreply, pcbreplyused, woptiontype, cboption, poption) : 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)woptiontype;
    (void)cboption;
    (void)poption;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbreply = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbreplyused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t cbbuffer = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6AppendOptionRaw")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(preply, cbreply, pcbreplyused, cbbuffer, pbuffer) : 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)cbbuffer;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prelaymessages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nrelaymessages = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pinnerpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinnerpacket = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* preplybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbreplybuffer = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbreplybuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6CreateRelayRepl")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prelaymessages, nrelaymessages, pinnerpacket, cbinnerpacket, preplybuffer, cbreplybuffer, pcbreplybuffer) : 0;
#else
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pinnerpacket;
    (void)cbinnerpacket;
    (void)preplybuffer;
    (void)cbreplybuffer;
    (void)pcbreplybuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uinstance = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t woption = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pwoptionlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppoptionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6GetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, uinstance, woption, pwoptionlen, ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)woption;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwenterprisenumber = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t woption = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t uinstance = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pwoptionlen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppoptionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6GetVendorOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, dwenterprisenumber, woption, uinstance, pwoptionlen, ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)dwenterprisenumber;
    (void)woption;
    (void)uinstance;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbrequest = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* preply = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbreply = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbreplyused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6Initialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prequest, cbrequest, preply, cbreply, pcbreplyused) : 0;
#else
    (void)prequest;
    (void)cbrequest;
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t brequestpacket = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbpxeoptionpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6IsValid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, brequestpacket, pbpxeoptionpresent) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prelayforwpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t urelayforwpacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* prelaymessages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nrelaymessages = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pnrelaymessages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppinnerpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbinnerpacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeDhcpv6ParseRelayForw")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prelayforwpacket, urelayforwpacketlen, prelaymessages, nrelaymessages, pnrelaymessages, ppinnerpacket, pcbinnerpacket) : 0;
#else
    (void)prelayforwpacket;
    (void)urelayforwpacketlen;
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pnrelaymessages;
    (void)ppinnerpacket;
    (void)pcbinnerpacket;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uinfotype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ubufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeGetServerInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uinfotype, pbuffer, ubufferlen) : 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t uinfotype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ubufferlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pubufferused = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeGetServerInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uinfotype, pbuffer, ubufferlen, pubufferused) : 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    (void)pubufferused;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxePacketAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hclientrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t usize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxePacketAllocate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, hclientrequest, usize) : NULL;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)usize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxePacketFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hclientrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxePacketFree")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, hclientrequest, ppacket) : 0;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)ppacket;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderEnumClose")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderEnumFirst")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phenum) : 0;
#else
    (void)phenum;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderEnumNext")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henum, ppprovider) : 0;
#else
    (void)henum;
    (void)ppprovider;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderFreeInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider) : 0;
#else
    (void)pprovider;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderQueryIndex")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, puindex) : 0;
#else
    (void)pszprovidername;
    (void)puindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszmodulepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t arg_2_index = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t biscritical = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phproviderkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderRegister")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszmodulepath, arg_2_index, biscritical, phproviderkey) : 0;
#else
    (void)pszprovidername;
    (void)pszmodulepath;
    (void)arg_2_index;
    (void)biscritical;
    (void)phproviderkey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t attribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pparameterbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t uparamlen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderSetAttribute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, attribute, pparameterbuffer, uparamlen) : 0;
#else
    (void)hprovider;
    (void)attribute;
    (void)pparameterbuffer;
    (void)uparamlen;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeProviderUnRegister")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername) : 0;
#else
    (void)pszprovidername;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t callbacktype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcallbackfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeRegisterCallback")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, callbacktype, pcallbackfunction, pcontext) : 0;
#else
    (void)hprovider;
    (void)callbacktype;
    (void)pcallbackfunction;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeSendReply_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hclientrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* paddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeSendReply")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hclientrequest, ppacket, upacketlen, paddress) : 0;
#else
    (void)hclientrequest;
    (void)ppacket;
    (void)upacketlen;
    (void)paddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_PxeTraceV_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t severity = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PxeTraceV")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, severity, pszformat, params) : 0;
#else
    (void)hprovider;
    (void)severity;
    (void)pszformat;
    (void)params;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpAddOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uoption = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uvaluelen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpAddOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle, uoption, uvaluelen, pvalue) : 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpCloseHandle")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle) : 0;
#else
    (void)hhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ubufferlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pubytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpGetOptionBuffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle, ubufferlen, pbuffer, pubytes) : 0;
#else
    (void)hhandle;
    (void)ubufferlen;
    (void)pbuffer;
    (void)pubytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t bpackettype = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bpackettype, phhandle) : 0;
#else
    (void)bpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbpackettype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpParseInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, pbpackettype, phhandle) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppacket = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t upacketlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbpackettype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpParseInitializev6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppacket, upacketlen, pbpackettype, phhandle) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uoption = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t uvaluelen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pubytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsBpQueryOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhandle, uoption, uvaluelen, pvalue, pubytes) : 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    (void)pubytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliAuthorizeSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, pcred) : -1;
#else
    (void)hsession;
    (void)pcred;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliCancelTransfer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htransfer) : -1;
#else
    (void)htransfer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliCreateSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszserver, pcred, phsession) : -1;
#else
    (void)pwszserver;
    (void)pcred;
    (void)phsession;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phfindhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliFindFirstImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, phfindhandle) : -1;
#else
    (void)hsession;
    (void)phfindhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliFindNextImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppwszarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliFreeStringArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppwszarray, ulcount) : -1;
#else
    (void)ppwszarray;
    (void)ulcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszwindirpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszdriverquery = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetDriverQueryXml")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszwindirpath, ppwszdriverquery) : -1;
#else
    (void)pwszwindirpath;
    (void)ppwszdriverquery;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetEnumerationFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, pdwflags) : -1;
#else
    (void)handle;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageArchitecture")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pdwvalue) : -1;
#else
    (void)hifh;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageDescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppwszfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageFiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pppwszfiles, pdwcount) : -1;
#else
    (void)hifh;
    (void)pppwszfiles;
    (void)pdwcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageGroup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageHalName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* findhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phimagehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromFindHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(findhandle, phimagehandle) : -1;
#else
    (void)findhandle;
    (void)phimagehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phimagehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromTransferHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htransfer, phimagehandle) : -1;
#else
    (void)htransfer;
    (void)phimagehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdwvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pdwvalue) : -1;
#else
    (void)hifh;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageLanguage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pppszvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwnumvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageLanguages")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pppszvalues, pdwnumvalues) : -1;
#else
    (void)hifh;
    (void)pppszvalues;
    (void)pdwnumvalues;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppsystimevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageLastModifiedTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppsystimevalue) : -1;
#else
    (void)hifh;
    (void)ppsystimevalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageNamespace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t paramtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* presponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t uresponselen = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, paramtype, presponse, uresponselen) : -1;
#else
    (void)hifh;
    (void)paramtype;
    (void)presponse;
    (void)uresponselen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImagePath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pullvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pullvalue) : -1;
#else
    (void)hifh;
    (void)pullvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pimagetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pimagetype) : -1;
#else
    (void)hifh;
    (void)pimagetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetImageVersion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hifh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pullvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliGetTransferSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hifh, pullvalue) : -1;
#else
    (void)hifh;
    (void)pullvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulclientarchitecture = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszclientid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszclientaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliInitializeLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, ulclientarchitecture, pwszclientid, pwszclientaddress) : -1;
#else
    (void)hsession;
    (void)ulclientarchitecture;
    (void)pwszclientid;
    (void)pwszclientaddress;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* himage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pppwszdriverpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pulcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliObtainDriverPackages")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himage, ppwszservername, pppwszdriverpackages, pulcount) : -1;
#else
    (void)himage;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszmachineinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pppwszdriverpackages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pulcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliObtainDriverPackagesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsession, pwszmachineinfo, ppwszservername, pppwszdriverpackages, pulcount) : -1;
#else
    (void)hsession;
    (void)pwszmachineinfo;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliRegisterTrace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfn) : -1;
#else
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ulsizeinbytes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliSetTransferBufferSize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ulsizeinbytes);
#else
    (void)ulsizeinbytes;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwsznamespace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszremotefilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszlocalfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pfnwdsclicallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pvuserdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* phtransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliTransferFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszserver, pwsznamespace, pwszremotefilepath, pwszlocalfilepath, dwflags, dwreserved, pfnwdsclicallback, pvuserdata, phtransfer) : -1;
#else
    (void)pwszserver;
    (void)pwsznamespace;
    (void)pwszremotefilepath;
    (void)pwszlocalfilepath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* himage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszlocalpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pfnwdsclicallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvuserdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* phtransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliTransferImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himage, pwszlocalpath, dwflags, dwreserved, pfnwdsclicallback, pvuserdata, phtransfer) : -1;
#else
    (void)himage;
    (void)pwszlocalpath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htransfer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsCliWaitForTransfer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htransfer) : -1;
#else
    (void)htransfer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientAddRefBuffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvbuffer) : 0;
#else
    (void)pvbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientCancelSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwerrorcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientCancelSessionEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey, dwerrorcode) : 0;
#else
    (void)hsessionkey;
    (void)dwerrorcode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientCloseSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pulloffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientCompleteReceive")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey, ulsize, pulloffset) : 0;
#else
    (void)hsessionkey;
    (void)ulsize;
    (void)pulloffset;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psessionrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcallerdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientInitializeSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psessionrequest, pcallerdata, hsessionkey) : 0;
#else
    (void)psessionrequest;
    (void)pcallerdata;
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pustatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* puerrorcode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientQueryStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey, pustatus, puerrorcode) : 0;
#else
    (void)hsessionkey;
    (void)pustatus;
    (void)puerrorcode;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t callbackid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientRegisterCallback")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey, callbackid, pfncallback) : 0;
#else
    (void)hsessionkey;
    (void)callbackid;
    (void)pfncallback;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientReleaseBuffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvbuffer) : 0;
#else
    (void)pvbuffer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientShutdown")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientStartSession")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsessionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t utimeout = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportClientWaitForCompletion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsessionkey, utimeout) : 0;
#else
    (void)hsessionkey;
    (void)utimeout;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportServerAllocateBuffer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, ulbuffersize) : NULL;
#else
    (void)hprovider;
    (void)ulbuffersize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulbytesread = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvuserdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t hreadresult = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportServerCompleteRead")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, ulbytesread, pvuserdata, hreadresult) : -1;
#else
    (void)hprovider;
    (void)ulbytesread;
    (void)pvuserdata;
    (void)hreadresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportServerFreeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, pvbuffer) : -1;
#else
    (void)hprovider;
    (void)pvbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t callbackid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportServerRegisterCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, callbackid, pfncallback) : -1;
#else
    (void)hprovider;
    (void)callbackid;
    (void)pfncallback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t severity = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WdsTransportServerTraceV")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, severity, pwszformat, params) : -1;
#else
    (void)hprovider;
    (void)severity;
    (void)pwszformat;
    (void)params;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_deploymentservices_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeAsyncRecvDone_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOption_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpAppendOptionRaw_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpGetOptionValue_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpGetVendorOptionValue_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpInitialize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpIsValid_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOption_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6AppendOptionRaw_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6CreateRelayRepl_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetOptionValue_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6GetVendorOptionValue_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6Initialize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6IsValid_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeDhcpv6ParseRelayForw_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeGetServerInfo_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeGetServerInfoEx_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxePacketAllocate", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxePacketAllocate_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxePacketFree", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxePacketFree_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderEnumClose_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderEnumFirst_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderEnumNext_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderFreeInfo_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderQueryIndex_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderRegister", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderRegister_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderSetAttribute_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeProviderUnRegister_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeRegisterCallback_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeSendReply", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeSendReply_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_PxeTraceV", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_PxeTraceV_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpAddOption", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpAddOption_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpCloseHandle_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpGetOptionBuffer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpInitialize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpInitialize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpParseInitialize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpParseInitializev6_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsBpQueryOption_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliAuthorizeSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliCancelTransfer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliClose", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliClose_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliCreateSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliFindFirstImage_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliFindNextImage_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliFreeStringArray_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetDriverQueryXml_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetEnumerationFlags_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageArchitecture_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageDescription_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageFiles_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageGroup_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHalName_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromFindHandle_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageHandleFromTransferHandle_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageIndex_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguage_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLanguages_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageLastModifiedTime_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageName_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageNamespace_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageParameter_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImagePath_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageSize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageType_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetImageVersion_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliGetTransferSize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliInitializeLog_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackages_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliObtainDriverPackagesEx_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliRegisterTrace_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliSetTransferBufferSize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliTransferFile_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliTransferImage_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsCliWaitForTransfer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientAddRefBuffer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientCancelSessionEx_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientCloseSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientCompleteReceive_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitialize_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientInitializeSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientQueryStatus_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientRegisterCallback_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientReleaseBuffer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientShutdown_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientStartSession_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportClientWaitForCompletion_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportServerAllocateBuffer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportServerCompleteRead_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportServerFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportServerRegisterCallback_napi));
    exports.Set("windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV", Napi::Function::New(env, windowssys_windows_win32_system_deploymentservices_WdsTransportServerTraceV_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_deploymentservices_napi, nullptr };
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
