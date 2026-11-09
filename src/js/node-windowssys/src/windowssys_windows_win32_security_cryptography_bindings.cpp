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

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptAddContextFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwposition = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptAddContextFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, dwposition) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)dwposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwposition = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptAddContextFunctionProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszprovider, dwposition) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptCloseAlgorithmProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, dwflags) : -1;
#else
    (void)halgorithm;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptConfigureContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptConfigureContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, pconfig) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptConfigureContextFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pconfig) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pconfig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptCreateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptCreateContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, pconfig) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptCreateHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhashobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashobject = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsecret = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptCreateHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, phhash, pbhashobject, cbhashobject, pbsecret, cbsecret, dwflags) : -1;
#else
    (void)halgorithm;
    (void)phhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nhashes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbhashobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbhashobject = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbsecret = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptCreateMultiHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, phhash, nhashes, pbhashobject, cbhashobject, pbsecret, cbsecret, dwflags) : -1;
#else
    (void)halgorithm;
    (void)phhash;
    (void)nhashes;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDecrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbiv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbiv = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDecrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pbiv, cbiv, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDeleteContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDeleteContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDeriveKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsharedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszkdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDeriveKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags) : -1;
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* htargetalg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDeriveKeyCapi")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, htargetalg, pbderivedkey, cbderivedkey, dwflags) : -1;
#else
    (void)hhash;
    (void)htargetalg;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbpassword = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbsalt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbsalt = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint64_t citerations = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDeriveKeyPBKDF2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprf, pbpassword, cbpassword, pbsalt, cbsalt, citerations, pbderivedkey, cbderivedkey, dwflags) : -1;
#else
    (void)hprf;
    (void)pbpassword;
    (void)cbpassword;
    (void)pbsalt;
    (void)cbsalt;
    (void)citerations;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDestroyHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDestroyHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash) : -1;
#else
    (void)hhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDestroyKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDestroyKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey) : -1;
#else
    (void)hkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDestroySecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDestroySecret")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsecret) : -1;
#else
    (void)hsecret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDuplicateHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phnewhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhashobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashobject = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDuplicateHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, phnewhash, pbhashobject, cbhashobject, dwflags) : -1;
#else
    (void)hhash;
    (void)phnewhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptDuplicateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phnewkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbkeyobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbkeyobject = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptDuplicateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, phnewkey, pbkeyobject, cbkeyobject, dwflags) : -1;
#else
    (void)hkey;
    (void)phnewkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEncrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbiv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbiv = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEncrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pbiv, cbiv, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwalgoperations = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* palgcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppalglist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumAlgorithms")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwalgoperations, palgcount, ppalglist, dwflags) : -1;
#else
    (void)dwalgoperations;
    (void)palgcount;
    (void)ppalglist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumContextFunctionProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pcbbuffer, ppbuffer) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumContextFunctions")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pcbbuffer, ppbuffer) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumContexts")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pcbbuffer, ppbuffer) : -1;
#else
    (void)dwtable;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pimplcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppimpllist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszalgid, pimplcount, ppimpllist, dwflags) : -1;
#else
    (void)pszalgid;
    (void)pimplcount;
    (void)ppimpllist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptEnumRegisteredProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcbbuffer, ppbuffer) : -1;
#else
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptExportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hexportkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptExportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, hexportkey, pszblobtype, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptFinalizeKeyPair")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwflags) : -1;
#else
    (void)hkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptFinishHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptFinishHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pboutput, cboutput, dwflags) : -1;
#else
    (void)hhash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptFreeBuffer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pvbuffer);
#else
    (void)pvbuffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptGenRandom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptGenRandom")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, pbbuffer, cbbuffer, dwflags) : -1;
#else
    (void)halgorithm;
    (void)pbbuffer;
    (void)cbbuffer;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptGenerateKeyPair")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, phkey, dwlength, dwflags) : -1;
#else
    (void)halgorithm;
    (void)phkey;
    (void)dwlength;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbkeyobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbkeyobject = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsecret = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptGenerateSymmetricKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, phkey, pbkeyobject, cbkeyobject, pbsecret, cbsecret, dwflags) : -1;
#else
    (void)halgorithm;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptGetFipsAlgorithmMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfenabled) : -1;
#else
    (void)pfenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptGetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptGetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, pszproperty, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbsecret = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, pbsecret, cbsecret, pbinput, cbinput, pboutput, cboutput) : -1;
#else
    (void)halgorithm;
    (void)pbsecret;
    (void)cbsecret;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptHashData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptHashData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pbinput, cbinput, dwflags) : -1;
#else
    (void)hhash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptImportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* himportkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbkeyobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbkeyobject = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptImportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, himportkey, pszblobtype, phkey, pbkeyobject, cbkeyobject, pbinput, cbinput, dwflags) : -1;
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptImportKeyPair_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* halgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* himportkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptImportKeyPair")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(halgorithm, himportkey, pszblobtype, phkey, pbinput, cbinput, dwflags) : -1;
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptKeyDerivation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptKeyDerivation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszimplementation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptOpenAlgorithmProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phalgorithm, pszalgid, pszimplementation, dwflags) : -1;
#else
    (void)phalgorithm;
    (void)pszalgid;
    (void)pszimplementation;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t operationtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* poperations = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cboperations = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptProcessMultiOperations")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, operationtype, poperations, cboperations, dwflags) : -1;
#else
    (void)hobject;
    (void)operationtype;
    (void)poperations;
    (void)cboperations;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptQueryContextConfiguration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, pcbbuffer, ppbuffer) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptQueryContextFunctionConfiguration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pcbbuffer, ppbuffer) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptQueryContextFunctionProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszproperty, pcbvalue, ppbvalue) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptQueryProviderRegistration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovider, dwmode, dwinterface, pcbbuffer, ppbuffer) : -1;
#else
    (void)pszprovider;
    (void)dwmode;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptRegisterConfigChangeNotify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phevent) : -1;
#else
    (void)phevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptRegisterProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* preg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptRegisterProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovider, dwflags, preg) : -1;
#else
    (void)pszprovider;
    (void)dwflags;
    (void)preg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptRemoveContextFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptRemoveContextFunctionProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszprovider) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptResolveProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwmode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptResolveProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszcontext, dwinterface, pszfunction, pszprovider, dwmode, dwflags, pcbbuffer, ppbuffer) : -1;
#else
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwmode;
    (void)dwflags;
    (void)pcbbuffer;
    (void)ppbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptSecretAgreement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprivkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hpubkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phagreedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptSecretAgreement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprivkey, hpubkey, phagreedsecret, dwflags) : -1;
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwtable = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinterface = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbvalue = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptSetContextFunctionProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwtable, pszcontext, dwinterface, pszfunction, pszproperty, cbvalue, pbvalue) : -1;
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)cbvalue;
    (void)pbvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptSetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptSetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, pszproperty, pbinput, cbinput, dwflags) : -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptSignHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptSignHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, ppaddinginfo, pbinput, cbinput, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptUnregisterConfigChangeNotify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptUnregisterProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovider) : -1;
#else
    (void)pszprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_BCryptVerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhash = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BCryptVerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, ppaddinginfo, pbhash, cbhash, pbsignature, cbsignature, dwflags) : -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhash;
    (void)cbhash;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCRLContextToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pcrlcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCRLLinkToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pcrlcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCTLContextToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pctlcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCTLLinkToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pctlcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCertificateContextToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pcertcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstorecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddCertificateLinkToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pcertcontext, dwadddisposition, ppstorecontext) : -1;
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbcrlencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbcrlencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEncodedCRLToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, pbcrlencoded, cbcrlencoded, dwadddisposition, ppcrlcontext) : -1;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    (void)dwadddisposition;
    (void)ppcrlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmsgandcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbctlencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbctlencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEncodedCTLToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwmsgandcertencodingtype, pbctlencoded, cbctlencoded, dwadddisposition, ppctlcontext) : -1;
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    (void)dwadddisposition;
    (void)ppctlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbcertencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbcertencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEncodedCertificateToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, pbcertencoded, cbcertencoded, dwadddisposition, ppcertcontext) : -1;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    (void)dwadddisposition;
    (void)ppcertcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcertstorename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbcertencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbcertencoded = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcertstorename, pbcertencoded, cbcertencoded) : -1;
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcertstorename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbcertencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbcertencoded = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcertstorename, pbcertencoded, cbcertencoded) : -1;
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszusageidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddEnhancedKeyUsageIdentifier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, pszusageidentifier) : -1;
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hserverocspresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddRefServerOcspResponse")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hserverocspresponse);
#else
    (void)hserverocspresponse;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pserverocspresponsecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddRefServerOcspResponseContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pserverocspresponsecontext);
#else
    (void)pserverocspresponsecontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbelement = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwadddisposition = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwcontexttypeflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pdwcontexttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddSerializedElementToStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pbelement, cbelement, dwadddisposition, dwflags, dwcontexttypeflags, pdwcontexttype, ppvcontext) : -1;
#else
    (void)hcertstore;
    (void)pbelement;
    (void)cbelement;
    (void)dwadddisposition;
    (void)dwflags;
    (void)dwcontexttypeflags;
    (void)pdwcontexttype;
    (void)ppvcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAddStoreToCollection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcollectionstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hsiblingstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwupdateflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwpriority = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAddStoreToCollection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcollectionstore, hsiblingstore, dwupdateflags, dwpriority) : -1;
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
    (void)dwupdateflags;
    (void)dwpriority;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertAlgIdToOID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwalgid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertAlgIdToOID")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwalgid) : NULL;
#else
    (void)dwalgid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hserverocspresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCloseServerOcspResponse")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hserverocspresponse, dwflags);
#else
    (void)hserverocspresponse;
    (void)dwflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCloseStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCloseStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwflags) : -1;
#else
    (void)hcertstore;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCompareCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcertid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcertid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCompareCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pcertid1, pcertid2) : -1;
#else
    (void)dwcertencodingtype;
    (void)pcertid1;
    (void)pcertid2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCompareCertificateName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcertname1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcertname2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCompareCertificateName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pcertname1, pcertname2) : -1;
#else
    (void)dwcertencodingtype;
    (void)pcertname1;
    (void)pcertname2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pint1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pint2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCompareIntegerBlob")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pint1, pint2) : -1;
#else
    (void)pint1;
    (void)pint2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppublickey1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppublickey2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertComparePublicKeyInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, ppublickey1, ppublickey2) : -1;
#else
    (void)dwcertencodingtype;
    (void)ppublickey1;
    (void)ppublickey2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertControlStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwctrltype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvctrlpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertControlStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwflags, dwctrltype, pvctrlpara) : -1;
#else
    (void)hcertstore;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateCRLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbcrlencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbcrlencoded = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateCRLContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pbcrlencoded, cbcrlencoded) : NULL;
#else
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateCTLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgandcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbctlencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbctlencoded = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateCTLContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgandcertencodingtype, pbctlencoded, cbctlencoded) : NULL;
#else
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t coptattr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgoptattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pctlentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbctlentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateCTLEntryFromCertificateContextProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, coptattr, rgoptattr, dwflags, pvreserved, pctlentry, pcbctlentry) : -1;
#else
    (void)pcertcontext;
    (void)coptattr;
    (void)rgoptattr;
    (void)dwflags;
    (void)pvreserved;
    (void)pctlentry;
    (void)pcbctlentry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phchainengine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateCertificateChainEngine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconfig, phchainengine) : -1;
#else
    (void)pconfig;
    (void)phchainengine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateCertificateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbcertencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbcertencoded = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateCertificateContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pbcertencoded, cbcertencoded) : NULL;
#else
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcontexttype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcreatepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcontexttype, dwencodingtype, pbencoded, cbencoded, dwflags, pcreatepara) : NULL;
#else
    (void)dwcontexttype;
    (void)dwencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pcreatepara;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprovorncryptkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* psubjectissuerblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pkeyprovinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psignaturealgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pstarttime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pendtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pextensions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertCreateSelfSignCertificate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprovorncryptkey, psubjectissuerblob, dwflags, pkeyprovinfo, psignaturealgorithm, pstarttime, pendtime, pextensions) : NULL;
#else
    (void)hcryptprovorncryptkey;
    (void)psubjectissuerblob;
    (void)dwflags;
    (void)pkeyprovinfo;
    (void)psignaturealgorithm;
    (void)pstarttime;
    (void)pendtime;
    (void)pextensions;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDeleteCRLFromStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext) : -1;
#else
    (void)pcrlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDeleteCTLFromStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext) : -1;
#else
    (void)pctlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDeleteCertificateFromStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext) : -1;
#else
    (void)pcertcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDuplicateCRLContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext) : NULL;
#else
    (void)pcrlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDuplicateCTLContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext) : NULL;
#else
    (void)pctlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDuplicateCertificateChain")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pchaincontext) : NULL;
#else
    (void)pchaincontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDuplicateCertificateContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext) : NULL;
#else
    (void)pcertcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertDuplicateStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertDuplicateStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore) : NULL;
#else
    (void)hcertstore;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCRLContextProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext, dwpropid) : 0;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCRLsInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pprevcrlcontext) : NULL;
#else
    (void)hcertstore;
    (void)pprevcrlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCTLContextProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext, dwpropid) : 0;
#else
    (void)pctlcontext;
    (void)dwpropid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCTLsInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pprevctlcontext) : NULL;
#else
    (void)hcertstore;
    (void)pprevctlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCertificateContextProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwpropid) : 0;
#else
    (void)pcertcontext;
    (void)dwpropid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprevcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumCertificatesInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pprevcertcontext) : NULL;
#else
    (void)hcertstore;
    (void)pprevcertcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvsystemstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumPhysicalStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvsystemstore, dwflags, pvarg, pfnenum) : -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppvnextsubject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psubjectidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pencodedattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumSubjectInSortedCTL")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext, ppvnextsubject, psubjectidentifier, pencodedattributes) : -1;
#else
    (void)pctlcontext;
    (void)ppvnextsubject;
    (void)psubjectidentifier;
    (void)pencodedattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumSystemStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvsystemstorelocationpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumSystemStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pvsystemstorelocationpara, pvarg, pfnenum) : -1;
#else
    (void)dwflags;
    (void)pvsystemstorelocationpara;
    (void)pvarg;
    (void)pfnenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfnenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertEnumSystemStoreLocation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pvarg, pfnenum) : -1;
#else
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cattr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindAttribute")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszobjid, cattr, rgattr) : NULL;
#else
    (void)pszobjid;
    (void)cattr;
    (void)rgattr;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindCRLInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwfindflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfindtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvfindpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprevcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindCRLInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevcrlcontext) : NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcrlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindCTLInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwmsgandcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwfindflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfindtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvfindpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprevctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindCTLInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwmsgandcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevctlcontext) : NULL;
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevctlcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppcrlentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindCertificateInCRL")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, pcrlcontext, dwflags, pvreserved, ppcrlentry) : -1;
#else
    (void)pcert;
    (void)pcrlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)ppcrlentry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindCertificateInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwfindflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfindtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvfindpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprevcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindCertificateInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevcertcontext) : NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcertcontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindChainInStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwfindflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwfindtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvfindpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprevchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindChainInStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara, pprevchaincontext) : NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevchaincontext;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindExtension_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cextensions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgextensions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindExtension")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszobjid, cextensions, rgextensions) : NULL;
#else
    (void)pszobjid;
    (void)cextensions;
    (void)rgextensions;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindRDNAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindRDNAttr")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszobjid, pname) : NULL;
#else
    (void)pszobjid;
    (void)pname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwsubjecttype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvsubject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindSubjectInCTL")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, dwsubjecttype, pvsubject, pctlcontext, dwflags) : NULL;
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)pctlcontext;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubjectidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pencodedattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFindSubjectInSortedCTL")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubjectidentifier, pctlcontext, dwflags, pvreserved, pencodedattributes) : -1;
#else
    (void)psubjectidentifier;
    (void)pctlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)pencodedattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCRLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCRLContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext) : -1;
#else
    (void)pcrlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCTLContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCTLContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext) : -1;
#else
    (void)pctlcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCertificateChain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCertificateChain")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pchaincontext);
#else
    (void)pchaincontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hchainengine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCertificateChainEngine")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hchainengine);
#else
    (void)hchainengine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgpselection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCertificateChainList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prgpselection);
#else
    (void)prgpselection;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeCertificateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeCertificateContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext) : -1;
#else
    (void)pcertcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pserverocspresponsecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertFreeServerOcspResponseContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pserverocspresponsecontext);
#else
    (void)pserverocspresponsecontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetCRLContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext, dwpropid, pvdata, pcbdata) : -1;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetCRLFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pissuercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprevcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetCRLFromStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, pissuercontext, pprevcrlcontext, pdwflags) : NULL;
#else
    (void)hcertstore;
    (void)pissuercontext;
    (void)pprevcrlcontext;
    (void)pdwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetCTLContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext, dwpropid, pvdata, pcbdata) : -1;
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetCertificateChain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hchainengine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hadditionalstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pchainpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetCertificateChain")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchainengine, pcertcontext, ptime, hadditionalstore, pchainpara, dwflags, pvreserved, ppchaincontext) : -1;
#else
    (void)hchainengine;
    (void)pcertcontext;
    (void)ptime;
    (void)hadditionalstore;
    (void)pchainpara;
    (void)dwflags;
    (void)pvreserved;
    (void)ppchaincontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetCertificateContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwpropid, pvdata, pcbdata) : -1;
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetEnhancedKeyUsage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwflags, pusage, pcbusage) : -1;
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pusage;
    (void)pcbusage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcertinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbkeyusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbkeyusage = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetIntendedKeyUsage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pcertinfo, pbkeyusage, cbkeyusage) : -1;
#else
    (void)dwcertencodingtype;
    (void)pcertinfo;
    (void)pbkeyusage;
    (void)cbkeyusage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psubjectcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pprevissuercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetIssuerCertificateFromStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, psubjectcontext, pprevissuercontext, pdwflags) : NULL;
#else
    (void)hcertstore;
    (void)psubjectcontext;
    (void)pprevissuercontext;
    (void)pdwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetNameStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvtypepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psznamestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cchnamestring = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetNameStringA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwtype, dwflags, pvtypepara, psznamestring, cchnamestring) : 0;
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetNameStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvtypepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psznamestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cchnamestring = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetNameStringW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwtype, dwflags, pvtypepara, psznamestring, cchnamestring) : 0;
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetPublicKeyLength")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, ppublickey) : 0;
#else
    (void)dwcertencodingtype;
    (void)ppublickey;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hserverocspresponse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetServerOcspResponseContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hserverocspresponse, dwflags, pvreserved) : NULL;
#else
    (void)hserverocspresponse;
    (void)dwflags;
    (void)pvreserved;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetStoreProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetStoreProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwpropid, pvdata, pcbdata) : -1;
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcertid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetSubjectCertificateFromStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwcertencodingtype, pcertid) : NULL;
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pcertid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertGetValidUsages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ccerts = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* rghcerts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cnumoids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rghoids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcboids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertGetValidUsages")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ccerts, rghcerts, cnumoids, rghoids, pcboids) : -1;
#else
    (void)ccerts;
    (void)rghcerts;
    (void)cnumoids;
    (void)rghoids;
    (void)pcboids;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcertname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* prdn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertIsRDNAttrsInCertificateName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, dwflags, pcertname, prdn) : -1;
#else
    (void)dwcertencodingtype;
    (void)dwflags;
    (void)pcertname;
    (void)prdn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstrongsignpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszcnghashalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psigningcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertIsStrongHashToSign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstrongsignpara, pwszcnghashalgid, psigningcert) : -1;
#else
    (void)pstrongsignpara;
    (void)pwszcnghashalgid;
    (void)psigningcert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcrl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertIsValidCRLForCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, pcrl, dwflags, pvreserved) : -1;
#else
    (void)pcert;
    (void)pcrl;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertIsWeakHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwhashusetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pwszcnghashalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwchainflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psignerchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pwszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertIsWeakHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwhashusetype, pwszcnghashalgid, dwchainflags, psignerchaincontext, ptimestamp, pwszfilename) : -1;
#else
    (void)dwhashusetype;
    (void)pwszcnghashalgid;
    (void)dwchainflags;
    (void)psignerchaincontext;
    (void)ptimestamp;
    (void)pwszfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertNameToStrA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwstrtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t csz = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertNameToStrA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pname, dwstrtype, psz, csz) : 0;
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertNameToStrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwstrtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t csz = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertNameToStrW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pname, dwstrtype, psz, csz) : 0;
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertOIDToAlgId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertOIDToAlgId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszobjid) : 0;
#else
    (void)pszobjid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* popenpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertOpenServerOcspResponse")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pchaincontext, dwflags, popenpara) : NULL;
#else
    (void)pchaincontext;
    (void)dwflags;
    (void)popenpara;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertOpenStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszstoreprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t hcryptprov = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertOpenStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszstoreprovider, dwencodingtype, hcryptprov, dwflags, pvpara) : NULL;
#else
    (void)lpszstoreprovider;
    (void)dwencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pvpara;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szsubsystemprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertOpenSystemStoreA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, szsubsystemprotocol) : NULL;
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szsubsystemprotocol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertOpenSystemStoreW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, szsubsystemprotocol) : NULL;
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRDNValueToStrA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwvaluetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t csz = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRDNValueToStrA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwvaluetype, pvalue, psz, csz) : 0;
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRDNValueToStrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwvaluetype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t csz = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRDNValueToStrW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwvaluetype, pvalue, psz, csz) : 0;
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvsystemstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszstorename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pstoreinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRegisterPhysicalStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvsystemstore, dwflags, pwszstorename, pstoreinfo, pvreserved) : -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    (void)pstoreinfo;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRegisterSystemStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvsystemstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pstoreinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRegisterSystemStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvsystemstore, dwflags, pstoreinfo, pvreserved) : -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pstoreinfo;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszusageidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRemoveEnhancedKeyUsageIdentifier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, pszusageidentifier) : -1;
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcollectionstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hsiblingstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRemoveStoreFromCollection")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(hcollectionstore, hsiblingstore);
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hchainengine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertResyncCertificateChainEngine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hchainengine) : -1;
#else
    (void)hchainengine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszlogoorbiometrictype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwretrievalflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ppwszmimetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertRetrieveLogoOrBiometricInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, lpszlogoorbiometrictype, dwretrievalflags, dwtimeout, dwflags, pvreserved, ppbdata, pcbdata, ppwszmimetype) : -1;
#else
    (void)pcertcontext;
    (void)lpszlogoorbiometrictype;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)dwflags;
    (void)pvreserved;
    (void)ppbdata;
    (void)pcbdata;
    (void)ppwszmimetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSaveStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsaveas = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwsaveto = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvsavetopara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSaveStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwencodingtype, dwsaveas, dwsaveto, pvsavetopara, dwflags) : -1;
#else
    (void)hcertstore;
    (void)dwencodingtype;
    (void)dwsaveas;
    (void)dwsaveto;
    (void)pvsavetopara;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSelectCertificateChains_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pselectioncontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pchainparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ccriteria = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgpcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* hstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcselection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pprgpselection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSelectCertificateChains")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pselectioncontext, dwflags, pchainparameters, ccriteria, rgpcriteria, hstore, pcselection, pprgpselection) : -1;
#else
    (void)pselectioncontext;
    (void)dwflags;
    (void)pchainparameters;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)hstore;
    (void)pcselection;
    (void)pprgpselection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSerializeCRLStoreElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext, dwflags, pbelement, pcbelement) : -1;
#else
    (void)pcrlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSerializeCTLStoreElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext, dwflags, pbelement, pcbelement) : -1;
#else
    (void)pctlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSerializeCertificateStoreElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwflags, pbelement, pcbelement) : -1;
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcrlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetCRLContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcrlcontext, dwpropid, dwflags, pvdata) : -1;
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pctlcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetCTLContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pctlcontext, dwpropid, dwflags, pvdata) : -1;
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pctlentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetCertificateContextPropertiesFromCTLEntry")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, pctlentry, dwflags) : -1;
#else
    (void)pcertcontext;
    (void)pctlentry;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetCertificateContextProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, dwpropid, dwflags, pvdata) : -1;
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetEnhancedKeyUsage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, pusage) : -1;
#else
    (void)pcertcontext;
    (void)pusage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertSetStoreProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSetStoreProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcertstore, dwpropid, dwflags, pvdata) : -1;
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertStrToNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszx500 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwstrtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppszerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertStrToNameA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pszx500, dwstrtype, pvreserved, pbencoded, pcbencoded, ppszerror) : -1;
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertStrToNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszx500 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwstrtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppszerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertStrToNameW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pszx500, dwstrtype, pvreserved, pbencoded, pcbencoded, ppszerror) : -1;
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvsystemstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszstorename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertUnregisterPhysicalStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvsystemstore, dwflags, pwszstorename) : -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvsystemstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertUnregisterSystemStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvsystemstore, dwflags) : -1;
#else
    (void)pvsystemstore;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pcertid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccrlinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgpcrlinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyCRLRevocation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pcertid, ccrlinfo, rgpcrlinfo) : -1;
#else
    (void)dwcertencodingtype;
    (void)pcertid;
    (void)ccrlinfo;
    (void)rgpcrlinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptimetoverify = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcrlinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyCRLTimeValidity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptimetoverify, pcrlinfo) : -1;
#else
    (void)ptimetoverify;
    (void)pcrlinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwsubjecttype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvsubject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psubjectusage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pverifyusagepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pverifyusagestatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyCTLUsage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, dwsubjecttype, pvsubject, psubjectusage, dwflags, pverifyusagepara, pverifyusagestatus) : -1;
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)psubjectusage;
    (void)dwflags;
    (void)pverifyusagepara;
    (void)pverifyusagestatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszpolicyoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppolicypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppolicystatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyCertificateChainPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszpolicyoid, pchaincontext, ppolicypara, ppolicystatus) : -1;
#else
    (void)pszpolicyoid;
    (void)pchaincontext;
    (void)ppolicypara;
    (void)ppolicystatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyRevocation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwrevtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ccontext = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgpvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* prevpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* prevstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyRevocation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, dwrevtype, ccontext, rgpvcontext, dwflags, prevpara, prevstatus) : -1;
#else
    (void)dwencodingtype;
    (void)dwrevtype;
    (void)ccontext;
    (void)rgpvcontext;
    (void)dwflags;
    (void)prevpara;
    (void)prevstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pissuer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifySubjectCertificateContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubject, pissuer, pdwflags) : -1;
#else
    (void)psubject;
    (void)pissuer;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptimetoverify = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcertinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyTimeValidity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptimetoverify, pcertinfo) : -1;
#else
    (void)ptimetoverify;
    (void)pcertinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pissuerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertVerifyValidityNesting")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubjectinfo, pissuerinfo) : -1;
#else
    (void)psubjectinfo;
    (void)pissuerinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CloseCryptoHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseCryptoHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto) : -1;
#else
    (void)hcrypto;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phcryptprovorncryptkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwkeyspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfcallerfreeprovorncryptkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptAcquireCertificatePrivateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, dwflags, pvparameters, phcryptprovorncryptkey, pdwkeyspec, pfcallerfreeprovorncryptkey) : -1;
#else
    (void)pcert;
    (void)dwflags;
    (void)pvparameters;
    (void)phcryptprovorncryptkey;
    (void)pdwkeyspec;
    (void)pfcallerfreeprovorncryptkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptAcquireContextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phprov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptAcquireContextA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phprov, szcontainer, szprovider, dwprovtype, dwflags) : -1;
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptAcquireContextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phprov = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptAcquireContextW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phprov, szcontainer, szprovider, dwprovtype, dwflags) : -1;
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptBinaryToStringA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbbinary = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptBinaryToStringA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbbinary, cbbinary, dwflags, pszstring, pcchstring) : -1;
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptBinaryToStringW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbbinary = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcchstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptBinaryToStringW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbbinary, cbbinary, dwflags, pszstring, pcchstring) : -1;
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hasync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCloseAsyncHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hasync) : -1;
#else
    (void)hasync;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptContextAddRef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptContextAddRef")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, pdwreserved, dwflags) : -1;
#else
    (void)hprov;
    (void)pdwreserved;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* phasync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCreateAsyncHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, phasync) : -1;
#else
    (void)dwflags;
    (void)phasync;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptCreateHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t algid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t hkey = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCreateHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, algid, hkey, dwflags, phhash) : -1;
#else
    (void)hprov;
    (void)algid;
    (void)hkey;
    (void)dwflags;
    (void)phhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszpubkeyoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppubkeystruc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbpubkeystruc = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptCreateKeyIdentifierFromCSP")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pszpubkeyoid, ppubkeystruc, cbpubkeystruc, dwflags, pvreserved, pbhash, pcbhash) : -1;
#else
    (void)dwcertencodingtype;
    (void)pszpubkeyoid;
    (void)ppubkeystruc;
    (void)cbpubkeystruc;
    (void)dwflags;
    (void)pvreserved;
    (void)pbhash;
    (void)pcbhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecodeMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgtypeflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdecryptpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pverifypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwsignerindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbencodedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbencodedblob = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwprevinnercontenttype = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pdwmsgtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pdwinnercontenttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pcbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* ppxchgcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* ppsignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecodeMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgtypeflags, pdecryptpara, pverifypara, dwsignerindex, pbencodedblob, cbencodedblob, dwprevinnercontenttype, pdwmsgtype, pdwinnercontenttype, pbdecoded, pcbdecoded, ppxchgcert, ppsignercert) : -1;
#else
    (void)dwmsgtypeflags;
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencodedblob;
    (void)cbencodedblob;
    (void)dwprevinnercontenttype;
    (void)pdwmsgtype;
    (void)pdwinnercontenttype;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppxchgcert;
    (void)ppsignercert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecodeObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecodeObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, lpszstructtype, pbencoded, cbencoded, dwflags, pvstructinfo, pcbstructinfo) : -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pdecodepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecodeObjectEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, lpszstructtype, pbencoded, cbencoded, dwflags, pdecodepara, pvstructinfo, pcbstructinfo) : -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pdecodepara;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hhash = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t final = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, hhash, final, dwflags, pbdata, pdwdatalen) : -1;
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdecryptpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pverifypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsignerindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbencryptedblob = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbdecrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbdecrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppxchgcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ppsignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecryptAndVerifyMessageSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdecryptpara, pverifypara, dwsignerindex, pbencryptedblob, cbencryptedblob, pbdecrypted, pcbdecrypted, ppxchgcert, ppsignercert) : -1;
#else
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    (void)ppsignercert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDecryptMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdecryptpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbencryptedblob = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbdecrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbdecrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppxchgcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDecryptMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdecryptpara, pbencryptedblob, cbencryptedblob, pbdecrypted, pcbdecrypted, ppxchgcert) : -1;
#else
    (void)pdecryptpara;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDeriveKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t algid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t hbasedata = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDeriveKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, algid, hbasedata, dwflags, phkey) : -1;
#else
    (void)hprov;
    (void)algid;
    (void)hbasedata;
    (void)dwflags;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDestroyHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDestroyHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash) : -1;
#else
    (void)hhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDestroyKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDestroyKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey) : -1;
#else
    (void)hkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDuplicateHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDuplicateHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pdwreserved, dwflags, phhash) : -1;
#else
    (void)hhash;
    (void)pdwreserved;
    (void)dwflags;
    (void)phhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptDuplicateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptDuplicateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pdwreserved, dwflags, phkey) : -1;
#else
    (void)hkey;
    (void)pdwreserved;
    (void)dwflags;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEncodeObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEncodeObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, lpszstructtype, pvstructinfo, pbencoded, pcbencoded) : -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)pbencoded;
    (void)pcbencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pencodepara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEncodeObjectEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, lpszstructtype, pvstructinfo, dwflags, pencodepara, pvencoded, pcbencoded) : -1;
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)dwflags;
    (void)pencodepara;
    (void)pvencoded;
    (void)pcbencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEncrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hhash = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t final = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwbuflen = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEncrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, hhash, final, dwflags, pbdata, pdwdatalen, dwbuflen) : -1;
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwbuflen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEncryptMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pencryptpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t crecipientcert = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgprecipientcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbtobeencrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbtobeencrypted = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEncryptMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pencryptpara, crecipientcert, rgprecipientcert, pbtobeencrypted, cbtobeencrypted, pbencryptedblob, pcbencryptedblob) : -1;
#else
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobeencrypted;
    (void)cbtobeencrypted;
    (void)pbencryptedblob;
    (void)pcbencryptedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pkeyidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwszcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfnenum = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumKeyIdentifierProperties")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvarg, pfnenum) : -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvarg;
    (void)pfnenum;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfnenumoidfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumOIDFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pszoid, dwflags, pvarg, pfnenumoidfunc) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidfunc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwgroupid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnenumoidinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumOIDInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwgroupid, dwflags, pvarg, pfnenumoidinfo) : -1;
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwprovtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sztypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbtypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumProviderTypesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, sztypename, pcbtypename) : -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwprovtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sztypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbtypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumProviderTypesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, sztypename, pcbtypename) : -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumProvidersA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwprovtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumProvidersA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, szprovname, pcbprovname) : -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptEnumProvidersW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwprovtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptEnumProvidersW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwindex, pdwreserved, dwflags, pdwprovtype, szprovname, pcbprovname) : -1;
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptExportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hexpkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwblobtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptExportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, hexpkey, dwblobtype, dwflags, pbdata, pdwdatalen) : -1;
#else
    (void)hkey;
    (void)hexpkey;
    (void)dwblobtype;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptExportPKCS8_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszprivatekeyobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbprivatekeyblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbprivatekeyblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptExportPKCS8")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwkeyspec, pszprivatekeyobjid, dwflags, pvauxinfo, pbprivatekeyblob, pcbprivatekeyblob) : -1;
#else
    (void)hcryptprov;
    (void)dwkeyspec;
    (void)pszprivatekeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pbprivatekeyblob;
    (void)pcbprivatekeyblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprovorncryptkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptExportPublicKeyInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pinfo, pcbinfo) : -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pcbinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprovorncryptkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszpublickeyobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pszpublickeyobjid, dwflags, pvauxinfo, pinfo, pcbinfo) : -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbcryptkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszpublickeyobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoFromBCryptKeyHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbcryptkey, dwcertencodingtype, pszpublickeyobjid, dwflags, pvauxinfo, pinfo, pcbinfo) : -1;
#else
    (void)hbcryptkey;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptFindCertificateKeyProvInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, dwflags, pvreserved) : -1;
#else
    (void)pcert;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptFindLocalizedName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszcryptname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptFindLocalizedName")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszcryptname) : NULL;
#else
    (void)pwszcryptname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptFindOIDInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwkeytype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwgroupid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptFindOIDInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwkeytype, pvkey, dwgroupid) : NULL;
#else
    (void)dwkeytype;
    (void)pvkey;
    (void)dwgroupid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptFormatObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwformattype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwformatstrtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pformatstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pbformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcbformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptFormatObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, dwformattype, dwformatstrtype, pformatstruct, lpszstructtype, pbencoded, cbencoded, pbformat, pcbformat) : -1;
#else
    (void)dwcertencodingtype;
    (void)dwformattype;
    (void)dwformatstrtype;
    (void)pformatstruct;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbformat;
    (void)pcbformat;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfuncaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptFreeOIDFunctionAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfuncaddr, dwflags) : -1;
#else
    (void)hfuncaddr;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGenKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t algid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGenKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, algid, dwflags, phkey) : -1;
#else
    (void)hprov;
    (void)algid;
    (void)dwflags;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGenRandom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwlen = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGenRandom")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, dwlen, pbbuffer) : -1;
#else
    (void)hprov;
    (void)dwlen;
    (void)pbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetAsyncParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hasync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pszparamoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppfnfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetAsyncParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hasync, pszparamoid, ppvparam, ppfnfree) : -1;
#else
    (void)hasync;
    (void)pszparamoid;
    (void)ppvparam;
    (void)ppfnfree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfuncset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszdlllist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcchdlllist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetDefaultOIDDllList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfuncset, dwencodingtype, pwszdlllist, pcchdlllist) : -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdlllist;
    (void)pcchdlllist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfuncset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pwszdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppvfuncaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phfuncaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetDefaultOIDFunctionAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfuncset, dwencodingtype, pwszdll, dwflags, ppvfuncaddr, phfuncaddr) : -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdll;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetDefaultProviderA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwprovtype, pdwreserved, dwflags, pszprovname, pcbprovname) : -1;
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetDefaultProviderW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwprovtype, pdwreserved, dwflags, pszprovname, pcbprovname) : -1;
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetHashParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetHashParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, dwparam, pbdata, pdwdatalen, dwflags) : -1;
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pkeyidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwszcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetKeyIdentifierProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvdata, pcbdata) : -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetKeyParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetKeyParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwparam, pbdata, pdwdatalen, dwflags) : -1;
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgandcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t hcryptprov = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbsignedblob = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetMessageCertificates")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgandcertencodingtype, hcryptprov, dwflags, pbsignedblob, cbsignedblob) : NULL;
#else
    (void)dwmsgandcertencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pbsignedblob;
    (void)cbsignedblob;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbsignedblob = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetMessageSignerCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, pbsignedblob, cbsignedblob) : -1;
#else
    (void)dwmsgencodingtype;
    (void)pbsignedblob;
    (void)cbsignedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hfuncset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppvfuncaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phfuncaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetOIDFunctionAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hfuncset, dwencodingtype, pszoid, dwflags, ppvfuncaddr, phfuncaddr) : -1;
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pszoid;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwvaluetype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbvaluedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbvaluedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetOIDFunctionValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszvaluename, pdwvaluetype, pbvaluedata, pcbvaluedata) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)pdwvaluetype;
    (void)pbvaluedata;
    (void)pcbvaluedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetObjectUrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszurloid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* purlarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcburlarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* purlinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcburlinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetObjectUrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszurloid, pvpara, dwflags, purlarray, pcburlarray, purlinfo, pcburlinfo, pvreserved) : -1;
#else
    (void)pszurloid;
    (void)pvpara;
    (void)dwflags;
    (void)purlarray;
    (void)pcburlarray;
    (void)purlinfo;
    (void)pcburlinfo;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetProvParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwdatalen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetProvParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, dwparam, pbdata, pdwdatalen, dwflags) : -1;
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptGetUserKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phuserkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptGetUserKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, dwkeyspec, phuserkey) : -1;
#else
    (void)hprov;
    (void)dwkeyspec;
    (void)phuserkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t algid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, algid, dwflags, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashCertificate2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszcnghashalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashCertificate2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszcnghashalgid, dwflags, pvreserved, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)pwszcnghashalgid;
    (void)dwflags;
    (void)pvreserved;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdatalen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pbdata, dwdatalen, dwflags) : -1;
#else
    (void)hhash;
    (void)pbdata;
    (void)dwdatalen;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phashpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fdetachedhash = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ctobehashed = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgpbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* rgcbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbhashedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbhashedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phashpara, fdetachedhash, ctobehashed, rgpbtobehashed, rgcbtobehashed, pbhashedblob, pcbhashedblob, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)phashpara;
    (void)fdetachedhash;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbhashedblob;
    (void)pcbhashedblob;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t algid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashPublicKeyInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, algid, dwflags, dwcertencodingtype, pinfo, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashSessionKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashSessionKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, hkey, dwflags) : -1;
#else
    (void)hhash;
    (void)hkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptHashToBeSigned_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptHashToBeSigned")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwcertencodingtype, pbencoded, cbencoded, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptImportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwdatalen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t hpubkey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptImportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, pbdata, dwdatalen, hpubkey, dwflags, phkey) : -1;
#else
    (void)hprov;
    (void)pbdata;
    (void)dwdatalen;
    (void)hpubkey;
    (void)dwflags;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptImportPublicKeyInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwcertencodingtype, pinfo, phkey) : -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t aikeyalg = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwcertencodingtype, pinfo, aikeyalg, dwflags, pvauxinfo, phkey) : -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)aikeyalg;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcertencodingtype, pinfo, dwflags, pvauxinfo, phkey) : -1;
#else
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptInitOIDFunctionSet")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszfuncname, dwflags) : NULL;
#else
    (void)pszfuncname;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfncancel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptInstallCancelRetrieval")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfncancel, pvarg, dwflags, pvreserved) : -1;
#else
    (void)pfncancel;
    (void)pvarg;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwdefaulttype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvdefaultpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phdefaultcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptInstallDefaultContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwdefaulttype, pvdefaultpara, dwflags, pvreserved, phdefaultcontext) : -1;
#else
    (void)hcryptprov;
    (void)dwdefaulttype;
    (void)pvdefaultpara;
    (void)dwflags;
    (void)pvreserved;
    (void)phdefaultcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hmodule = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cfuncentry = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgfuncentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptInstallOIDFunctionAddress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hmodule, dwencodingtype, pszfuncname, cfuncentry, rgfuncentry, dwflags) : -1;
#else
    (void)hmodule;
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)cfuncentry;
    (void)rgfuncentry;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMemAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cbsize = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMemAlloc")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cbsize) : NULL;
#else
    (void)cbsize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMemFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMemFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pv);
#else
    (void)pv;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMemRealloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMemRealloc")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pv, cbsize) : NULL;
#else
    (void)pv;
    (void)cbsize;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwmsgtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvmsgencodeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszinnercontentobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgCalculateEncodedLength")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo, pszinnercontentobjid, cbdata) : 0;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg) : -1;
#else
    (void)hcryptmsg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwctrltype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvctrlpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgControl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg, dwflags, dwctrltype, pvctrlpara) : -1;
#else
    (void)hcryptmsg;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgCountersign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ccountersigners = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgcountersigners = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgCountersign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg, dwindex, ccountersigners, rgcountersigners) : -1;
#else
    (void)hcryptmsg;
    (void)dwindex;
    (void)ccountersigners;
    (void)rgcountersigners;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbsignerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbsignerinfo = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ccountersigners = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgcountersigners = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbcountersignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcountersignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgCountersignEncoded")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pbsignerinfo, cbsignerinfo, ccountersigners, rgcountersigners, pbcountersignature, pcbcountersignature) : -1;
#else
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)ccountersigners;
    (void)rgcountersigners;
    (void)pbcountersignature;
    (void)pcbcountersignature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgDuplicate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgDuplicate")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg) : NULL;
#else
    (void)hcryptmsg;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pctlinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psigninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgEncodeAndSignCTL")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, pctlinfo, psigninfo, dwflags, pbencoded, pcbencoded) : -1;
#else
    (void)dwmsgencodingtype;
    (void)pctlinfo;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t csignerstore = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rghsignerstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppsigner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwsignerindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgGetAndVerifySigner")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg, csignerstore, rghsignerstore, dwflags, ppsigner, pdwsignerindex) : -1;
#else
    (void)hcryptmsg;
    (void)csignerstore;
    (void)rghsignerstore;
    (void)dwflags;
    (void)ppsigner;
    (void)pdwsignerindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgGetParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwparamtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgGetParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg, dwparamtype, dwindex, pvdata, pcbdata) : -1;
#else
    (void)hcryptmsg;
    (void)dwparamtype;
    (void)dwindex;
    (void)pvdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwmsgtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t hcryptprov = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* precipientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pstreaminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgOpenToDecode")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, hcryptprov, precipientinfo, pstreaminfo) : NULL;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)hcryptprov;
    (void)precipientinfo;
    (void)pstreaminfo;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwmsgtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvmsgencodeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszinnercontentobjid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pstreaminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgOpenToEncode")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo, pszinnercontentobjid, pstreaminfo) : NULL;
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)pstreaminfo;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgSignCTL_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwmsgencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbctlcontent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbctlcontent = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psigninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgSignCTL")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwmsgencodingtype, pbctlcontent, cbctlcontent, psigninfo, dwflags, pbencoded, pcbencoded) : -1;
#else
    (void)dwmsgencodingtype;
    (void)pbctlcontent;
    (void)cbctlcontent;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgUpdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ffinal = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgUpdate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptmsg, pbdata, cbdata, ffinal) : -1;
#else
    (void)hcryptmsg;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbsignerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsignerinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignerinfocountersignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignerinfocountersignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcicountersigner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncoded")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwencodingtype, pbsignerinfo, cbsignerinfo, pbsignerinfocountersignature, cbsignerinfocountersignature, pcicountersigner) : -1;
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)pcicountersigner;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbsignerinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsignerinfo = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignerinfocountersignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignerinfocountersignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwsignertype = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pvsigner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* pvextra = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncodedEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwencodingtype, pbsignerinfo, cbsignerinfo, pbsignerinfocountersignature, cbsignerinfocountersignature, dwsignertype, pvsigner, dwflags, pvextra) : -1;
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)dwsignertype;
    (void)pvsigner;
    (void)dwflags;
    (void)pvextra;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptProtectData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdatain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szdatadescr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poptionalentropy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppromptstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pdataout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptProtectData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdatain, szdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags, pdataout) : -1;
#else
    (void)pdatain;
    (void)szdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptProtectMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdatain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbdatain = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptProtectMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdatain, cbdatain, dwflags) : -1;
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptQueryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwobjecttype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwexpectedcontenttypeflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwexpectedformattypeflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pdwmsgandcertencodingtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pdwcontenttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pdwformattype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* phcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* phmsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* ppvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptQueryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwobjecttype, pvobject, dwexpectedcontenttypeflags, dwexpectedformattypeflags, dwflags, pdwmsgandcertencodingtype, pdwcontenttype, pdwformattype, phcertstore, phmsg, ppvcontext) : -1;
#else
    (void)dwobjecttype;
    (void)pvobject;
    (void)dwexpectedcontenttypeflags;
    (void)dwexpectedformattypeflags;
    (void)dwflags;
    (void)pdwmsgandcertencodingtype;
    (void)pdwcontenttype;
    (void)pdwformattype;
    (void)phcertstore;
    (void)phmsg;
    (void)ppvcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwszdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRegisterDefaultOIDFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, dwindex, pwszdll) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)dwindex;
    (void)pwszdll;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszoverridefuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRegisterOIDFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszdll, pszoverridefuncname) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszdll;
    (void)pszoverridefuncname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRegisterOIDInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinfo, dwflags) : -1;
#else
    (void)pinfo;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptReleaseContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptReleaseContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, dwflags) : -1;
#else
    (void)hprov;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszobjectoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwretrievalflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t hasyncretrieve = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* pcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pvverify = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszurl, pszobjectoid, dwretrievalflags, dwtimeout, ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo) : -1;
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszobjectoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwretrievalflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t hasyncretrieve = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* pcredentials = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pvverify = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszurl, pszobjectoid, dwretrievalflags, dwtimeout, ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo) : -1;
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* wszurl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwretrievalflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwtimeout = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pszhashid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pptscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pptssigner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* phstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptRetrieveTimeStamp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wszurl, dwretrievalflags, dwtimeout, pszhashid, ppara, pbdata, cbdata, pptscontext, pptssigner, phstore) : -1;
#else
    (void)wszurl;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)pszhashid;
    (void)ppara;
    (void)pbdata;
    (void)cbdata;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetAsyncParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hasync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pszparamoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnfree = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetAsyncParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hasync, pszparamoid, pvparam, pfnfree) : -1;
#else
    (void)hasync;
    (void)pszparamoid;
    (void)pvparam;
    (void)pfnfree;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetHashParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetHashParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, dwparam, pbdata, dwflags) : -1;
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pkeyidentifier = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwpropid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pwszcomputername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetKeyIdentifierProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pkeyidentifier, dwpropid, dwflags, pwszcomputername, pvreserved, pvdata) : -1;
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetKeyParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetKeyParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwparam, pbdata, dwflags) : -1;
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszvaluename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwvaluetype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbvaluedata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbvaluedata = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetOIDFunctionValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pszoid, pwszvaluename, dwvaluetype, pbvaluedata, cbvaluedata) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)dwvaluetype;
    (void)pbvaluedata;
    (void)cbvaluedata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetProvParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetProvParam")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprov, dwparam, pbdata, dwflags) : -1;
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetProviderA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetProviderA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovname, dwprovtype) : -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetProviderExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetProviderExA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovname, dwprovtype, pdwreserved, dwflags) : -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetProviderExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdwreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetProviderExW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovname, dwprovtype, pdwreserved, dwflags) : -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSetProviderW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprovtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSetProviderW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovname, dwprovtype) : -1;
#else
    (void)pszprovname;
    (void)dwprovtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprovorncryptkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpszstructtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvstructinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psignaturealgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvhashauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignAndEncodeCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, lpszstructtype, pvstructinfo, psignaturealgorithm, pvhashauxinfo, pbencoded, pcbencoded) : -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbencoded;
    (void)pcbencoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psignpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pencryptpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crecipientcert = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgprecipientcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbtobesignedandencrypted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbtobesignedandencrypted = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbsignedandencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbsignedandencryptedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignAndEncryptMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psignpara, pencryptpara, crecipientcert, rgprecipientcert, pbtobesignedandencrypted, cbtobesignedandencrypted, pbsignedandencryptedblob, pcbsignedandencryptedblob) : -1;
#else
    (void)psignpara;
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobesignedandencrypted;
    (void)cbtobesignedandencrypted;
    (void)pbsignedandencryptedblob;
    (void)pcbsignedandencryptedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprovorncryptkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbencodedtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbencodedtobesigned = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* psignaturealgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvhashauxinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pbencodedtobesigned, cbencodedtobesigned, psignaturealgorithm, pvhashauxinfo, pbsignature, pcbsignature) : -1;
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pbencodedtobesigned;
    (void)cbencodedtobesigned;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbsignature;
    (void)pcbsignature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignHashA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwsiglen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignHashA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, dwkeyspec, szdescription, dwflags, pbsignature, pdwsiglen) : -1;
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignHashW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwsiglen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignHashW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, dwkeyspec, szdescription, dwflags, pbsignature, pdwsiglen) : -1;
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignMessage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psignpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fdetachedsignature = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ctobesigned = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgpbtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* rgcbtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignMessage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psignpara, fdetachedsignature, ctobesigned, rgpbtobesigned, rgcbtobesigned, pbsignedblob, pcbsignedblob) : -1;
#else
    (void)psignpara;
    (void)fdetachedsignature;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psignpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbtobesigned = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptSignMessageWithKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psignpara, pbtobesigned, cbtobesigned, pbsignedblob, pcbsignedblob) : -1;
#else
    (void)psignpara;
    (void)pbtobesigned;
    (void)cbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptStringToBinaryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cchstring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwskip = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptStringToBinaryA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszstring, cchstring, dwflags, pbbinary, pcbbinary, pdwskip, pdwflags) : -1;
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptStringToBinaryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cchstring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwskip = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pdwflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptStringToBinaryW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszstring, cchstring, dwflags, pbbinary, pcbbinary, pdwskip, pdwflags) : -1;
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUninstallCancelRetrieval")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pvreserved) : -1;
#else
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdefaultcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUninstallDefaultContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdefaultcontext, dwflags, pvreserved) : -1;
#else
    (void)hdefaultcontext;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUnprotectData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdatain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszdatadescr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* poptionalentropy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvreserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppromptstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pdataout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUnprotectData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdatain, ppszdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags, pdataout) : -1;
#else
    (void)pdatain;
    (void)ppszdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUnprotectMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdatain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbdatain = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUnprotectMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdatain, cbdatain, dwflags) : -1;
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUnregisterDefaultOIDFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pwszdll) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pwszdll;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwencodingtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszfuncname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUnregisterOIDFunction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwencodingtype, pszfuncname, pszoid) : -1;
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUnregisterOIDInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinfo) : -1;
#else
    (void)pinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poldsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszoldpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdwsuccesscount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdwfailurecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptUpdateProtectedState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poldsid, pwszoldpassword, dwflags, pdwsuccesscount, pdwfailurecount) : -1;
#else
    (void)poldsid;
    (void)pwszoldpassword;
    (void)dwflags;
    (void)pdwsuccesscount;
    (void)pdwfailurecount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbencoded = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppublickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyCertificateSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwcertencodingtype, pbencoded, cbencoded, ppublickey) : -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)ppublickey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hcryptprov = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwcertencodingtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsubjecttype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvsubject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwissuertype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvissuer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pvextra = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyCertificateSignatureEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptprov, dwcertencodingtype, dwsubjecttype, pvsubject, dwissuertype, pvissuer, dwflags, pvextra) : -1;
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)dwissuertype;
    (void)pvissuer;
    (void)dwflags;
    (void)pvextra;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phashpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbdetachedhashblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbdetachedhashblob = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t ctobehashed = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgpbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* rgcbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phashpara, pbdetachedhashblob, cbdetachedhashblob, ctobehashed, rgpbtobehashed, rgcbtobehashed, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)phashpara;
    (void)pbdetachedhashblob;
    (void)cbdetachedhashblob;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pverifypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsignerindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdetachedsignblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdetachedsignblob = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ctobesigned = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* rgpbtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* rgcbtobesigned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppsignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pverifypara, dwsignerindex, pbdetachedsignblob, cbdetachedsignblob, ctobesigned, rgpbtobesigned, rgcbtobesigned, ppsignercert) : -1;
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbdetachedsignblob;
    (void)cbdetachedsignblob;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)ppsignercert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phashpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbhashedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbhashedblob = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbtobehashed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcomputedhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyMessageHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phashpara, pbhashedblob, cbhashedblob, pbtobehashed, pcbtobehashed, pbcomputedhash, pcbcomputedhash) : -1;
#else
    (void)phashpara;
    (void)pbhashedblob;
    (void)cbhashedblob;
    (void)pbtobehashed;
    (void)pcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pverifypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwsignerindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsignedblob = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppsignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyMessageSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pverifypara, dwsignerindex, pbsignedblob, cbsignedblob, pbdecoded, pcbdecoded, ppsignercert) : -1;
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppsignercert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pverifypara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppublickeyinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbsignedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsignedblob = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbdecoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyMessageSignatureWithKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pverifypara, ppublickeyinfo, pbsignedblob, cbsignedblob, pbdecoded, pcbdecoded) : -1;
#else
    (void)pverifypara;
    (void)ppublickeyinfo;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifySignatureA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsiglen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t hpubkey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* szdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifySignatureA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pbsignature, dwsiglen, hpubkey, szdescription, dwflags) : -1;
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifySignatureW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hhash = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwsiglen = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t hpubkey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* szdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifySignatureW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hhash, pbsignature, dwsiglen, hpubkey, szdescription, dwflags) : -1;
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbtscontentinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbtscontentinfo = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* hadditionalstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pptscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pptssigner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* phstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptVerifyTimeStampSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbtscontentinfo, cbtscontentinfo, pbdata, cbdata, hadditionalstore, pptscontext, pptssigner, phstore) : -1;
#else
    (void)pbtscontentinfo;
    (void)cbtscontentinfo;
    (void)pbdata;
    (void)cbdata;
    (void)hadditionalstore;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlAddObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsignatureorobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cproperty = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlAddObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsignatureorobject, dwflags, rgproperty, cproperty, pencoded, ppobject) : -1;
#else
    (void)hsignatureorobject;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)ppobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml) : -1;
#else
    (void)hcryptxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlCreateReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* wszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* wszuri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* wsztype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdigestmethod = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ctransform = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* rgtransform = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* phreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlCreateReference")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, dwflags, wszid, wszuri, wsztype, pdigestmethod, ctransform, rgtransform, phreference) : -1;
#else
    (void)hcryptxml;
    (void)dwflags;
    (void)wszid;
    (void)wszuri;
    (void)wsztype;
    (void)pdigestmethod;
    (void)ctransform;
    (void)rgtransform;
    (void)phreference;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlDigestReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdataproviderin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlDigestReference")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hreference, dwflags, pdataproviderin) : -1;
#else
    (void)hreference;
    (void)dwflags;
    (void)pdataproviderin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dwcharset = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cproperty = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvcallbackstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfnwrite = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlEncode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, dwcharset, rgproperty, cproperty, pvcallbackstate, pfnwrite) : -1;
#else
    (void)hcryptxml;
    (void)dwcharset;
    (void)rgproperty;
    (void)cproperty;
    (void)pvcallbackstate;
    (void)pfnwrite;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwgroupid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvarg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnenumalginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlEnumAlgorithmInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwgroupid, dwflags, pvarg, pfnenumalginfo) : -1;
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumalginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwfindbytype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pvfindby = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwgroupid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlFindAlgorithmInfo")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwfindbytype, pvfindby, dwgroupid, dwflags) : NULL;
#else
    (void)dwfindbytype;
    (void)pvfindby;
    (void)dwgroupid;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pxmlalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppalginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetAlgorithmInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pxmlalgorithm, dwflags, ppalginfo) : -1;
#else
    (void)pxmlalgorithm;
    (void)dwflags;
    (void)ppalginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetDocContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, ppstruct) : -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetReference")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, ppstruct) : -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, ppstruct) : -1;
#else
    (void)hcryptxml;
    (void)ppstruct;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcryptxml, pstatus) : -1;
#else
    (void)hcryptxml;
    (void)pstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlGetTransforms")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppconfig) : -1;
#else
    (void)ppconfig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pkeyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlImportPublicKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pkeyvalue, phkey) : -1;
#else
    (void)dwflags;
    (void)pkeyvalue;
    (void)phkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cproperty = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phcryptxml = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlOpenToDecode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconfig, dwflags, rgproperty, cproperty, pencoded, phcryptxml) : -1;
#else
    (void)pconfig;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phcryptxml;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* wszid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cproperty = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pencoded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* phsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlOpenToEncode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pconfig, dwflags, wszid, rgproperty, cproperty, pencoded, phsignature) : -1;
#else
    (void)pconfig;
    (void)dwflags;
    (void)wszid;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phsignature;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbsecret = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlSetHMACSecret")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsignature, pbsecret, cbsecret) : -1;
#else
    (void)hsignature;
    (void)pbsecret;
    (void)cbsecret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlSign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t hkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t dwkeyinfospec = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvkeyinfospec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psignaturemethod = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcanonicalization = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlSign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsignature, hkey, dwkeyspec, dwflags, dwkeyinfospec, pvkeyinfospec, psignaturemethod, pcanonicalization) : -1;
#else
    (void)hsignature;
    (void)hkey;
    (void)dwkeyspec;
    (void)dwflags;
    (void)dwkeyinfospec;
    (void)pvkeyinfospec;
    (void)psignaturemethod;
    (void)pcanonicalization;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CryptXmlVerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsignature, hkey, dwflags) : -1;
#else
    (void)hsignature;
    (void)hkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_Decrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t foaep = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcboutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppoutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Decrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, foaep, cbindata, pindata, pcboutdata, ppoutdata) : -1;
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_Encrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t foaep = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcboutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppoutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Encrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, foaep, cbindata, pindata, pcboutdata, ppoutdata) : -1;
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_FindCertsByIssuer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertchains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcbcertchains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pccertchains = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbencodedissuername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbencodedissuername = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pwszpurpose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwkeyspec = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindCertsByIssuer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertchains, pcbcertchains, pccertchains, pbencodedissuername, cbencodedissuername, pwszpurpose, dwkeyspec) : -1;
#else
    (void)pcertchains;
    (void)pcbcertchains;
    (void)pccertchains;
    (void)pbencodedissuername;
    (void)cbencodedissuername;
    (void)pwszpurpose;
    (void)dwkeyspec;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_FreeToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pallocmemory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pallocmemory) : -1;
#else
    (void)pallocmemory;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GenerateDerivedKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cblabel = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* plabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbnonce = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pnonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t derivedkeylength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* algid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcbkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* ppkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GenerateDerivedKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cblabel, plabel, cbnonce, pnonce, derivedkeylength, offset, algid, pcbkey, ppkey) : -1;
#else
    (void)hcrypto;
    (void)cblabel;
    (void)plabel;
    (void)cbnonce;
    (void)pnonce;
    (void)derivedkeylength;
    (void)offset;
    (void)algid;
    (void)pcbkey;
    (void)ppkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAsymmetricEncryptionInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetBrowserToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwparamtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBrowserToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwparamtype, pparam, pcbtoken, pptoken) : -1;
#else
    (void)dwparamtype;
    (void)pparam;
    (void)pcbtoken;
    (void)pptoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetCipherInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCipherInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetHashInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetHashInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetKeyDerivationInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetKeyStorageInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetKeyStorageInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetKeyedHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsymmetriccrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pphhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetKeyedHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsymmetriccrypto, pphhash) : -1;
#else
    (void)hsymmetriccrypto;
    (void)pphhash;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetRngInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetRngInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetSChannelInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSChannelInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecretAgreementInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetSignatureInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppfunctiontable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSignatureInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszprovidername, pszalgid, ppfunctiontable, dwflags) : -1;
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_GetToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cpolicychain = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppolicychain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* securitytoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phprooftokencrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cpolicychain, ppolicychain, securitytoken, phprooftokencrypto) : -1;
#else
    (void)cpolicychain;
    (void)ppolicychain;
    (void)securitytoken;
    (void)phprooftokencrypto;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_HashCore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HashCore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbindata, pindata) : -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_HashFinal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppoutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HashFinal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata) : -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_ImportInformationCard_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImportInformationCard")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename) : -1;
#else
    (void)filename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_ManageCardSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ManageCardSpace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptCloseProtectionDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdescriptor) : -1;
#else
    (void)hdescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptCreateClaim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsubjectkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hauthoritykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwclaimtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbclaimblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbclaimblob = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptCreateClaim")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist, pbclaimblob, cbclaimblob, pcbresult, dwflags) : -1;
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwlegacykeyspec = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptCreatePersistedKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, phkey, pszalgid, pszkeyname, dwlegacykeyspec, dwflags) : -1;
#else
    (void)hprovider;
    (void)phkey;
    (void)pszalgid;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszdescriptorstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptCreateProtectionDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszdescriptorstring, dwflags, phdescriptor) : -1;
#else
    (void)pwszdescriptorstring;
    (void)dwflags;
    (void)phdescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptDecrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptDecrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptDeleteKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptDeleteKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwflags) : -1;
#else
    (void)hkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptDeriveKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsharedsecret = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pwszkdf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptDeriveKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags) : -1;
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptEncrypt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptEncrypt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pbinput, cbinput, ppaddinginfo, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwalgoperations = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdwalgcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppalglist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptEnumAlgorithms")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, dwalgoperations, pdwalgcount, ppalglist, dwflags) : -1;
#else
    (void)hprovider;
    (void)dwalgoperations;
    (void)pdwalgcount;
    (void)ppalglist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptEnumKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszscope = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppenumstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptEnumKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, pszscope, ppkeyname, ppenumstate, dwflags) : -1;
#else
    (void)hprovider;
    (void)pszscope;
    (void)ppkeyname;
    (void)ppenumstate;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwprovidercount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppproviderlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptEnumStorageProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwprovidercount, ppproviderlist, dwflags) : -1;
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptExportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hexportkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptExportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, hexportkey, pszblobtype, pparameterlist, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptFinalizeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptFinalizeKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, dwflags) : -1;
#else
    (void)hkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptFreeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvinput) : -1;
#else
    (void)pvinput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptFreeObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hobject = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptFreeObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject) : -1;
#else
    (void)hobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptGetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hobject = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptGetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, pszproperty, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmempara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwinfotype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppvinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptGetProtectionDescriptorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdescriptor, pmempara, dwinfotype, ppvinfo) : -1;
#else
    (void)hdescriptor;
    (void)pmempara;
    (void)dwinfotype;
    (void)ppvinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptImportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t himportkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptImportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, himportkey, pszblobtype, pparameterlist, phkey, pbdata, cbdata, dwflags) : -1;
#else
    (void)hprovider;
    (void)himportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)phkey;
    (void)pbdata;
    (void)cbdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptIsAlgSupported")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, pszalgid, dwflags) : -1;
#else
    (void)hprovider;
    (void)pszalgid;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptIsKeyHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey) : -1;
#else
    (void)hkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptKeyDerivation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbderivedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbderivedkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptKeyDerivation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pparameterlist, pbderivedkey, cbderivedkey, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptNotifyChangeKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, phevent, dwflags) : -1;
#else
    (void)hprovider;
    (void)phevent;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptOpenKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszkeyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlegacykeyspec = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptOpenKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprovider, phkey, pszkeyname, dwlegacykeyspec, dwflags) : -1;
#else
    (void)hprovider;
    (void)phkey;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptOpenStorageProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phprovider, pszprovidername, dwflags) : -1;
#else
    (void)phprovider;
    (void)pszprovidername;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptProtectSecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pmempara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppbprotectedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbprotectedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptProtectSecret")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdescriptor, dwflags, pbdata, cbdata, pmempara, hwnd, ppbprotectedblob, pcbprotectedblob) : -1;
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)pbdata;
    (void)cbdata;
    (void)pmempara;
    (void)hwnd;
    (void)ppbprotectedblob;
    (void)pcbprotectedblob;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszdescriptorstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcdescriptorstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptQueryProtectionDescriptorName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszname, pwszdescriptorstring, pcdescriptorstring, dwflags) : -1;
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)pcdescriptorstring;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszdescriptorstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptRegisterProtectionDescriptorName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszname, pwszdescriptorstring, dwflags) : -1;
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptSecretAgreement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hprivkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hpubkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phagreedsecret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptSecretAgreement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprivkey, hpubkey, phagreedsecret, dwflags) : -1;
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptSetProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hobject = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptSetProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, pszproperty, pbinput, cbinput, dwflags) : -1;
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptSignHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhashvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptSignHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, ppaddinginfo, pbhashvalue, cbhashvalue, pbsignature, cbsignature, pcbresult, dwflags) : -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptStreamClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptStreamClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstream) : -1;
#else
    (void)hstream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pstreaminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptStreamOpenToProtect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdescriptor, dwflags, hwnd, pstreaminfo, phstream) : -1;
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)hwnd;
    (void)pstreaminfo;
    (void)phstream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstreaminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstreaminfo, dwflags, hwnd, phstream) : -1;
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstreaminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotectEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstreaminfo, dwflags, hwnd, phstream) : -1;
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptStreamUpdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t cbdata = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    int32_t ffinal = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptStreamUpdate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstream, pbdata, cbdata, ffinal) : -1;
#else
    (void)hstream;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptTranslateHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t hlegacyprov = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t hlegacykey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t dwlegacykeyspec = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptTranslateHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phprovider, phkey, hlegacyprov, hlegacykey, dwlegacykeyspec, dwflags) : -1;
#else
    (void)phprovider;
    (void)phkey;
    (void)hlegacyprov;
    (void)hlegacykey;
    (void)dwlegacykeyspec;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbprotectedblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbprotectedblob = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pmempara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pcbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptUnprotectSecret")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phdescriptor, dwflags, pbprotectedblob, cbprotectedblob, pmempara, hwnd, ppbdata, pcbdata) : -1;
#else
    (void)phdescriptor;
    (void)dwflags;
    (void)pbprotectedblob;
    (void)cbprotectedblob;
    (void)pmempara;
    (void)hwnd;
    (void)ppbdata;
    (void)pcbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptVerifyClaim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsubjectkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hauthoritykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwclaimtype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbclaimblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbclaimblob = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptVerifyClaim")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist, pbclaimblob, cbclaimblob, poutput, dwflags) : -1;
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)poutput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_NCryptVerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* ppaddinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbhashvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NCryptVerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, ppaddinginfo, pbhashvalue, cbhashvalue, pbsignature, cbsignature, dwflags) : -1;
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_PFXExportCertStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PFXExportCertStore")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstore, ppfx, szpassword, dwflags) : -1;
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvpara = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PFXExportCertStoreEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstore, ppfx, szpassword, pvpara, dwflags) : -1;
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)pvpara;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_PFXImportCertStore_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppfx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PFXImportCertStore")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppfx, szpassword, dwflags) : NULL;
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_security_cryptography_PFXIsPFXBlob_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppfx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PFXIsPFXBlob")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppfx) : -1;
#else
    (void)ppfx;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_PFXVerifyPassword_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppfx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PFXVerifyPassword")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppfx, szpassword, dwflags) : -1;
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_ProcessPrng_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t cbdata = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ProcessPrng")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbdata, cbdata) : -1;
#else
    (void)pbdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbhash = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hashalgoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppsig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbhash, phash, hashalgoid, pcbsig, ppsig) : -1;
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)pcbsig;
    (void)ppsig;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerFreeSignerContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerFreeSignerContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psignercontext) : -1;
#else
    (void)psignercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerSign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psignatureinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pproviderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerSign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata) : -1;
#else
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerSignEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psignatureinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pproviderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerSignEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext) : -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerSignEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psignatureinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pproviderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwtimestampflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* psztimestampalgorithmoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* pcryptopolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* preserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerSignEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags, psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved) : -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerSignEx3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psignercert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psignatureinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pproviderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwtimestampflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* psztimestampalgorithmoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* pcryptopolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* pdigestsigninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    void* preserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerSignEx3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags, psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, pdigestsigninfo, preserved) : -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)pdigestsigninfo;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerTimeStamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerTimeStamp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psubjectinfo, pwszhttptimestamp, psrequest, psipdata) : -1;
#else
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerTimeStampEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerTimeStampEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, psubjectinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext) : -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerTimeStampEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwalgid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerTimeStampEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, psubjectinfo, pwszhttptimestamp, dwalgid, psrequest, psipdata, ppsignercontext) : -1;
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)dwalgid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SignerTimeStampEx3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psubjectinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwszhttptimestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszalgorithmoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psipdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppsignercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pcryptopolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* preserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SignerTimeStampEx3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, dwindex, psubjectinfo, pwszhttptimestamp, pszalgorithmoid, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved) : -1;
#else
    (void)dwflags;
    (void)dwindex;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)pszalgorithmoid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslChangeNotify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslChangeNotify")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, dwflags) : -1;
#else
    (void)hevent;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hhandshakehash = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* pszalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslComputeClientAuthHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, hhandshakehash, pszalgid, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pszalgid;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbrandoms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbrandoms = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslComputeEapKeyBlock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, pbrandoms, cbrandoms, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslComputeFinishedHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hhandshakehash = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslComputeFinishedHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, hhandshakehash, pboutput, cboutput, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslComputeSessionHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hhandshakehash = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslComputeSessionHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hhandshakehash, dwprotocol, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)dwprotocol;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phhandshakehash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszhashalgid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslCreateClientAuthHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, phhandshakehash, dwprotocol, dwciphersuite, pszhashalgid, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pszhashalgid;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phephemeralkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwkeytype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwkeybitlen = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pbparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbparams = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslCreateEphemeralKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, phephemeralkey, dwprotocol, dwciphersuite, dwkeytype, dwkeybitlen, pbparams, cbparams, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)phephemeralkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)dwkeybitlen;
    (void)pbparams;
    (void)cbparams;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phhandshakehash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslCreateHandshakeHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, phhandshakehash, dwprotocol, dwciphersuite, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslDecrementProviderReferenceCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider) : -1;
#else
    (void)hsslprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslDecryptPacket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t sequencenumber = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslDecryptPacket")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hkey, pbinput, cbinput, pboutput, cboutput, pcbresult, sequencenumber, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t htranscripthash = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phtranscripthash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslDuplicateTranscriptHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, htranscripthash, phtranscripthash, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)htranscripthash;
    (void)phtranscripthash;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslEncryptPacket_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t sequencenumber = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    uint32_t dwcontenttype = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEncryptPacket")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hkey, pbinput, cbinput, pboutput, cboutput, pcbresult, sequencenumber, dwcontenttype, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwcontenttype;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslEnumCipherSuites_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ppciphersuite = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppenumstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEnumCipherSuites")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, ppciphersuite, ppenumstate, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ppciphersuite = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppenumstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEnumCipherSuitesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, ppciphersuite, ppenumstate, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslEnumEccCurves_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pecccurvecount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppecccurve = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEnumEccCurves")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, pecccurvecount, ppecccurve, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)pecccurvecount;
    (void)ppecccurve;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdwprovidercount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppproviderlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslEnumProtocolProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdwprovidercount, ppproviderlist, dwflags) : -1;
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandBinderKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hearlykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phbinderkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandBinderKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hearlykey, phbinderkey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hearlykey;
    (void)phbinderkey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hbasekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hhashvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* phexportermasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandExporterMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hbasekey, hhashvalue, phexportermasterkey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phexportermasterkey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hresumptionmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbticketnonce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbticketnonce = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phpresharedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandPreSharedKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hresumptionmasterkey, pbticketnonce, cbticketnonce, phpresharedkey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hresumptionmasterkey;
    (void)pbticketnonce;
    (void)cbticketnonce;
    (void)phpresharedkey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hhashvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* phresumptionmasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandResumptionMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, hhashvalue, phresumptionmasterkey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhashvalue;
    (void)phresumptionmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hbasekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hhashvalue = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* phclienttraffickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phservertraffickey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandTrafficKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hbasekey, hhashvalue, phclienttraffickey, phservertraffickey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phclienttraffickey;
    (void)phservertraffickey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExpandWriteKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hbasetraffickey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phwritekey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExpandWriteKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hbasetraffickey, phwritekey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hbasetraffickey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hkey, pszblobtype, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* slabel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbrandoms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbrandoms = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pbcontextvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint16_t cbcontextvalue = static_cast<uint16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint16_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExportKeyingMaterial")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, slabel, pbrandoms, cbrandoms, pbcontextvalue, cbcontextvalue, pboutput, cboutput, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)slabel;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pbcontextvalue;
    (void)cbcontextvalue;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExtractEarlyKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hpresharedkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phearlykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExtractEarlyKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hpresharedkey, phearlykey, dwprotocol, dwciphersuite, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hpresharedkey;
    (void)phearlykey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hpublickey = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t hearlykey = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* phhandshakekey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExtractHandshakeKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, hpublickey, hearlykey, phhandshakekey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)hearlykey;
    (void)phhandshakekey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslExtractMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hhandshakekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phmasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslExtractMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hhandshakekey, phmasterkey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hhandshakekey;
    (void)phmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslFreeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvinput) : -1;
#else
    (void)pvinput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslFreeObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hobject = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslFreeObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobject, dwflags) : -1;
#else
    (void)hobject;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGenerateMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t hpublickey = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* phmasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGenerateMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, hpublickey, phmasterkey, dwprotocol, dwciphersuite, pparameterlist, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hpublickey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phpremasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGeneratePreMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hpublickey, phpremasterkey, dwprotocol, dwciphersuite, pparameterlist, pboutput, cboutput, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)phpremasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hmasterkey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phreadkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phwritekey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGenerateSessionKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hmasterkey, phreadkey, phwritekey, pparameterlist, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)phreadkey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwkeytype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szprfhash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetCipherSuitePRFHashAlgorithm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, szprfhash, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)szprfhash;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGetKeyProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hkey = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetKeyProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hkey, pszproperty, ppboutput, pcboutput, dwflags) : -1;
#else
    (void)hkey;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslGetProviderProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pszproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppenumstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslGetProviderProperty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, pszproperty, ppboutput, pcboutput, ppenumstate, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)ppenumstate;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslHashHandshake_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hhandshakehash = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslHashHandshake")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hhandshakehash, pbinput, cbinput, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslImportKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszblobtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbkeyblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbkeyblob = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslImportKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, phkey, pszblobtype, pbkeyblob, cbkeyblob, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)phkey;
    (void)pszblobtype;
    (void)pbkeyblob;
    (void)cbkeyblob;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslImportMasterKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* phmasterkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pparameterlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pbencryptedkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t cbencryptedkey = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslImportMasterKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, phmasterkey, dwprotocol, dwciphersuite, pparameterlist, pbencryptedkey, cbencryptedkey, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pbencryptedkey;
    (void)cbencryptedkey;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslIncrementProviderReferenceCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider) : -1;
#else
    (void)hsslprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslLookupCipherLengths_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwkeytype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcipherlengths = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbcipherlengths = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslLookupCipherLengths")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pcipherlengths, cbcipherlengths, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pcipherlengths;
    (void)cbcipherlengths;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dwprotocol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwciphersuite = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwkeytype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pciphersuite = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslLookupCipherSuiteInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pciphersuite, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pciphersuite;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslOpenPrivateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* phprivatekey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslOpenPrivateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, phprivatekey, pcertcontext, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)phprivatekey;
    (void)pcertcontext;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslOpenProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phsslprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslOpenProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phsslprovider, pszprovidername, dwflags) : -1;
#else
    (void)phsslprovider;
    (void)pszprovidername;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslSignHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hprivatekey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbhashvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslSignHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hprivatekey, pbhashvalue, cbhashvalue, pbsignature, cbsignature, pcbresult, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SslVerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hsslprovider = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hpublickey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pbhashvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbhashvalue = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pbsignature = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsignature = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SslVerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hsslprovider, hpublickey, pbhashvalue, cbhashvalue, pbsignature, cbsignature, dwflags) : -1;
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_SystemPrng_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbrandomdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t cbrandomdata = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SystemPrng")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbrandomdata, cbrandomdata) : -1;
#else
    (void)pbrandomdata;
    (void)cbrandomdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_TransformBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppoutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransformBlock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata) : -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_TransformFinalBlock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbindata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pindata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcboutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppoutdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransformFinalBlock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbindata, pindata, pcboutdata, ppoutdata) : -1;
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_VerifyHash_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcrypto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbhash = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hashalgoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbsig = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* psig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfverified = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifyHash")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcrypto, cbhash, phash, hashalgoid, cbsig, psig, pfverified) : -1;
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)cbsig;
    (void)psig;
    (void)pfverified;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_cryptography_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptAddContextFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptAddContextFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptConfigureContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptConfigureContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptCreateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptCreateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptCreateHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptCreateHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDecrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDecrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDeleteContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDeleteContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDeriveKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDeriveKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDestroyHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDestroyHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDestroyKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDestroyKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDestroySecret", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDestroySecret_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDuplicateHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDuplicateHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptDuplicateKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptDuplicateKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEncrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEncrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumContexts", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumContexts_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptExportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptExportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptFinishHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptFinishHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptGenRandom", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptGenRandom_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptGetProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptGetProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptHashData", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptHashData_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptImportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptImportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptImportKeyPair", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptImportKeyPair_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptKeyDerivation", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptKeyDerivation_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptRegisterProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptRegisterProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptResolveProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptResolveProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptSecretAgreement", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptSecretAgreement_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptSetProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptSetProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptSignHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptSignHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_BCryptVerifySignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_BCryptVerifySignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAddStoreToCollection", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAddStoreToCollection_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertAlgIdToOID", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertAlgIdToOID_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCloseStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCloseStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCompareCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCompareCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCompareCertificateName", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCompareCertificateName_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertControlStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertControlStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateCRLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateCRLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateCTLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateCTLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateCertificateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateCertificateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertDuplicateStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertDuplicateStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumSystemStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumSystemStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindAttribute", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindAttribute_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindCRLInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindCRLInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindCTLInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindCTLInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindCertificateInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindCertificateInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindChainInStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindChainInStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindExtension", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindExtension_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindRDNAttr", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindRDNAttr_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCRLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCRLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCTLContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCTLContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCertificateChain", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCertificateChain_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeCertificateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeCertificateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetCRLFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetCRLFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetCertificateChain", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetCertificateChain_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetNameStringA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetNameStringA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetNameStringW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetNameStringW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetStoreProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetStoreProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertGetValidUsages", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertGetValidUsages_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertIsWeakHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertIsWeakHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertNameToStrA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertNameToStrA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertNameToStrW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertNameToStrW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertOIDToAlgId", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertOIDToAlgId_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertOpenStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertOpenStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRDNValueToStrA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRDNValueToStrA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRDNValueToStrW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRDNValueToStrW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRegisterSystemStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRegisterSystemStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSaveStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSaveStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSelectCertificateChains", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSelectCertificateChains_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertSetStoreProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertSetStoreProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertStrToNameA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertStrToNameA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertStrToNameW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertStrToNameW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyRevocation", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyRevocation_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CloseCryptoHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CloseCryptoHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptAcquireContextA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptAcquireContextA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptAcquireContextW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptAcquireContextW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptBinaryToStringA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptBinaryToStringA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptBinaryToStringW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptBinaryToStringW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptContextAddRef", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptContextAddRef_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptCreateHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptCreateHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecodeMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecodeMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecodeObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecodeObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDecryptMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDecryptMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDeriveKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDeriveKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDestroyHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDestroyHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDestroyKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDestroyKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDuplicateHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDuplicateHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptDuplicateKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptDuplicateKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEncodeObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEncodeObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEncrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEncrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEncryptMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEncryptMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumProvidersA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumProvidersA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptEnumProvidersW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptEnumProvidersW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptExportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptExportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptExportPKCS8", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptExportPKCS8_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptFindLocalizedName", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptFindLocalizedName_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptFindOIDInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptFindOIDInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptFormatObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptFormatObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGenKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGenKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGenRandom", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGenRandom_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetAsyncParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetAsyncParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetHashParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetHashParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetKeyParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetKeyParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetObjectUrl", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetObjectUrl_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetProvParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetProvParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptGetUserKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptGetUserKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashCertificate2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashCertificate2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashData", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashData_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashSessionKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashSessionKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptHashToBeSigned", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptHashToBeSigned_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptImportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptImportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMemAlloc", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMemAlloc_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMemFree", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMemFree_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMemRealloc", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMemRealloc_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgControl", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgControl_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgCountersign", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgCountersign_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgDuplicate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgDuplicate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgGetParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgGetParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgSignCTL", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgSignCTL_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgUpdate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgUpdate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptProtectData", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptProtectData_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptProtectMemory", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptProtectMemory_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptQueryObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptQueryObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptReleaseContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptReleaseContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetAsyncParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetAsyncParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetHashParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetHashParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetKeyParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetKeyParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetProvParam", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetProvParam_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetProviderA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetProviderA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetProviderExA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetProviderExA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetProviderExW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetProviderExW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSetProviderW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSetProviderW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignHashA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignHashA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignHashW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignHashW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignMessage", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignMessage_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptStringToBinaryA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptStringToBinaryA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptStringToBinaryW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptStringToBinaryW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUnprotectData", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUnprotectData_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUnprotectMemory", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUnprotectMemory_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifySignatureA", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifySignatureA_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifySignatureW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifySignatureW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlAddObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlAddObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlCreateReference", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlCreateReference_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlDigestReference", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlDigestReference_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlEncode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlEncode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetReference", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetReference_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetSignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetSignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetStatus", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetStatus_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlSign", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlSign_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_Decrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_Decrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_Encrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_Encrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_FindCertsByIssuer", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_FindCertsByIssuer_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_FreeToken", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_FreeToken_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GenerateDerivedKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GenerateDerivedKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetBrowserToken", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetBrowserToken_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetCipherInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetCipherInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetHashInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetHashInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetKeyStorageInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetKeyStorageInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetKeyedHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetKeyedHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetRngInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetRngInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetSChannelInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetSChannelInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetSignatureInterface", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetSignatureInterface_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_GetToken", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_GetToken_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_HashCore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_HashCore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_HashFinal", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_HashFinal_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_ImportInformationCard", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_ImportInformationCard_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_ManageCardSpace", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_ManageCardSpace_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptCreateClaim", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptCreateClaim_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptDecrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptDecrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptDeleteKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptDeleteKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptDeriveKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptDeriveKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptEncrypt", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptEncrypt_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptEnumKeys", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptEnumKeys_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptExportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptExportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptFinalizeKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptFinalizeKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptFreeObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptFreeObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptGetProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptGetProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptImportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptImportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptKeyDerivation", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptKeyDerivation_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptOpenKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptOpenKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptProtectSecret", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptProtectSecret_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptSecretAgreement", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptSecretAgreement_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptSetProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptSetProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptSignHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptSignHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptStreamClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptStreamClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptStreamUpdate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptStreamUpdate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptTranslateHandle", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptTranslateHandle_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptVerifyClaim", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptVerifyClaim_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_NCryptVerifySignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_NCryptVerifySignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_PFXExportCertStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_PFXExportCertStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_PFXImportCertStore", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_PFXImportCertStore_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_PFXIsPFXBlob", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_PFXIsPFXBlob_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_PFXVerifyPassword", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_PFXVerifyPassword_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_ProcessPrng", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_ProcessPrng_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignError", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignError_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerFreeSignerContext", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerFreeSignerContext_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerSign", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerSign_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerSignEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerSignEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerSignEx2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerSignEx2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerSignEx3", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerSignEx3_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerTimeStamp", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerTimeStamp_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerTimeStampEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerTimeStampEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerTimeStampEx2", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerTimeStampEx2_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SignerTimeStampEx3", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SignerTimeStampEx3_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslChangeNotify", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslChangeNotify_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslComputeFinishedHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslComputeFinishedHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslComputeSessionHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslComputeSessionHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslDecryptPacket", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslDecryptPacket_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslEncryptPacket", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslEncryptPacket_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslEnumCipherSuites", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslEnumCipherSuites_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslEnumEccCurves", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslEnumEccCurves_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandBinderKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandBinderKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExpandWriteKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExpandWriteKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExtractEarlyKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExtractEarlyKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslExtractMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslExtractMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslFreeObject", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslFreeObject_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGenerateMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGenerateMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGetKeyProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGetKeyProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslGetProviderProperty", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslGetProviderProperty_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslHashHandshake", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslHashHandshake_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslImportKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslImportKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslImportMasterKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslImportMasterKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslLookupCipherLengths", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslLookupCipherLengths_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslOpenPrivateKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslOpenPrivateKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslOpenProvider", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslOpenProvider_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslSignHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslSignHash_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SslVerifySignature", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SslVerifySignature_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_SystemPrng", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_SystemPrng_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_TransformBlock", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_TransformBlock_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_TransformFinalBlock", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_TransformFinalBlock_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_VerifyHash", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_VerifyHash_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_cryptography_napi, nullptr };
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
